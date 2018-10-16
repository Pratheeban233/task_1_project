package employee_salary;
import java.util.*;
public class NewIndiaCorporation1 {

	/**
	 * @param args
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
