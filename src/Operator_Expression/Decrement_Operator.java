package Operator_Expression;

public class Decrement_Operator {

	public static void main(String[] args) {

		//case 
		/*
		int a=10;
		
		a--;   //a=a-1;	
		System.out.println(a);//9
		
	*/
		//Case 1 - Post Decrement
		/*int a=100;
		
		int res=a--;
		System.out.println(res);//100
		System.out.println(a);//99;*/
		
		//Case 2 - Pre Decrement
				int a=100;
				
				int res=--a;
				System.out.println(res);//99
				System.out.println(a);//99;
	}

}
