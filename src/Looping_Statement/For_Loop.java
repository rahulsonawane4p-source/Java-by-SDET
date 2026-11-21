package Looping_Statement;

public class For_Loop {

	public static void main(String[] args) {

		//Example 1
		
		/*for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}*/
		
		
		//Example 2  1----10 Even Numbers
		/*for (int i=2; i<=10; i+=2)
		{
			System.out.println(i);
		}*/
		
		//Example 3 - 1-----10 even and odd
		/*for(int i=1; i<=10; i++)
		{
			if(i%2==0)
			{
				System.out.println(i + "Even");
			}
			else
			{
				System.out.println(i + "Odd");
			}
		}*/
		
		
		//Example 4 -  10 to 1 Descending order
		
		for(int i=10; i>=0; i--)
		{
			System.out.println(i);
		}
		
		
		
		
		
	}

}
