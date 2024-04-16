import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "you");
		hm.put(1, "me");
		hm.put(42, "we");
		hm.put(3, "they");
		//System.out.println(hm.get(42));
		Set sn = hm.entrySet();
		Iterator it = sn.iterator();
		//i.q: create hash  table and pass table to set collection and print
		//key and value separately using iterator
		while(it.hasNext())
		{
			System.out.println(it.next());
			//it does not print key and value as it is not mapped
			//System.out.println(it.getKey());-gives an error
			//System.out.println(it.getValue());--gives an error
			
			Map.Entry mp=(Map.Entry)it.next();
			//it print key and value as it is mapped
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
			
		}
	}

}
