package recursion;

public class Euclid {

	public int gcd(int p, int q) {
		// If q is 0, p is the greatest common divisor 
		if(q == 0) {
			return p;
		} else {
			// Call function again
			return gcd(q, p % q);
		}
	}
	
}
