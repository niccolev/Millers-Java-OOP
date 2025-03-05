
package lab5;

/**
This code contains Supervisor class declaration, constructor and method. 
A Supervisor is an employee who also receives a bonus. 
Implemented the bi-weekly pay for the employee.
*/

// Declare the class and any variable

public class Supervisors extends Employees {
	private String name;
	private double annualPay;
	private double bonus;
	


/**
    TO DO: TASK 2 - Constructs a supervisor with a given name, annual pay and bi-weekly bonus.
   @param name the name of this employee
   @param pay the annual pay
   @param bonus the bi-weekly bonus
 */
	public Supervisors(String name, double pay, double bonus) {
		super(name, pay);
		this.name = name;
		this.annualPay = pay;
		this.bonus = bonus;
    }
	
	public String getName () {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getAnnualPay() {
		return annualPay; 
	}
	
	public void setAnnualPay(double annualPay) {
		this.annualPay = annualPay;
	}
	
	public double getBonus () {
		return bonus;
	}

	public void setBonus (double bonus) {
		this.bonus = bonus;
	}

// TO DO: TASK 3 - YOUR CODE FOR COMPUTING THE BI-WEEKLY PAY FOR THIS CATEGORY OF MILLER GOES HERE.

// Hint: Note the relationship between this class and any other class. How will you apply that to your code?
	
	/**
     * Computes the bi-weekly pay for this supervisor.
     * @return the bi-weekly pay with the bonus included
     */
	
	 @Override
	    public double biWeeklyPay() {
	        return super.biWeeklyPay() + bonus; // Base pay from Employees + bi-weekly bonus
	    }


}
