
public class Corejava1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variables//
		int num= 12;
		String s = "capgemini";
		char a = 'A';
		double dec= 5.7;
		boolean mypath = true;
		
		System.out.println(mypath);
		System.out.println(s);
		System.out.println(dec);
		
		//Arrays//
		int[] arr = {1,2,3,4,5,7};
		System.out.println(arr[0]);	
		
		int[] arr2 = {23,45,6,7,89,90,14};
		for(int i=2; i<arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
		
		String[] name = {"alli", "pilli", "jalli"};
		for(int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		for( String j: name)
		{
			System.out.println(j);
		}
			
		//multiple of 2 code
		int[] arr3 = {1,2,3,4,5,67,8,98,78,56,53};
		for(int i=0; i<arr3.length; i++)
		{
			if(arr3[i] % 2 == 0)
			{
				System.out.println(arr3[i]);
			}
			else
			{
				System.out.println(arr3[i] + "is not multiple of 2");
			}
			
		}
			
		//Array List
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
