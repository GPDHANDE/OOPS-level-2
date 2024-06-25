package org.ContractPod.OopsL2;

public class Program9_Furniture
{
	private String type;
	private String material;
	private double price;
	int discount;//in percentage
	double discountedPrice;
	
	

	Program9_Furniture(String type, String material, double price) 
	{
		this.type = type;
		this.material = material;
		this.price = price;
	}
	
	public double CalculateFurnitureDiscount()
	{
		if(material.equalsIgnoreCase("plastic"))
		{
			discount = 50;
			discountedPrice = price - (0.50*price);
		}
		else if(material.equalsIgnoreCase("wood"))
		{
			discount = 25;
			discountedPrice = price - (0.25*price);
		}
		else if(material.equalsIgnoreCase("metal"))
		{
			discount = 20;
			discountedPrice = price - (0.20*price);
		}
		else
		{
			discount = 10;
			discountedPrice = price - (0.10*price);
		}
		
		return discountedPrice;
	}
	public void PrintFurnitureDetails()
	{
		System.out.println("Furniture Details:");
		System.out.println("Type: "+type);
		System.out.println("Material: "+material);
		System.out.println("Price: "+price);
		System.out.println("Discounted Price of the given furniture"+CalculateFurnitureDiscount());
	}

	public static void main(String[] args) 
	{
		Program9_Furniture furniture = new Program9_Furniture("Table","wood",15000.0);
		furniture.PrintFurnitureDetails();
	}

}
