package Collections_in_Java;

import java.util.HashMap;

public class Hashmap_Demo {

	public static void main(String[] args) {

		//declaration
		//HashMap hm=new HashMap();
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		//Adding pairs
		hm.put(101, "John");
		hm.put(102, "Scott");
		hm.put(103, "Mary");
		hm.put(104, "Scott");
		hm.put(102, "David");
		
		System.out.println(hm); //{101=John, 102=David, 103=Mary, 104=Scott}
		
		//Size of hashmap
		System.out.println("Size of Hashmap:"+hm.size());
		
		//remove pair
		hm.remove(103);
		System.out.println("remove pair:"+hm); //remove paie:{101=John, 102=David, 104=Scott}
		
		//access value of the key
		System.out.println(hm.get(102)); //102 is key //David
		
		//get all the keys from hashmap
		System.out.println(hm.keySet()); //[101, 102, 104]
		System.out.println(hm.values()); //[John, David, Scott]
		System.out.println(hm.entrySet()); //[101=John, 102=David, 104=Scott] 
		
		
		
	}

}
