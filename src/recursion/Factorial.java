package recursion;

public class Factorial {

	public long computeFactorial(int n) {
		
		// computeFactorial is called until n == 1
		if(n == 1) {
			return 1;
		}
		
		// Return values are multiplied together
		return n * computeFactorial(n - 1);
	}
	
}
