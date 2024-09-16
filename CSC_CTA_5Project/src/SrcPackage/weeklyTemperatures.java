package SrcPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class weeklyTemperatures {

	public static void main(String[] args) {
		ArrayList<String> daysOfTheWeek = new ArrayList<String>();      // creates an arraylist for the days of the week
		ArrayList<Integer> averageTemeraturesPerDay = new ArrayList<Integer>();   // creates an arraylist for the average temperatures per day
		
		
		// adding elements(days) monday thru friday for the daysOfTheWeek arraylist. 7 elements: 0-6
		daysOfTheWeek.add("Monday");
		daysOfTheWeek.add("Tuesday");
		daysOfTheWeek.add("Wednesday");
		daysOfTheWeek.add("Thursday");
		daysOfTheWeek.add("Friday");
		daysOfTheWeek.add("Saturday");
		daysOfTheWeek.add("Sunday");
	
		//adding elements for the average temperatures of the week, 0-6 or 7 elements
		averageTemeraturesPerDay.add(66);
		averageTemeraturesPerDay.add(44);
		averageTemeraturesPerDay.add(80);
		averageTemeraturesPerDay.add(90);
		averageTemeraturesPerDay.add(30);
		averageTemeraturesPerDay.add(53);
		averageTemeraturesPerDay.add(72);
		
		
		Scanner scnr = new Scanner(System.in); // creates a scanner object for user input
		String userInput = "none";          //creating a variable to hold user input, first set to "none" outside the while loop
		String i = "none";                  //first setting variable i to none before if statement in loop.
		int n = -1;                         //setting counter variable for for loop to count the number of elements thus figuring out the currrent element index
		while(!userInput.equalsIgnoreCase("Quit")) {             // creates a while loop which executes when the variable userinput does not equal quit.   
			
			System.out.println("Enter the day of the week, monday through sunday or week please:(enter \"quit\" to leave): ");
			userInput = scnr.nextLine();      //stores the day the user inputs\

			for(String day: daysOfTheWeek) {      //for loop inside of while loop, it iterates through the daysOfTheWeek arraylist, checking to see what element matches userinput
				++n;
				if(userInput.equalsIgnoreCase(day)) {
					i = day;
					
				System.out.println("The day is " + i + "." + " The average temperature is" + " " + averageTemeraturesPerDay.get(n) + " degrees F.");
				}
			}
			
			
			int numI;                                 // declaring variable numI which is the counter varialbe for the for loop which countes the index the current iteration is on          
			
			if(userInput.equalsIgnoreCase("Week")) {             // if statement executes when userInput equals "week"
				for(numI = 0; numI < daysOfTheWeek.size(); ++numI) {     //counter variable is numI which is equal to 0; the boolean expression is when numI is less than the size of the arrayList daysOfTheWeek, execute; ++i increments i by 1
					String dayOfWeek = daysOfTheWeek.get(numI);
					int averageTemp = averageTemeraturesPerDay.get(numI);
					System.out.println("The day is " + dayOfWeek + "." + " The average temperature is " + averageTemp + ".");
					}
				double weeklyAvgTemp = (averageTemeraturesPerDay.get(0) + averageTemeraturesPerDay.get(1) + averageTemeraturesPerDay.get(2) + averageTemeraturesPerDay.get(3) + averageTemeraturesPerDay.get(4) +
						averageTemeraturesPerDay.get(5) + averageTemeraturesPerDay.get(6)) / 7.0;
				
				System.out.printf("The weekly average temperature is " + "%.2f", weeklyAvgTemp);
				System.out.println(" ");
			
				}	
			if(userInput.equalsIgnoreCase("Quit")) {          //executes when userinput equals "Quit" which prints a statement then terminates the program.
				System.out.println("Have a good day!");
				break;
			}
	
		}
		scnr.close();
	
	
			
			
	}
}




			