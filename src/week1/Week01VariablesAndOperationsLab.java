//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package week1;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {
		
		System.out.println("Week 1 Lab");

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
		int numOfPlaneSeats = 30;
				
		// 2. Create a variable to hold the cost of groceries at checkout
		double costOfGroceries = 75.44;	
		
		// 3. Create a variable to hold a person's middle initial
		char middleInit = 'D'; //Characters denoted with single quotes
			
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		boolean isItHotOutside = false;
				
		// 5. Create a variable to hold a customer's first name
		String customerFirstName = "Jimmy";
				
		// 6. Create a variable to hold a street address
		String streetAddress = "123 Main Rd";

		// 7. Print all variables to the console
		System.out.println(numOfPlaneSeats);
		System.out.println(costOfGroceries);
		System.out.println(middleInit);
		System.out.println(isItHotOutside);
		System.out.println(customerFirstName);
		System.out.println(streetAddress);
						
		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		numOfPlaneSeats = numOfPlaneSeats - 2;
		//numOfPlaneSeats -= 2;
		System.out.println(numOfPlaneSeats);

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
		costOfGroceries = costOfGroceries + 2.15;
		System.out.println(costOfGroceries);

		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		middleInit = 'S';
		System.out.println(middleInit);

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		isItHotOutside = !isItHotOutside;
		System.out.println(isItHotOutside);
				
		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		String customerfullName = customerFirstName + " " + middleInit;
		System.out.println(customerfullName + " Smith");

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
		System.out.println("Hi, my name is " + customerfullName + " Smith" + " and I live at " + streetAddress + ".s");		
	}
}