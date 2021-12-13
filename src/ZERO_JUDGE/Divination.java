package ZERO_JUDGE;

import java.util.Scanner;

public class Divination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int result = (a * 2 + b) % 3;
		
		if (result == 0){
			System.out.println("普通");
		}else if (result == 1){
			System.out.println("吉");
		}else{
			System.out.println("大吉");
		}
		in.close();
	}
}
