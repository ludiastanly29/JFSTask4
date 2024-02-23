package task4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class HashMapFlow {
    
	public static void main(String[] args) {
		// Create a HashMap to store student names and their grades
        Map<String, Integer> studentGrades = new HashMap<>();
        String name =null;
        Scanner scanner = new Scanner(System.in);
	while (true) {
	    System.out.println("\nStudent Grade Management Menu:");
	    System.out.println();
            System.out.println("------------------------------------------");
            System.out.println();
            System.out.println("1. Add a student name and grade ");
            System.out.println("2. Remove a student ");
            System.out.println("3. Get a student's grade");
            System.out.println("4. Display all students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character
            switch (choice) {
	            case 1:
	            	 // Add a new student and their grade
	            	System.out.print("Enter the student's name: ");
	                name = scanner.next();
	                System.out.print("Enter the student's grade: ");
	                int grade = scanner.nextInt();
	                addStudentGrade(studentGrades, name, grade);
	                System.out.println();
	                System.out.println("------------------------------------------");
	                System.out.println("\nAfter Adding "+name+"'s Grade:");
	                System.out.println("------------------------------------------");
	                System.out.println("Student Grades:");
	                displayStudentGrades(studentGrades);
	                System.out.println();
	                System.out.println("------------------------------------------");
	                break;
	            case 2:
	            	// Delete a student and their grade
	            	System.out.print("Enter the student's name: ");
	                name = scanner.next();
	                deleteStudentGrade(studentGrades, name);
	                System.out.println();
	                System.out.println("------------------------------------------");
	                System.out.println();
	                System.out.println("\nAfter Deleting "+name+"'s Grade:");
	                System.out.println("------------------------------------------");
	                System.out.println();
	                System.out.println("Student Grades:");
	                displayStudentGrades(studentGrades);
	                System.out.println();
	                System.out.println("------------------------------------------");
	                System.out.println();
	                break;
	            case 3:
	            	// Display a specific student's grade
	            	System.out.print("Enter the student name: ");
	            	name = scanner.nextLine();
	                displaySpecificStudentGrade(studentGrades, name);
	                System.out.println();
	                System.out.println("------------------------------------------");
	                System.out.println();
	                break;
	            case 4:
	            	// Display all students and their grades
	            	displayStudentGrades(studentGrades);
	            	System.out.println();
	                System.out.println("------------------------------------------");
	                System.out.println();
	                break;
	            case 5:
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

	// Method to display all students and their grades
    private static void displayStudentGrades(Map<String, Integer> studentGrades) {
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + "'s Grade : " + entry.getValue());
        }
    }

    // Method to add a new student and their grade
    private static void addStudentGrade(Map<String, Integer> studentGrades, String studentName, int grade) {
        studentGrades.put(studentName, grade);
    }

    // Method to delete a student and their grade
    private static void deleteStudentGrade(Map<String, Integer> studentGrades, String studentName) {
        studentGrades.remove(studentName);
    }

    // Method to display the grade of a specific student
    private static void displaySpecificStudentGrade(Map<String, Integer> studentGrades, String studentName) {
        Integer grade = studentGrades.get(studentName);

        if (grade != null) {
            System.out.println("\n" + studentName + "'s Grade: " + grade);
        } else {
            System.out.println("\nStudent not found: " + studentName);
        }
    }

}
