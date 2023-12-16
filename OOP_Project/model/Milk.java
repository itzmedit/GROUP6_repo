package OOP_Project.model;

import java.util.ArrayList;

public class Milk
{	
	public static ArrayList<Milk> milks = new ArrayList<Milk>(){}; 
    String name, image, scientificName, description;
    String milkName, milkDescription;
    String[] benefits;
    String[] brand1;
	String[] brand2;
	String[] brand3;
    String[] nutrients;
	String[] bestFor;
    String milkBrand1, milkBrand2, milkBrand3;

	public Milk(String name, String image, String scientificName, String description,
	String milkName, String milkDescription,
	String[] benefits, String[] nutrients, String[] bestFor,
	String[] brand1, String[] brand2, String[] brand3)
	{
		this.name = name;
		this.image = image;
		this.scientificName = scientificName;
		this.description = description;
		this.milkName = milkName;
		this.milkDescription = milkDescription;
		this.benefits = benefits;
		this.nutrients = nutrients;
		this.bestFor = bestFor;
		this.brand1 = brand1;
		this.brand2 = brand2;
		this.brand3 = brand3;
	}
    
	public String getMName(){
		return milkName;
	}
	public String[] getBest(){
		return bestFor;
	}
	public String getSName(){
		return scientificName;
	}
}
