package MyJavaExercise;
import java.util.Scanner;

public class ReverseYourText {
	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your statement: "); 
        String input = in.nextLine();
        String output = "";
    	
        for (int i = input.length()-1; i >= 0; i--) {
        	output+=input.charAt(i);
        	//System.out.println(i); 
        }
        System.out.println("Your reversed text is: " + output); 
        in.close();
    }
}