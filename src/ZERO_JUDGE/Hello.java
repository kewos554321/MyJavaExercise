package ZERO_JUDGE;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		String str = in.next();
		String preStr = "hello, ";
		String result = preStr.concat(str);
		System.out.println(result);
		in.close();
	}
	
}
