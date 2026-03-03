package Project;
import java.util.Arrays;
import java.util.Scanner;

public class Array_Mod_App {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
	
		int[] numbers = new int[20];
		
		// Ask how many numbers
		System.out.print("How many numbers would you like to enter (1-20)? ");
		int listCount = userinput.nextInt();
		
		// Validate input
		while (listCount < 1 || listCount > 20) {
			System.out.print("Invalid input try again with a number between 1 and 20: ");
			listCount = userinput.nextInt();
		}
		
		// Input numbers
		for (int i = 0; i < listCount; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			numbers[i] = userinput.nextInt();
		}
		
		// Editing Loop
		String choice = "yes";
		while(choice.equalsIgnoreCase("yes")) {
			
			// Display current array
			System.out.println("\nCurrent numbers:");
			for (int i = 0; i < listCount; i++) {
				System.out.print(numbers[i] + " ");
			}
			System.out.println();
			
			// Ask which index to edit
			System.out.print("Enter index (0 to " + (listCount - 1) + ") to edit: ");
			int indexChoice = userinput.nextInt();
			
			if (indexChoice >= 0 && indexChoice < listCount) {
				System.out.print("Enter new value: ");
				numbers[indexChoice] = userinput.nextInt();
			} 
			else {
				System.out.println("Invaild index!");
			}
			
			// Ask if the user wants to edit more
			System.out.print("Would you like to edit another number? (yes/no): ");
			choice = userinput.next();
		}
		
		// Sort the array
		Arrays.sort(numbers, 0, listCount);
		
		// Display the array
		System.out.println("\nSorted numbers:");
		for (int i = 0; i < listCount; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		userinput.close();
		
	}
}
