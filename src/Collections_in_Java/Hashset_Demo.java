package Collections_in_Java;
import java.util.HashSet;

public class Hashset_Demo {

	public static void main(String[] args) {

		//Declaration
		HashSet myset=new HashSet();
		
		//adding elements in hashset
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add(true);
		myset.add('A');
		myset.add(null);
		myset.add(null);
		
		System.out.println(myset);

		
	}

}
