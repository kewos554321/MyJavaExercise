package MyJavaExercise;
import java.util.Arrays;
import java.util.Scanner;
public class FindTheSecondLargestValue{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String input_values = in.nextLine(); // 1, 2, 3
	    String[] input_values_list = input_values.replace(" ", "").split(",");	
	    int[] values = new int[input_values_list.length];
        for (int i = 0; i < values.length; i++) {
        	values[i] = Integer.parseInt(input_values_list[i]);
        }
        System.out.println("Your values List is "+Arrays.toString(values));
        
        double max_value = Double.NEGATIVE_INFINITY;
        double sec_max_value = Double.NEGATIVE_INFINITY;
        for (int i : values) {
        	if (i > max_value) {
        		sec_max_value = max_value;
        		max_value = i;
        	} else if (i > sec_max_value) {
        		sec_max_value = i;
        	}
        }
        System.out.printf("The second largest value is %d .\r", sec_max_value);
		in.close();
	}
}