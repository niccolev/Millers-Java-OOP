package lab5;

import java.util.Scanner;

import java.util.ArrayList;

/**
   This class is called the MillerTest Class and provides the main method for the program.
   This program shows polymorphism by applying a method to objects of different classes. 
   The Users are prompted to input hours done worked by each miller. 
   Implemented using an array. 
   The order of the workers in the output is Consultants, Employees and Supervisors. 
   Assume an annual pay, for example $84,000 and $30 as a Supervisor's bonus.
*/


public class MillersTest {
	private static ArrayList<Millers> millersList = new ArrayList<>();
	
	public static void main(String[] args)
   {
     
	   Scanner keyboard = new Scanner (System.in);


	        // Sample data - add initial Miller objects
	        millersList.add(new Employees("Alice", 50000));
	        millersList.add(new Consultants("Bob", 30)); // Example Consultant with hourly pay and hours
	        millersList.add(new Supervisors("Carol", 60000, 500)); // Supervisor with bonus

	        
	        
	        // Display menu for user input
	        boolean running = true;
	        while (running) {
	            System.out.println("Select an option:");
	            System.out.println("1. Add a new Miller");
	            System.out.println("2. List all Millers");
	            System.out.println("3. Calculate millers pay.");
	            System.out.println("4. Exit");

	            int ans = keyboard.nextInt();
	            keyboard.nextLine(); // Clear the newline

	            switch (ans) {
	                case 1:
	                    addMiller(keyboard);
	                    break;
	                case 2:
	                    listMillers();
	                    break;
	                case 3:
	                	calculatePayForMillers(keyboard);
	                case 4:
	                    running = false;
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }

	        keyboard.close();
	       
   }
	   
	   
	   public static void addMiller(Scanner scanner) {
	   System.out.println("Lets add a miller. Is he an employee, a supervisor or a consultant?");
	   String userInput = scanner.next().toLowerCase();
		   
	   switch (userInput) {
	   case "employee" :
		   System.out.println ("What is the employee's name? ");
		   String employeeName =  scanner.next();
			    
		   System.out.println("What is his annual wage? ");
		   double employeeAnnualWage = scanner.nextDouble();
			    
		   Employees employee1 = new Employees(employeeName, employeeAnnualWage);
		   millersList.add(employee1);
		   
		   break;
			    
	   case "supervisor" :
		   System.out.println ("What is the supervisor's name? ");
		   String supervisorName =  scanner.next();
		   
		   System.out.println("What is his annual wage? ");
		   double supervisorAnnualWage = scanner.nextDouble();
			    
		   System.out.println("How much bonus does he get? ");
		   double supervisorBonus = scanner.nextDouble();
			    
		   Supervisors supervisor1 = new Supervisors(supervisorName, supervisorAnnualWage, supervisorBonus);
		   millersList.add(supervisor1);
		   
		   break;
			    
			    
	   case "consultant" :
		   System.out.println ("What is the consultant's name? ");
		   String consultantName =  scanner.next();
			    
		   System.out.println("What is his hourly wage? ");
		   double consultantHourlyWage = scanner.nextDouble();
			    
		   Consultants consultant1 = new Consultants(consultantName, consultantHourlyWage);
		   millersList.add(consultant1);
		   
		   break;
			    
	   default:
		   System.out.println ("option doesnt exist, please retry.");
		   break;
		   }
	   }
	   
	   public static void listMillers() {
		   for (Millers miller : millersList) {
			   System.out.println(miller.getName() + " - " + miller.getClass().getSimpleName());
			   
		   }
	   }
	   
	   
	   public static void calculatePayForMillers(Scanner scanner) {
		    for (Millers miller : millersList) {
		        System.out.println("Enter the hours done by " + miller.getName() + ": ");
		        int hoursWorked = scanner.nextInt(); 
		        double pay = miller.biWeeklyPay(hoursWorked); 
		        System.out.printf("Total Pay for this miller is: %.2f$ ", pay);
		    }
		}
	   
	   
}


