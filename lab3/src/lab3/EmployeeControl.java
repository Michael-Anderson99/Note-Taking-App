package lab3;

public class EmployeeControl {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Employee E1 = new Employee ("Michael", "Anderson", 6789, 35000 );
		System.out.println(E1);
		
		hourlyEmployee E2 = new hourlyEmployee ("Michael","Anderson", 6789, 0, 12, 11.5);
		System.out.println(E2);
		
		Commission E3 = new Commission ("Michael", "Anderson", 6789, 3500, 500 );
		System.out.println(E3);
		
		
		//System.out.println(Employee.calculatePay(45000));                  //employee pay calculate method
		//System.out.println(hourlyEmployee.calcPay(12, 12));                //hourly employee calculate method
		//System.out.println(Commission.calcTotalPay(600, 29400));           //Commission employee calculate methods
		
		
		Employee[] myArray = new Employee [5];
		
		myArray[0] = new Employee ("Michael", "Anderson", 634, 42000 );
		myArray[1] = new hourlyEmployee ("Michael", "Anderson", 500, 23000,50,11.5 );
		myArray[2] = new Employee ("Michael", "Anderson", 634, 46000 );
		myArray[3] = new Commission ("Michael", "Anderson", 634, 42700,4000 );
		myArray[4] = new Employee ("Michael", "Anderson", 634, 42800 );
		
		
	    System.out.println(myArray[0].calculatePay());
	    System.out.println(myArray[1].calculatePay());
	    System.out.println(myArray[2].calculatePay());
	    System.out.println(myArray[3].calculatePay());
	    System.out.println(myArray[4].calculatePay());
	   
}

}
