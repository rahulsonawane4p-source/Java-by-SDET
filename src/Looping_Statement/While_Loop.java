package Looping_Statement;

public class While_Loop {

	public static void main(String[] args) {
		
		//Example 1 - Print 1 to 10 numbers

		/*int i=1;       //Initialization(where to start)
		
		while(i<=10)   //condition(how many times)
		{
			System.out.println(i);
			i++;                  //Incrementation
		}
		*/
		
		
		//Example 2 - print Hello message 10 times
		
		/*int i=1;
		
		while(i<=10)
		{
			System.out.println("Hello");
			i++;
		}
		*/
		
		//Example 3 
		
		//Approach 1- print even numbers between 1 to 10 // 2 4 6 8 10 Starting point is 2
		
		/*int i=2;   //initialization
		 
		while(i<=10)  //condition
		{
			System.out.println(i);
			i=i+2;    //incrementation
		}
		*/
		
		//Approach 2
		
		/*int i=2;   //initialization
		 
		while(i<=10)  //condition
		{
			if(i%2==0)
			System.out.println(i);
			i++;    //incrementation
		}
		*/
		
		//Example 4  - 1........10
		/*
		 1 odd
		 2 even
		 3 odd
		 4 even
		 5 odd
		 6 even
		 -----
		 10 even
		 */
		
		
		/* int i=1;
		 while(i<=10)
		 {
			 if(i%2==0)
			 {
			 System.out.println(i + "Even");
			 }
			 else
			 {
				 System.out.println(i + "Odd");
			 }
			 i++;
		 }
		*/
		
		//Example 5 - print 10..................1
		
		int i=10;
		while(i>=1)
		{
			System.out.println(i);
			i--;
		}
		
		
		
	}

}
