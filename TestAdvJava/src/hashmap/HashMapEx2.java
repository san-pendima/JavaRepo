package hashmap;
//Java program to demonstrate the
//HashMap(Map map) Constructor

import java.util.HashMap;
import java.util.Map;

public class HashMapEx2 {
	public static void main(String args[]) {
		// No need to mention the
		// Generic type twice
		Map<Integer, String> hm1 = new HashMap<>();

		// Add Elements using put method
		hm1.put(1, "one");
		hm1.put(2, "two");
		hm1.put(3, "three");

		// Initialization of a HashMap
		// using Generics
		HashMap<Integer, String> hm2 = new HashMap<Integer, String>(hm1);

		System.out.println("Mappings of HashMap hm1 are : " + hm1);

		System.out.println("Mapping of HashMap hm2 are : " + hm2);
	}
}
