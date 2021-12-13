package MyJavaExercise;

import java.util.Scanner;

public class StealValuableThings {
	
	static int[] selectionSort(int arr[]) { 
        int pos;
        int temp;
        for (int i = 0; i < arr.length; i++) { 
            pos = i; 
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[pos]) {
                    pos = j;
                }
            }
            temp = arr[pos];            //swap the current element with the minimum element
            arr[pos] = arr[i]; 
            arr[i] = temp; 
        }
		return arr; 
    } 
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int takeAwayQuantity = in.nextInt();
		int stuffNumber = in.nextInt();
		int[] stuffs = new int[stuffNumber];
		for (int i = 0; i < stuffNumber; i++) {
			int element = in.nextInt();
			stuffs[i] = element;
		}
		//System.out.println(Arrays.toString(stuffs));
		stuffs = selectionSort(stuffs);
		//System.out.println(Arrays.toString(stuffs));
		int result = 0;
		for (int i = stuffNumber-1; i > stuffNumber-takeAwayQuantity-1 ;i--) {
			System.out.println(i);
			result+=stuffs[i];
		}
		System.out.println(result);
		in.close();
	}
	
}
