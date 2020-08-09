package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {
	
	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] array = {"bob", "joe", "blowhorn", "lard", "touche"};
		
		assertEquals(1, _00_LinearSearch.linearSearch(array, "joe"));
		assertEquals(4, _00_LinearSearch.linearSearch(array, "touche"));
		assertEquals(-1, _00_LinearSearch.linearSearch(array, "turd"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] array = {1, 2, 3, 4, 5};
		
		assertEquals(2, _01_BinarySearch.binarySearch(array, 0, 4, 3));
		assertEquals(4, _01_BinarySearch.binarySearch(array, 0, 4, 5));
		assertEquals(-1, _01_BinarySearch.binarySearch(array, 0, 4, 600));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] array = {0, 6, 12, 18, 24, 30, 36};
		
		assertEquals(3, _02_InterpolationSearch.interpolationSearch(array, 18));
		assertEquals(6, _02_InterpolationSearch.interpolationSearch(array, 36));
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(array, 600));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] array = {1, 2, 3, 4, 5, 6};
		
		assertEquals(3, _03_ExponentialSearch.exponentialSearch(array, 4));
		assertEquals(5, _03_ExponentialSearch.exponentialSearch(array, 6));
		assertEquals(-1, _03_ExponentialSearch.exponentialSearch(array, 600));
	}
}
