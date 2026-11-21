package Condition_Statement;

public class Largest_Of_3_Numbers {
	
/*
 a>b and a>c ---a is largest number
 b>a and b>b ---b is largest number
 c>a and c>b ---c is largest number 
 */

	public static void main(String[] args) {

		int a=100, b=200, c=30;
		
		if(a>b && a>c)
		{
			System.out.println("a is largest number"+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("b is largest number"+b);
		}
		else
		{
			System.out.println("c is largest number"+c);
		}
		
		
		
	}

}
