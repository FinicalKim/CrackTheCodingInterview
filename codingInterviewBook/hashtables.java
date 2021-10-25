package codingInterviewBook;

import java.util.Hashtable;

public class hashtables {
	
	

	public static void main(String[] args) {
		
		Hashtable<String, Integer> ht = new Hashtable<String , Integer>();
			// ht.put(key, value);
		ht.put("one", 1);
		ht.put("two", 2);
		ht.put("three", 3);
		
		Integer n = ht.get("two");	// searches table to find key "two" then assigns value to n
		
		
		if (n != null) {	// in n does not equal null go inside
			System.out.println("two, " + n);
		}
		
		// ht.clear(); *empties the hashtable*
		
		System.out.println(ht.containsValue(n));
		
	}

}
