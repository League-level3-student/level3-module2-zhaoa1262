package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	//1. Write a static method called intArraySorted. 
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise
	static boolean intArraySorted(int[] integers) {
		int integer = integers[0];
		boolean bob;
		for(int i = 0; i < integers.length; i++) {
		if(integer<integers[i]) {
			integer = integers[i];
			bob = true;
		}
		else {
			bob = false;
		}
		}
		if(bob = true) {
			return true;
		}
		else {
			return false;
		}
	}

	
	//2. Write a static method called doubleArraySorted. 
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise
	static boolean doubleArraySorted(double[] doubles) {
		double doublei = doubles[0];
		boolean bob;
		for(int i = 0; i < doubles.length; i++) {
		if(doublei<doubles[i]) {
			doublei = doubles[i];
			bob = true;
		}
		else {
			bob = false;
		}
		}
		if(bob = true) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)
	static boolean charArraySorted(char[] chars) {
		char charr = chars[0];
		boolean bob;
		for(int i = 0; i < chars.length; i++) {
			if(charr<chars[i]) {
				charr = chars[i];
				bob = true;
			}
			else {
				bob = false;
			}
			}
			if(bob = true) {
				return true;
			}
			else {
				return false;
			}
	}
	
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)
	static boolean stringArraySorted(String[] strings) {
		String string = strings[0];
		boolean bob;
		for(int i = 0; i < strings.length; i++) {
			if(string.compareTo(strings[i])) {
				string = strings[i];
				bob = true;
			}
			else {
				bob = false;
			}
			}
			if(bob = true) {
				return true;
			}
			else {
				return false;
			}
	}

}
