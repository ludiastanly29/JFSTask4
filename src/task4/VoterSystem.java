package task4;

import java.util.Scanner;

//Exception class for invalid name
class InvalidAgeException extends Exception {
	
	 public InvalidAgeException(String message) {
	     super(message);
	 }
}

//Voter class with parameterised constructor
class Voter{

	private String voterId;
	private String name;
	private int age;
	
	public Voter() {
		
	}
	// Parameterized constructor
	public Voter(String voterId, String name, int age) throws InvalidAgeException {
		this.voterId = voterId;
		this.name = name;
		this.age = age;
		
		//check if the age is above 18
		if(!checkAgeRange(age)) {
            throw new InvalidAgeException("Age should be above 18");
		}
	}
	
	// Method to check if the age is above 18
	private boolean checkAgeRange(int age2) {
		if (age < 18) {
            return false;
        }else {
        	return true;
        }
	}
	public String getVoterId() {
		return voterId;
	}
	public void setVoterId(String voterId) {
		this.voterId = voterId;
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
	
	
}


public class VoterSystem {

	public static void main(String[] args) {

        try {
            // Creating a valid voter
        	Scanner scanner = new Scanner(System.in);
        	 while (true) {
 	           System.out.println("\nVoter System :");
 	           System.out.print("Enter the voter id: ");
               String voterId = scanner.nextLine();
               System.out.print("Enter the name: ");
               String name = scanner.nextLine();
               System.out.print("Enter the age: ");
               int age = Integer.parseInt(scanner.nextLine());
 	            
               Voter validStudent = new Voter(voterId, name, age);
 	           System.out.println("Valid voter created: " + validStudent.getName());
        	 }
        }catch (InvalidAgeException  e) {
            System.out.println("Exception caught: " + e.getMessage());
        } 
	}

}
