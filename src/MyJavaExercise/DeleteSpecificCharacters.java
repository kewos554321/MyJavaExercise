package MyJavaExercise;
import java.util.Scanner;

public class DeleteSpecificCharacters{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String inputWords = in.nextLine();
		System.out.print("Enter a special character you want to delete: ");
		String deletedWord = in.next();
		String outputWords = "";
		for (String s : inputWords.split("")) {
			if (!s.equals(deletedWord)) {
				outputWords+=s;
			}
		}		
		System.out.println("This is your finial sentence: " + outputWords);
		in.close();
	}

}



