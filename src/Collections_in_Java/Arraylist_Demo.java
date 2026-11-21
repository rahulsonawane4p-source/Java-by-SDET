package Collections_in_Java;

import java.util.ArrayList;

public class Arraylist_Demo {

	public static void main(String[] args) {

		//Declaration of Arraylist Variable
		//Hetrogenous Data
		ArrayList mylist=new ArrayList();
		//List mylist=new ArrayList();
		
		//Homogenous Data
		//ArrayList <String>mylist=new ArrayList<String>();
		
		
		//Adding Data into ArrayList
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		//to find Size of ArrayList
		System.out.println("Size of Arraylist:"+mylist.size()); //Size of Arraylist:8
		
		//Printing ArrayList
		System.out.println("Printing data from arraylist:"+mylist); //Printing data from arraylist:[100, 10.5, welcome, A, true, 100, null, null]
		
		//remove element from arraylist
		mylist.remove(5); //here 5 is index of element which count from 0
		System.out.println("After removing:"+mylist); //After removing:[10.5, welcome, A, true, null, null]
		
		//insert element in middle of Arraylist by using index and value
		mylist.add(2,"java");
		System.out.println("After insertion:"+mylist); //After insertion:[100, 10.5, java, welcome, A, true, null, null]
		
		//Modify the element in Arraylist (modify/replace/change)
		mylist.set(2, "python");
		System.out.println("After replacing:"+mylist); //After replacing:[100, 10.5, python, welcome, A, true, null, null]
		
		//Access specific element from arraylist
		System.out.println(mylist.get(3)); //welcome
		
		//Reading all the elements from arraylist
		
		//using normal for loop
		
		for (int i=0; i<=mylist.size()-1; i++)
		{
			System.out.println(mylist.get(i));
		}
		
		//remove multiple elements from arraylist
//		ArrayList mylist2=new Arraylist ();
//		mylist2.add(100);
//		mylist2.add("welcome");
//		mylist.removeAll(mylist2);
//		System.out.println("After removing multiple element:"+mylist2);
//		
		//remove all elements/clear
		mylist.clear();
		System.out.println(mylist.isEmpty());


		
	}

}
