package MyJavaExercise;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SwapUppercaseAndLowercase {
	
	public static void main (String[] argv) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your text: "); // tHIS mY sTATEMENT.
		String statement = in.nextLine();
		
		List<Integer> ASCII_codes = statement.chars().boxed().collect(Collectors.toList());; 
		String result = "";
		for (int i : ASCII_codes) {
			if (i >= 97 && i <= 122) {
			    result+=Character.toString(i - 32);
			} else if (i >= 65 && i <= 90) {
				result+=Character.toString(i + 32);
			} else {
				result+=Character.toString(i);
			}
		}
		System.out.println("This is your swapped statement: \r" + result);
		in.close();
	}
	
}