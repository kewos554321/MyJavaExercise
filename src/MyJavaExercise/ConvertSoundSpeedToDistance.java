package MyJavaExercise;

import java.util.Scanner;

public class ConvertSoundSpeedToDistance {
	public static void main (String[] args) {
		Scanner in  = new Scanner(System.in);
		int sec = in.nextInt();
		int kSoundSpeed = 340;
		System.out.println(sec * kSoundSpeed);
		in.close();
	}
}