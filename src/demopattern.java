
public class demopattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		for(int i=1; i<=3; i++)	{
			for (int j=1; j<=i; j++){
				System.out.print(n+" ");
				n=n+3;
			}
			System.out.println();
		}
			

	}

}
