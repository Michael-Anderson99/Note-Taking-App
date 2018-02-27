package lab3;

public class Employee 
{
	String firstName;
	String surName;
	int staffNumber;
	double annualSalary;



	public Employee (String firName, String secondName, int staffNo, double annSal)
	{
		firstName = firName;
		surName = secondName;
		staffNumber = staffNo;
		annualSalary = annSal;
	
	}
	
	public Employee(String firName, String secondName, int staffNo) 
	{
		firstName = firName;
		surName = secondName;
		staffNumber = staffNo;
	}

	public double calculatePay()
	{
		double monthly = annualSalary/12;
		
		return monthly;
	}
	public String toString()
	{
		String details = "The employees name is " + firstName + " " + surName + ". Their staff number is " + staffNumber + ".Their salary is " + annualSalary ;

		 
		return details;
	}
	
	
}


