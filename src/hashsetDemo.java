import java.util.HashSet;
import java.util.Iterator;

public class hashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//list accepts duplicate values but set will not accept duplicate values
		//list guarantee sequential order while set does not have sequential order
		HashSet<String> hs= new HashSet<String>();
		hs.add("mowa");
		hs.add("jeddi");
		hs.add("kanna");
		hs.add("hero");
		hs.add("actor");
		System.out.println(hs);
		System.out.println(hs.remove("actor"));
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		Iterator<String> i = hs.iterator();
		//System.out.println(i.next());
		//System.out.println(i.next());
		while(i.hasNext())
		{
		
			System.out.println(i.next());
	}

}
}
