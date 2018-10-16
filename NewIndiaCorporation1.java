package employee_salary;
import java.util.*;
public class NewIndiaCorporation1 {

	/*An organization needs a program to calculate how much to pay their hourly 
	 * employees.  Employees should work for a minimum of 40 hours per week. 
	 *  They will get Over Time(OT) salary if they work more than 40 hours.  
	 *  OT salary is 1.5 times salary per extra hour.  
	 *  The organization pays a minimum of Rs. 50 per hour. Though the organization 
	 *  pays more for OT, it is very strict for employees personal time.  Hence,
	 *   no employee is allowed to work more than 60 hours per week.  

 Summary: 
* An employee gets paid (hours worked) × (base pay), for each hour up to 40 hours. 

* For every hour over 40, they get overtime = (base pay) × 1.5. 

* The base pay must not be less than the minimum wage (Rs. 50 an hour). 

* If it is less than Rs. 50, print an error message. 

* If the number of hours is greater than 60, print an error message. 

 

Direction: 
Create a new class called NewIndiaCorporation. Write a method that takes the base 
pay and hours worked as parameters, and prints the total pay or an error. Write a main 
method that calls this method for each of these employees: 

Base Pay  Hours Worked 

Employee 1 Rs. 50 35 

Employee 2 Rs. 45 47 

Employee 3 Rs. 100 73 
	 */
	
	
	//int workHours;
	//int salaryPay;
	static double c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("NewIndiaCorporation Salary Details");
		System.out.println("-------------------------------");
		System.out.print("Enter The Employee List : ");
		Scanner ips=new Scanner(System.in);
		int list=ips.nextInt();
		
		System.out.println("");
		System.out.println("The Employee Details : ");
		
		System.out.println("-------------------------------");
		
		NewIndiaCorporation1 methodName = new NewIndiaCorporation1();
							 
		
		for(int i=1;i<=list;i++)
		{
			double  value = methodName.TotalInpout();
			if(value==0)
			{
				System.out.println("No salary calculated");
			}
			else
			{
			System.out.println("Total Salary : "+c);
			}
			
		}
		
	}
	static double TotalInpout()
	{
		System.out.println("Enter WorkHours : ");
		Scanner wh = new Scanner(System.in);
		int workHours = wh.nextInt();
		
		System.out.println("Enter SalaryPay : ");
		Scanner sp = new Scanner(System.in);
		int salaryPay = sp.nextInt();
		
		//TotalInpout(workHours,salaryPay);
		
		
		
		if(workHours<=40 && salaryPay==50)
		{
			double salaryAmount=workHours*salaryPay;
			//System.out.print("Total Salary Amount : "+salaryAmount);
			c=salaryAmount;
			return c;
		}
		else if(workHours>40 && salaryPay==50)
		{
			if(60>workHours)
			{
				double salaryAmount=workHours*salaryPay;
				c=salaryAmount;
				//System.out.println("Total Salary Amount : "+salaryAmount);
				double OT=(salaryPay*1.5);
				c=c+OT;
				//System.out.print("Total OT : "+OT);
				return c;
			}
			else
			{
				System.out.println("Over Time Work Not Allowed :( ");
				
			}
			
		}
		
		else
		{
			System.out.println("Error :(");
			return 0; 
		}
		return salaryPay;
		
	}
}
