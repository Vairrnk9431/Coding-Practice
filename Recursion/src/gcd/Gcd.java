package gcd;

public class Gcd {
	public int GreatestCommonDivisior(int m, int n) {
		if (n == 0) {
			return m;
		} else {
			return GreatestCommonDivisior(n, m % n);
		}

	}

}
