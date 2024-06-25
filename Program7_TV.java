package org.ContractPod.OopsL2;

public class Program7_TV 
{
	String brand;
	String size;
	double price;

	
	Program7_TV(String brand, String size, double price) 
	{
		this.brand = brand;
		this.size = size;
		this.price = price;
	}

	public void CalculateDiscount(String size)
	{
		if(size=="32inch")
		{
			int discount = 15;
			price = price - (0.15 * price);
			System.out.println("congratulation you got "+discount+"percent discount ,total price after discount is "+price);
		}
		else if(size=="42inch")
		{
			int discount = 20;
			price = price - (0.20 * price);
			System.out.println("congratulation you got "+ discount +"percent discount ,total price after discount is "+price);
		}
		else if(size== "54inch")
		{
			int discount = 25;
			price = price - ((discount/100)*price);
			System.out.println("congratulation you got "+discount+"percent discount ,total price after discount is "+price);
		}
		else if(size== "72inch")
		{
			int discount = 40;
			price = price - (0.40*price);
			System.out.println("congratulation you got "+discount+ "percent discount ,total price is "+price);
		}
	}
	
	public void PrintTvDetails()
	{
		System.out.println("Brand: "+brand);
		System.out.println("Size: "+size + " inches");
		System.out.println("Price: "+price);
	}
	public static void main(String[] args) 
	{
		Program7_TV tv = new Program7_TV(" Sony Bravia", "54inch", 50000);
		tv.PrintTvDetails();
		tv.CalculateDiscount("32inch");
	}

}
