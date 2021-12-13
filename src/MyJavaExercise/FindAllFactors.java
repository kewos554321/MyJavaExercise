package MyJavaExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAllFactors {
	public static void main (String[] args) {
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter a Integer:\r");
		int value = in.nextInt();
		List<Integer> factors = new ArrayList<Integer>();
		
		for (int i = 1; i <= value; i++) {
			if (value % i == 0) {
				factors.add(i);
			}
		}
		System.out.println("The value's factor list is :\r" + factors);
		in.close();
	}

}