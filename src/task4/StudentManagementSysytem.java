package task4;

import java.util.Scanner;

//Exception class for invalid name
class AgeNotWithinRangeException extends Exception {
	
	 public AgeNotWithinRangeException(String message) {
	     super(message);
	 }
}

//Exception class for invalid name
class NameNotValidException extends Exception {
	
	 public NameNotValidException(String message) {
	     super(message);
	 }
}

//Student class with parameterized constructor
class Student{
	
	private String rollNo;
	private String name;
	private int age;
	private String course;
	
	public Student() {
		
	}

	// Parameterized constructor
	public Student(String rollNo, String name, int age, String course) throws AgeNotWithinRangeException,NameNotValidException {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.course = course;
		
		//check if the age is in between 15 and 21
		if(!checkAgeRange(age)) {
            throw new AgeNotWithinRangeException("Age should be between 15 and 21");
		}
		// Check if the name contains numbers or special characters
        if (!checkName(name)) {
            throw new NameNotValidException("Name should not contain numbers or special characters.");
        }
	}

	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
    //Method to check if the age is in between 15 and 21
    private boolean checkAgeRange(int age) {
		if (age < 15 || age > 21) {
            return false;
        }else {
        	return true;
        }
    }
    // Method to Check if the name is valid (does not contain numbers or special characters)
    private boolean checkName(String studentName) {
        return studentName.matches("^[a-zA-Z]+$");
    }
	
}


public class StudentManagementSysytem {
	
	public static void main(String[] args) {
        try {
            // Creating a valid student
        	Scanner scanner = new Scanner(System.in);
        	 while (true) {
 	           System.out.println("\nStudent Management System :");
 	           System.out.print("Enter the student's roll no: ");
	           String rollNo = scanner.nextLine();
	           System.out.print("Enter the student's name: ");
	           String name = scanner.nextLine();
	           System.out.print("Enter the student's age: ");
	           int age = Integer.parseInt(scanner.nextLine());
	           System.out.print("Enter the student's course: ");
	           String course = scanner.nextLine();
 	            
 	           Student validStudent = new Student(rollNo, name, age, course);
 	           System.out.println("Valid student created: " + validStudent.getName());
 	           System.out.println();
	           System.out.println("------------------------------------------");
	           System.out.println();
        	 }
        }catch (AgeNotWithinRangeException  e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch ( NameNotValidException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
