package org.ContractPod.OopsL2;

public class Program4_Circle 
{
	float radius;
	
	public float AreaOfCircle(float radius)
	{
		return (float) (3.14*radius*radius);
	}
	
	public float CircumferanceOfCircle(float radius)
	{
		return (float) (2*3.14*radius);
	}

	public static void main(String[] args) 
	{
		Program4_Circle c = new Program4_Circle();
		System.out.println("Area of circle is "+ c.AreaOfCircle(10));
		System.out.println("Circumferance Of Circle is "+c.CircumferanceOfCircle(10));
		
	}

}
