package ZERO_JUDGE;

import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		compute(a, b, c);
		in.close();
	}
	
	private static void compute(int a, int b, int c) {

		double val = discriminant(a, b, c);

		if (val > 0) {
			double x1, x2;
			x1 = (-b + val) / 2 * a;
			x2 = (-b - val) / 2 * a;
			System.out.println("Two different roots x1="+(int)x1+" , x2="+(int)x2);
		} else if (val == 0) {
			double x;
			x = (-b) / (2 * a);
			System.out.println("Two same roots x="+(int)x);
		} else {
			System.out.println("No real root");
		}

	}

	private static double discriminant(int a, int b, int c) {
		return Math.sqrt((b * b) - (4 * a * c));
	}
}
