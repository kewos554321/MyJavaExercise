package ZERO_JUDGE;

import java.util.Scanner;

public class BinaryConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int a = in.nextInt();
			convertBinary(a);
		}
		in.close();
	}
	
	private static void convertBinary(int a) {
		String str1 = "";
		while (true) {
			if (a == 1) {
				str1 = Integer.toString(a % 2) + str1;
				break;
			}
			String str2 = Integer.toString(a % 2);
			str1 = str2.concat(str1);
			a = a / 2;
		}
		System.out.println(str1);
	}
}
