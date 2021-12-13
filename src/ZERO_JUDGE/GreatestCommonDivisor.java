package ZERO_JUDGE;

import java.util.Scanner;

public class GreatestCommonDivisor {

	private static int gcd(int a, int b) {
		int c;
		if (b > a) {
			c = a;
			a = b;
			b = c;
		}
		if (a % b == 0) {
			return b;
		} else {
			return gcd(b, a % b);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int val = gcd(a, b);
		System.out.println(val);
		in.close();

	}

}
