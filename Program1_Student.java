package org.ContractPod.OopsL2;

public class Program1_Student 
{
	int id;
	String name;
	int age;
	Program1_Student(int id, String name, int age) 
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() 
	{
		return "id=" + id + ", name=" + name + ", age=" + age + "";
	}



	public static void main(String[] args) 
	{
		Program1_Student student1 = new Program1_Student(1,"Gaurav",22);
		System.out.println("student details are "+ student1.toString());
	}

}
