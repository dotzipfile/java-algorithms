package tester;

import recursion.Euclid;
import recursion.Factorial;
import sort.Quicksort;

public class Test {

	public static void main(String[] args) {
		// Testing Quicksort
		System.out.println("Quicksort");
		int[] unsorted = {3, 2, 5, 6, 7, 21, 2, 6, 75, 34, 9, 2, 5, 77, 27, 83, 56, 71, 90};
		int[] sorted;
		
		Quicksort qs = new Quicksort();
		
		sorted = qs.sort(unsorted);
		
		qs.printArray(sorted);
		
		// Testing Factorial
		int num = 5;
		Factorial factorial = new Factorial();
		System.out.println("Factorial");
		System.out.println(factorial.computeFactorial(num) + "\n");
		
		// Testing Euclid (greatest common divisor)
		Euclid euclid = new Euclid();
		System.out.println("Euclid");
		System.out.println(euclid.gcd(4, 6) + "\n");
		
		System.out.println("Done");
	}

}
