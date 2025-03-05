
package lab5;

/**
This class represents the employee. 
An employee is paid the same (particular) amount regardless of the hours (additional) the employee worked.
*/
public class Employees extends Millers {


private String name;
private double annualPay;

public String getName() {
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

/**

   Constructs an employee with a given name and an annual pay.
   @param name the name of this employee
   @param pay the annual pay of the employee
 */
public Employees(String name, double pay)
{
   this.name = name;
   this.annualPay = pay;
}


public double biWeeklyPay() {
	double pay = (annualPay / 52) * 2;
    return pay;
}

@Override
public double biWeeklyPay(int hoursWorked) {
    return biWeeklyPay();  
}



}
