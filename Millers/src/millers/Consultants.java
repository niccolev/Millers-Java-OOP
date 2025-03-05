
package lab5;

/**
This code in this file is for the Consultant Class. A Consultant is a miller who is paid for every hour worked.
*/
// DECLARE THE CONSULTANT CLASS AND ITS VARIABLES.
public class Consultants extends Millers {

	private double consultantWage;
	private String name;
	
	public Consultants (String name, double wage) {
		this.consultantWage = wage;
		this.name = name;
	}

	public double getConsultantWage() {
		return consultantWage;
	}
	
	public void setConsultantWage (double consultantWage) {
		this.consultantWage = consultantWage;
	}
	
	public String getName () {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
/**
   This portion of the code constructs an hourly paid consultant with a given name and biweekly wage.
   @param name the name of this consultant
   @param wage the consultant wage per hour 
*/


	@Override
	public double biWeeklyPay(int hoursWorked) {
	    double pay;

	    if (hoursWorked <= 76) {
	        pay = hoursWorked * consultantWage;
	    } else {
	        pay = 76 * consultantWage;
	        
	        int overtimeHours = hoursWorked - 76;
	        double overtimePay = overtimeHours * (consultantWage * 1.5);
	        pay += overtimePay;
	    }
	    
	    return pay;
	}
}


