package _99_extra.recursion_practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RecursionMath {
	
	public static int recursiveMultiplication(int number, int times) {
		//2. if times is 1 
			//3. return number 
		if(times == 1) {
			return number;
		} else {
			return number + recursiveMultiplication(number, times-1);
		}
		//4. else return number + recursionMultiplication(number, times-1)
		
	}
	
	//6. Try this one on your own! 
	//Hint: if numberToDevideBy is bigger than number, you can't divide anymore
	
	public static int recursiveDivision(int number, int numberToDivideBy) {
		if(numberToDivideBy>number) {
			return number;
		} else {
			return number / recursiveDivision(number, numberToDivideBy-1);
		}
		
	}
	
	
	//8. Try this one on your own!
	public static int recursivePower(int number, int power) {
		if(power == 1) {
			return number;
		} else {
			return (int) Math.pow(number, power-1);
		}
		
	}
	
	
	
	@Test
	void testMultiplication() {
		assertEquals(12, recursiveMultiplication(3, 4));
		//1  Add more JUnit tests like the one above to test your method
		assertEquals(-6, recursiveMultiplication(-1, 6));
		assertEquals(6, recursiveMultiplication(1, 6));
	}
	
	
	@Test
	void testDivision() {
		//5  Add JUnit tests to test your method
		assertEquals(0, recursiveDivision(-3, 1));
		assertEquals(3, recursiveDivision(6, 2));
		assertEquals(3, recursiveDivision(12, 4));
	}
	
	
	@Test 
	void testPower() {
		//7  Add JUnit tests to test your method
		assertEquals(0, recursivePower(-3, 1));
		assertEquals(3, recursivePower(6, 2));
		assertEquals(3, recursivePower(3, 4));
	
	}
	
}
