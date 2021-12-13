package ZERO_JUDGE;

import java.util.Scanner;

public class PrintItAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 大於 0、整數、不可以被 7 整除、小於 n，請輸出所有可能的數字。
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int num = in.nextInt();
			if (num == 0) {
				break;
			}
			for (int i = 1; i < num; i++) {
				int val = i % 7;
				if (val != 0) {
					System.out.print(i);
					System.out.print(" ");
				}
			}
			System.out.println();

		}
		in.close();
	}

}
