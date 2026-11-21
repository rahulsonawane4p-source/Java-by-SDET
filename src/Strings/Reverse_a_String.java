package Strings;

public class Reverse_a_String {

	public static void main(String[] args) {

		//Approach 1
		
		/*String s="welcome";
		String rev="";
		
		for(int i=6; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);*/
		
		//Approach 2
		/*StringBuffer s=new StringBuffer("Riya");
		System.out.println("Reverse String is:"+s.reverse());*/
		
		//Approach 3 
		StringBuilder s = new StringBuilder("welcome");
		System.out.println("Reverse string is:"+s.reverse());
	}

}
