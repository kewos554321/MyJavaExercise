package ZERO_JUDGE;

public class ExactSinx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 利用公式 sin x = x - x 3 / 3! + x 5 / 5! - x 7 / 7! + ... for all x.
		// 計算 sin x 且精準 50 位, 50 位後, 無條件捨去
		double x = 50;
		double val = compute(x);
		System.out.println(val);
//		int a = runFactorial(3);
//		System.out.println(a);
	}

	private static double compute(double x) {
		double sinx = 0;
		int flag = 1;

		for (int i = 1; i < 20; i += 2) {
			System.out.println("f=" + 1 * (i - 1) * i);
			if (flag == 1) {
				sinx += runSingleBlock(x, i);
				flag = 0;
			} else {
				sinx -= runSingleBlock(x, i);
				flag = 1;
			}
			System.out.println("i=" + i + ", sinx=" + sinx);
			if (i > 10) {
				System.exit(1);
			}
		}
		return sinx;
	}

	private static double runSingleBlock(double x, int n) {
//		double val1 = Math.pow(Math.toRadians(x), n);
//		double val2 = runFactorial(n);
//		double res = val1 / val2;

		double res = Math.pow(Math.toRadians(x), n) / runFactorial(n);
//		System.out.println("val1="+val1+" val2="+val2+" res="+res);
		System.out.println("res=" + res);
		return res;
	}

	private static int runFactorial(int val) {
		int res = 1;
		for (int i = 1; i <= val; i++) {
			res *= i;
		}
		return res;
	}
}
