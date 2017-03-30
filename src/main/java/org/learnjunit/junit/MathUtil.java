package org.learnjunit.junit;

/**
 * Math library.
 * 
 * @author psajja
 *
 */
public class MathUtil {

	/**
	 * Non-instantiable
	 */
	private MathUtil() {
	}

	/**
	 * Computes the greatest common divisor of the given numbers.
	 * 
	 * @param a
	 *    	first number
	 * @param b
	 *    	second number
	 * 
	 * @return GCD of the given numbers
	 */
	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
	
	/**
	 * Computes the least common mean of the given numbers.
	 * <p>
	 * lcm(a,b) * gcd(a,b) = a*b
	 * </p>
	 * 
	 * @param a
	 * 		first number
	 * @param b
	 * 		second number
	 * 
	 * @return
	 * 		the LCM of the given numbers
	 */
	public static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}
}
