package task4;

import java.util.Scanner;

public class DaysSystem {

	public static void main(String[] args) {
		 // Creating a days array
		String[] days = new String[]{"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		String dayName=null;
		try {
        	Scanner scanner = new Scanner(System.in);
        	 while (true) {
 	           System.out.println("\nDays :");
 	           System.out.print("Enter the number for the day: ");
               int index = scanner.nextInt();
               dayName = days[index];
               System.out.println("You have selected the "+dayName);
        	 }
        }catch (ArrayIndexOutOfBoundsException  e) {
            System.out.println("ArrayIndexOutOfBoundsException: Index should be between 0 and " + (days.length - 1));

        } 
	}

}
