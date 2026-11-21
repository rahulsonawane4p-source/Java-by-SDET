package Operator_Expression;

public class Increment_Operator {

	public static void main(String[] args) {

		
		// ++ is called Increment Operator
		
		//Case 1
		
		/*int a=10;
		System.out.println(a);
		
		a++;     //a=a+1;    a++ is equal to a=a+1
		System.out.println(a);*/
		
		//Case 2 - post increment
		
		/*int a=10;
		int res=a++;  //post increment ------- First Assignment will happen then Increment will happen
		System.out.println(res);//10
		System.out.println(a);//11
		*/
		
		//Case3 - Pre Increment
		
		int a=10;
		int res=++a;  //pre increment--------- First Increment will happen then Assignment will happen
		System.out.println(res);//11
		System.out.println(a);//11

		
		
		
		
	}

}
