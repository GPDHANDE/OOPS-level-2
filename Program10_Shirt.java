package org.ContractPod.OopsL2;

public class Program10_Shirt 
{
    String size;
	String color;
	double price;
	int discount;
	double discountedPrice;

	Program10_Shirt(String size, String color, double price) 
	{
		this.size = size;
		this.color = color;
		this.price = price;
	}
	
	public double CalculateShirtDiscount()
	{
        
        if (size.equalsIgnoreCase("S")) 
        {
        	discount = 50;
			discountedPrice = price - (0.50*price);
        } else if (size.equalsIgnoreCase("M")) 
        {
			discountedPrice = price - (0.40*price);
        } else if (size.equalsIgnoreCase("L")) 
        {
			discountedPrice = price - (0.30*price); 
        } 
        else 
        {
        	discountedPrice = price - (0.20*price); 
        }
        
        return discountedPrice;
    }
	public void PrintShirtDetails()
	{
		System.out.println("Shirt Details:");
		System.out.println("Size: "+size);
		System.out.println("Color: "+color);
		System.out.println("Price: "+price);
		System.out.println("Discounted Price of the given shirt is "+ CalculateShirtDiscount());
	}

	public static void main(String[] args) 
	{
		 Program10_Shirt shirt = new Program10_Shirt("M","Black",1200);
		 shirt.PrintShirtDetails();
	}

}
