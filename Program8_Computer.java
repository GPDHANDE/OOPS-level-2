package org.ContractPod.OopsL2;

public class Program8_Computer 
{
	private String processor;
	private int RAM ;
	private int storage;
	
	public Program8_Computer(String processor, int RAM, int storage) 
	{
		this.processor = processor;
		this.RAM = RAM;
		this.storage = storage;
	}
	
	public void CalculatePrice()
	{
        double totalPrice = getProcessorCost() + getRAMCost() + getStorageCost();
        System.out.println("Total Price of an Computer is"+ totalPrice);
	}
	
	private double getProcessorCost() 
	{
        if (processor.equalsIgnoreCase("Intel i7")) {
            return 30000.0;
        } else if (processor.equalsIgnoreCase("AMD Ryzen 5")) {
            return 25000.0;
        } else {
            return 20000.0; // Default cost
        }
    }
	
	private double getRAMCost() 
	{
        return RAM *1000; 
    }
	
	private double getStorageCost() 
	{
        return storage * 250; 
    }
    
	public void PrintComputerDetails() 
	{
		System.out.println("Computer Details:");
		System.out.println("Processor: "+processor);
		System.out.println("RAM: "+ RAM);
		System.out.println("Storage: "+storage);
	}
	public static void main(String[] args) 
	{
		Program8_Computer computer = new Program8_Computer("amd ryzen 5", 12, 1000);
		computer.PrintComputerDetails();
		computer.CalculatePrice();
	}

}
