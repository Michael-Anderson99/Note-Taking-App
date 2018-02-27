package lab3;

public class hourlyEmployee extends Employee 
{
	double hoursWorked;
    double hourlyRate;
	
	public hourlyEmployee (String firName, String secondName, int staffNo, double annSal, double hoursWorked, double hourlyRate)
	{
		 super (firName, secondName, staffNo, annSal);
		 this.hoursWorked = hoursWorked; 
		 this.hourlyRate = hourlyRate;
		
	}
	
	public double calculatePay ()
	{ 
		double pay = hourlyRate * hoursWorked;
		
		return pay;
	}
	
	public String toString()
	{
		String details = super.toString()  + ".They worked " + hoursWorked + " this week, for " 
		+ hourlyRate + " per hour";
		 
		return details;
	}
	
	
	
	
}
