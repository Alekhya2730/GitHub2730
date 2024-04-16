import java.util.ArrayList;

public class arraylistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al= new ArrayList<String>();
		al.add("mowa");
		al.add("jeddi");
		al.add("rodda");
		al.add(3,"student");
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		System.out.println(al.contains("student"));
		System.out.println(al.indexOf("mowa"));
		System.out.println(al.get(2));
		System.out.println(al.isEmpty());
		System.out.println(al.size());
	}

}
