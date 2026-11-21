package Array;

/*
1)Declare an array
2)add values into array
3)Find size of an array
4)read single file from an array
5)read multiple values from an array
*/
 

public class Single_Dimensional_Array {

	public static void main(String[] args) {

		//1)Declare an array
		
		//approach 1
	/*	int a[]=new int[5];
		
		
		//2)add values into array
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		*/
		
		//approach 2
		//1)Declare an array
	    //2)add values into array
		int a[]= {100,200,300,400,500};
		
		//3)Find size of an array
		System.out.println("Lenth of an array:"+ a.length);		
		
		//4)read single file from an array
		System.out.println(a[4]);  //here 4 is index
		
		//5)read multiple values from an array
		//Normal for loop
		//initialization, condition and inc/dec
		
		for (int i=0; i<=a.length-1; i++)     //i<=4  i<5  i<=a.length-1  i<a.length
		{
			System.out.println(a[i]);    //100 200 300 400 500
		}
		
		
		
	}

}
