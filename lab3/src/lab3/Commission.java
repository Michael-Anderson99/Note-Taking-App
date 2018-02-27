package lab3;

public class Commission extends Employee
{
	int commissionEarned;
	int annualPay;

	
	
	public Commission (String firName, String secondName, int staffNo, int commissionEarned, int annualPay)
	{
		super (firName, secondName, staffNo);
		this.commissionEarned = commissionEarned;
		this.annualPay = annualPay;
	
	}
	
	public double calculatePay()
	{
		double totalPay = commissionEarned + annualPay;
		
		return totalPay;
	}

	public String toString()
	{
		String details = "The employees name is " + firstName +" "+ surName + ". Their staff number is " + staffNumber + ". their annual salary is " + annualPay + 
		 ". They earned " + this.commissionEarned + " in commission so their total pay will be " + calculatePay() + ".";
		
		return details;
	}

}







