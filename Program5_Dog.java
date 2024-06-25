package org.ContractPod.OopsL2;

public class Program5_Dog 
{
	int age,weight;
	String breed;
	
	
	Program5_Dog(int age, int weight, String breed) 
	{
		this.age = age;
		this.weight = weight;
		this.breed = breed;
	}

	public int calculateAgeInHumanYears() 
	{
        int humanYears;
        if (age <= 2) 
        {
            humanYears = age * 11; // Dogs age faster in the first two years
        }
        else 
        {
            humanYears = 22 + ((age - 2) * 5); // After two years, each dog year is equivalent to 5 human years
        }
        return humanYears;
    }
    
	
	public void printDogDetails() 
	{
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age + " years (in dog years), " + calculateAgeInHumanYears() + " years (in human years)");
        System.out.println("Weight: " + weight + " kg");
    }
	public static void main(String[] args) 
	{
		Program5_Dog dog = new Program5_Dog(5,40,"Husky");
		dog.calculateAgeInHumanYears();
		dog.printDogDetails();
	}

}
