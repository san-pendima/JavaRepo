package hashmap;

//Java Program to Add Elements to a List

//Importing all utility classes
import java.util.*;

//Main class
class ListEx1 {

	// Main driver method
	public static void main(String args[]) {
		// Creating an object of List interface,
		// implemented by ArrayList class
		List<String> al = new ArrayList<>();

		// Adding elements to object of List interface
		// Custom elements
		al.add("One");
		al.add("Two");
		al.add(1, "Three");

		// Print all the elements inside the
		// List interface object
		System.out.println(al);
	}
}
