package org.ContractPod.OopsL2;

public class Program2_Employee 
{
	int id;
	String name;
	double sal;
	
	public Program2_Employee(int id, String name, double sal) 
	{
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	public String CalcAnnualsal(double sal)
	{
		return "Annual sallery of Employee is "+sal*12;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", sal=" + sal +"";
	}



	public static void main(String[] args) 
	{
		Program2_Employee emp1 = new Program2_Employee(1,"Gaurav",32000);
		System.out.println(emp1.CalcAnnualsal(32000));
		System.out.println("Employee Details are "+emp1.toString());
	}
  
}
