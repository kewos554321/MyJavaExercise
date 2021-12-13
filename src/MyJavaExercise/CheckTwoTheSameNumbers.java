package MyJavaExercise;

import java.util.Scanner;

public class CheckTwoTheSameNumbers {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int value1 = in.nextInt();
		int value2 = in.nextInt();
		
		
//		String[] values = in.nextLine().split(" ");
//		int value1 = Integer.parseInt(values[0]);
//		int value2 = Integer.parseInt(values[1]);
		
		if (value1 == value2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		in.close();
	}
}