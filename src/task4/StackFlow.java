package task4;

import java.util.Scanner;
import java.util.Stack;

public class StackFlow {
    
	public static void main(String[] args) {
		// Create a stack to store integers
		Stack<Integer> integerStack = new Stack<>();
        	Scanner scanner = new Scanner(System.in);
	   	while (true) {
	   	    System.out.println("\nStack flow Menu:");
	            System.out.println("1. Add a number ");
	            System.out.println("2. Remove a number ");
	            System.out.println("3. is Empty");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	
	            int choice = scanner.nextInt();
	            scanner.nextLine();  // Consume newline character
	            switch (choice) {
		            case 1:
		            	// Push elements onto the stack
		            	System.out.print("Enter the number: ");
		                int number = scanner.nextInt();
		                pushElements(integerStack,number);
		                System.out.println();
		  	        System.out.println("------------------------------------------");
		  	        System.out.println();
		                System.out.println("Displaying the numbers in the stack: "+integerStack);
		                System.out.println();
		  	        System.out.println("------------------------------------------");
		  	        System.out.println();
		                break;
		            case 2:
		            	// Pop elements from the stack
		                popElements(integerStack);
		                System.out.println();
		  	        System.out.println("------------------------------------------");
		  	        System.out.println();
		                System.out.println("Displaying the numbers in the stack: "+integerStack);
		                System.out.println();
		  	        System.out.println("------------------------------------------");
		  	        System.out.println();
		                break;
		
		            case 3:
		            	// Check if the stack is empty
		            	boolean isEmpty = integerStack.isEmpty();
		            	System.out.println("Is the stack empty? " + isEmpty);
		            	System.out.println();
		  	        System.out.println("------------------------------------------");
		  	        System.out.println();
		            	System.out.println("Displaying the numbers in the stack: "+integerStack);
		            	System.out.println();
		  	        System.out.println("------------------------------------------");
		  	        System.out.println();
		                break;
		
		            case 4:
		                System.out.println("Exiting the program. Goodbye!");
		                System.out.println();
		  	        System.out.println("------------------------------------------");
		  	        System.out.println();
		                System.exit(0);
		
		            default:
		                System.out.println("Invalid choice. Please enter a valid option.");
		                System.out.println();
		  	        System.out.println("------------------------------------------");
		  	        System.out.println();
		        }
	   	 }
	}

	/*
	*Method to save the integer in to the stack
	*/
	private static void popElements(Stack<Integer> integerStack) {
        int poppedElement = integerStack.pop();
        System.out.println("Popped element: " + poppedElement);
		
	}

	/*
	*Method to remove the integer in to the stack
	*/
	private static void pushElements(Stack<Integer> integerStack,int number) {
        integerStack.push(number);
        System.out.println("The number "+number+" saved Succesfully");
		
	}

}
