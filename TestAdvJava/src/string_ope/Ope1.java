package string_ope;

public class Ope1 {
	public static void main(String[] args) {
		String myStr = "Hello";
		char result = myStr.charAt(0);
		System.out.println(result);

		System.out.println("************************");

		// Return the Unicode of the first character in a string (the Unicode value of
		// "H" is 72)
		String str1 = "Hello";
		int res = str1.codePointAt(2);
		System.out.println(res);

		System.out.println("************************");

		// Return the Unicode of the before character of the given string (the Unicode
		// value of
		// "H" is 72):

		String m1 = "Hello";
		int r1 = m1.codePointBefore(1);
		System.out.println(r1);

		System.out.println("************************");

		// Compare two strings:
		// The compareTo() method compares two strings lexicographically.
		// The comparison is based on the Unicode value of each character in the
		// strings.

		String myStr1 = "Hello";
		String myStr2 = "Hello";
		System.out.println(myStr1.compareTo(myStr2)); // Returns 0 because they are equal
		System.out.println(myStr1.compareToIgnoreCase(myStr2));

		System.out.println("************************");

		// Concatenate two strings:

		String firstName = "John ";
		String lastName = "Doe";
		System.out.println(firstName.concat(lastName));

		System.out.println("************************");

		// Find out if a string contains a sequence of characters:

		String myStr3 = "Hello";
		System.out.println(myStr3.contains("Hel")); // true
		System.out.println(myStr3.contains("e")); // true
		System.out.println(myStr3.contains("Hi")); // false

		System.out.println("************************");

		// The contentEquals() method searches a string to find out if it contains the
		// exact same sequence of characters in the specified string or StringBuffer.
		// Returns true if the characters exist and false if not.
		String myStr4 = "Hello";
		System.out.println(myStr4.contentEquals("Hello")); // true
		System.out.println(myStr4.contentEquals("e")); // false
		System.out.println(myStr4.contentEquals("Hi")); // false

		System.out.println("************************");

		// The copyValueOf() method returns a String that represents the characters of a
		// char array.
		// This method returns a new String array and copies the characters into it.
		char[] myStr5 = { 'H', 'e', 'l', 'l', 'o' };
		String myStr6 = "";
		myStr6 = myStr6.copyValueOf(myStr5, 0, 5);
		System.out.println("Returned String: " + myStr6);

		System.out.println("************************");

		// The endsWith() method checks whether a string ends with the specified
		// character(s).
		// Tip: Use the startsWith() method to check whether a string starts with the
		// specified character(s).

		String myStr7 = "Hello";
		System.out.println(myStr7.endsWith("Hel")); // false
		System.out.println(myStr7.endsWith("llo")); // true
		System.out.println(myStr7.endsWith("o")); // true

		System.out.println("************************");

		// The equals() method compares two strings, and returns true if the strings are
		// equal, and false if not.
		// Tip: Use the compareTo() method to compare two strings lexicographically.
		String myStr11 = "Hello";
		String myStr22 = "Hello";
		String myStr33 = "Another String";
		System.out.println(myStr11.equals(myStr22)); // Returns true because they are equal
		System.out.println(myStr11.equals(myStr33)); // false

		System.out.println("************************");
		
		// The equalsIgnoreCase() method compares two strings, ignoring lower case and
		// upper case differences.

		String myStr111 = "Hello";
		String myStr222 = "HELLO";
		String myStr333 = "Another String";
		System.out.println(myStr111.equalsIgnoreCase(myStr222)); // true
		System.out.println(myStr111.equalsIgnoreCase(myStr333)); // false
		
		System.out.println("************************");
	}
}
