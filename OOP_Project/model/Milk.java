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
	public String getName(){
		return name;
	}
	public String getImage(){
		return image;
	}
	public String getDescription(){
		return description;
	}
	public String[] getBenefits(){
		return benefits;
	}
	public String getMilkDescription(){
		return milkDescription;
	}
	public String[] getNutrients(){
		return nutrients;
	}
	public String[] getBrand1(){
		return brand1;
	}
	public String[] getBrand2(){
		return brand2;
	}
	public String[] getBrand3(){
		return brand3;
	}
	public static void makeData(){
		String[] riceMilkBenefits = {
			"No Saturated Fat or Cholesterol",
			"Good Source of B Vitamins",
			"Promote Cardiovascular Health"
		};	
		String[] riceMilkNutrients = {
			"Calories: 115",
			"Fat: 2.4g",
			"Carbohydrates: 22.4g",
			"Fiber: 0.7g",
			"Protein: 0.7g"
		};
		String[] riceMilkBestFor = {
			"Dairy-Free Alternative",
			"Vegan and Vegetarian Diets",
			"Hypoallergenic"
		};
		Milk riceMilk = new Milk("Rice", "images/rice.png", "(Oryza sativa)", "Rice: global staple, diverse uses in Asian cuisine from grains to noodles and drinks.", 
		"Rice Milk", "Rice milk, a fortified plant-based option, crafted from rice and enriched with essential nutrients like B12, calcium, iron, and vitamin D.", 
			riceMilkBenefits, riceMilkNutrients, riceMilkBestFor,
		new String[]{"PURE HARVEST ORGANIC RICE MILK", "images/Pure.png", 
				"https://shp.lol/nbh6", 
				"https://shp.lol/MQ4y", 
				"https://shp.lol/sn2o"
      	},new String[]{"DREAM RICE MILK", "images/Dream.png", 
				"https://shp.lol/CoNe", 
				"https://shp.lol/2iXg", 
				"N/A"}, new String[]{"N/A","images/NA.png","N/A","N/A","N/A"});

      	Milk almondMilk = new Milk(
			"Almonds",
			"images/ALMONDS.png",
			"(Prunus Dulcis)",
			"Almonds from the USA, Spain, Australia vary, eating regularly helps against health issues.",
			"Almond Milk",
			"Almond milk is a plant-based alternative to traditional dairy milk, made by blending almonds with water and then straining out the solids.",
			new String[]{ //benefits
				"May boost your antioxidants",
				"May aid your vision health",
				"May reduce the risk of heart disease",
			},
			new String[]{ //nutrition facts per 1 cup
				"Calories: 73g",
				"Protein: 1g",
				"Carbohydrates: 10.5g",
				"Fat: 3g",
				"Fiber: 1g"
			},
			new String[]{ //Best For
				"People with weight management goals",
				"People with Lactose Intolerance",
				"People who are diabetic"
			},
			new String[]{ //brand1
				"Silk Almond Unsweetened Milk",
				"images/uAlmond.png",
				"https://shp.zone/AuR1",
				"https://shp.lol/ktER",
				"https://shp.lol/GzFJ",
			},
			new String[]{ //brand2
				"Natrue Unsweetened Almond Milk Drink",
				"images/natureAlmond.png",
				"https://shp.lol/VCiY",
				"https://shp.lol/d5rm",
				"https://shp.lol/e35w",
			},
			new String[]{
				"Almond Breeze Almond Milk Latter",
				"images/almondBreeze.png",
				"https://shp.lol/94hj",
				"https://shp.lol/o2RL",
				"https://shp.lol/kuau"

			}
		);
      
      	String[] soyMilkBenefits = {
			"No Saturated Fat or Cholesterol",
			"Good Source of B Vitamins",
			"May reduce the risk of chronic diseases"
		};
		
		String[] soyMilkNutrients = {
			"Calories: 100",
			"Fat: 4.9 grams",
			"Carbohydrates: 7 grams",
			"Protein: 7 grams",
			"Calcium: 380 milligrams(mg)"
		};
		
		String[] soyMilkBestFor = {
			"Dairy-Free Alternative",
			"Vegan and Vegetarian Diets",
			"Heart and Bone Health"
		};
		
		Milk soyMilk = new Milk(
			"Soy",
			"images/SOY.png",
			"(Glycine max)",
			"Soy: Plant-based protein, versatile, and nutritious.",
			"Soy Milk",
			"Soy milk, a versatile plant-based option rich in nutrients like protein, calcium, and vitamins, linked to various health advantages.",
			soyMilkBenefits,
			soyMilkNutrients,
			soyMilkBestFor,
			new String[]{
				"Silk Soymilk",
				"images/silkSoy.png",
				"https://shp.lol/hrn0",
				"https://shp.lol/p789",
				"https://shp.lol/hTNE"
			},
			new String[]{
				"Vitasoy",
				"images/vitasoy.png",
				"https://shp.lol/y2Ha",
				"https://shp.lol/lfFz",
				"https://shp.lol/OkeT"
			},
			new String[]{
				"Dutchmill Soymilk",
				"images/dutchSoy.png",
				"https://shp.lol/6gbB",
				"https://shp.lol/AThO",
				"https://shp.lol/GwbF"
			}
		);

    	Milk oatMilk = new Milk(
			"Oat",
			"images/OATS.png",
			"Avena sativa",
			"is a type of cereal grain from the Poaceae grass family of plants.",
			"Oats Milk",
			"Oat Milk is a plant milk derived from whole oat (Avena spp.) grains[1] by extracting the plant material with water.",
			new String[]{"Dairy Free", "High in Fibre", "High in Vitamins"},
			new String[]{"Calories: 120", "Protein: 3grams", "Fat: 5grams", "Vitamin B12: 50% of the Daily Value (DV)"},
			new String[]{"Lactose-Intolerant Individuals", "Vegans and Vegetarians", "People with Nut Allergies"},
			new String[]{"Oat Side", "images/oatside.png", "https://shp.lol/rTwS", "https://shp.lol/0FTz", "https://shp.lol/yZbQ"},
			new String[]{"Pure Harvest Organic Oatmilk", "images/pureoat.png", "https://shp.lol/R314", "https://shp.lol/ZPjA", "https://shp.lol/03hF"},
			new String[]{"Pacific Foods Organic Oat Plant-based", "images/pacific.png", "https://shp.lol/J6GS", "https://shp.lol/7eQJ", "https://shp.lol/lt2M"}
		);

    	Milk coconutMilk = new Milk (
			"Coconut",
			"images/coconut.png",
			"Cocos Nucifera",
			"The coconut palm, part of the Arecaceae family, provides fruit, oil, water, and materials like husks and fronds.",
			"Coconut Milk",
			"Coconut Milk is an opaque, milky white liquid extracted from the grated pulp of mature coconuts.",
			new String[]{ //benefits
				"Antioxidant protection from disease",
				"Helps increase stamina",
				"Helps boost immunity"
			},
			new String[]{ //nutrition facts
				"Calories: 552",
				"Protein: 5.5g",
				"Carbohydrates: 13.3g",
				"Fat: 57.1g",
				"Magnesium: 88.8mg"
			},
			new String[]{ //Best for
				"People who want to lose weight",
				"People who want to boost their stamina",
				"Heart health"
			},
			new String[]{ //brand1
				"Coco Mama Fresh Gata",
				"images/cMAMA.png",
				"https://shp.lol/pPIJ",
				"https://shp.lol/wo9E",
				"https://shp.lol/oq7k"
			},
			new String[]{ //brand2
				"Field Day",
				"images/field.png",
				"https://shp.lol/0kgf",
				"https://shp.zone/1EfH",
				"https://shp.zone/Zv8H"
			},
			new String[]{//brand3
				"Nature's Charm",
				"images/nCharm.png",
				"https://shp.lol/wZA9",
				"https://shp.zone/rjzu",
				"https://shp.zone/mYVY"
			}
		);
		/* 
		Milk breastMilk = new Milk(
		null, null, null, null, null, null,
			new String[]{ //benefits
				"Antioxidant protection from disease",
				"Helps increase stamina",
				"Helps boost immunity"
			},
			new String[]{ //nutrition facts
				"Calories: 552",
				"Protein: 5.5g",
				"Carbohydrates: 13.3g",
				"Fat: 57.1g",
				"Magnesium: 88.8mg"
			},
			new String[]{ //Best for
				"People who want to lose weight",
				"People who want to boost their stamina",
				"Heart health"
			},
			new String[]{ //brand1
				"Al Ain Camel Milk",
				"images/alAin.png",
				"https://goo.su/DzjHam",
				"N/A",
				"N/A"
			},
			new String[]{ //brand2
				"Desertcart Camel Milk",
				"images/Desert.png",
				"https://goo.su/CHHpYh",
				"N/A",
				"N/A"
			},
			new String[]{//brand3
				"Pure Camel Milk Powder",
				"images/nCharm.png",
				"https://goo.su/WcXt",
				"N/A",
				"N/A"
			});
		 */
		Milk camelMilk = new Milk(
		"Camel", 
		"images/Camel.png", 
		"(Camelus)", 
		"Dairy cattle, commonly referred to as dairy cows, are a specific type of cattle primarily bred and raised for milk production.", 
		"Camel Milk", 
		"Camel milk is a white liquid produced by the mammary glands of female camels. It has been a staple food in desert cultures for centuries, prized for its unique taste",
			new String[]{ //benefits
				"Antioxidant protection from disease",
				"Helps increase stamina",
				"Helps boost immunity"
			},
			new String[]{ //nutrition facts
				"Calories: 552",
				"Protein: 5.5g",
				"Carbohydrates: 13.3g",
				"Fat: 57.1g",
				"Magnesium: 88.8mg"
			},
			new String[]{ //Best for
				"People who want to lose weight",
				"People who want to boost their stamina",
				"Heart health"
			},
			new String[]{ //brand1
				"Al Ain Camel Milk",
				"images/alAin.png",
				"https://goo.su/DzjHam",
				"N/A",
				"N/A"
			},
			new String[]{ //brand2
				"Desertcart Camel Milk",
				"images/Desert.png",
				"https://goo.su/CHHpYh",
				"N/A",
				"N/A"
			},
			new String[]{//brand3
				"Pure Camel Milk Powder",
				"images/pC.png",
				"https://goo.su/WcXt",
				"N/A",
				"N/A"
			}
		);
		/* 
		Milk breastMilk = new Milk(
		null, null, null, null, null, null,
			new String[]{ //benefits
				"Antioxidant protection from disease",
				"Helps increase stamina",
				"Helps boost immunity"
			},
			new String[]{ //nutrition facts
				"Calories: 552",
				"Protein: 5.5g",
				"Carbohydrates: 13.3g",
				"Fat: 57.1g",
				"Magnesium: 88.8mg"
			},
			new String[]{ //Best for
				"People who want to lose weight",
				"People who want to boost their stamina",
				"Heart health"
			},
			new String[]{ //brand1
				"Al Ain Camel Milk",
				"images/alAin.png",
				"https://goo.su/DzjHam",
				"N/A",
				"N/A"
			},
			new String[]{ //brand2
				"Desertcart Camel Milk",
				"images/Desert.png",
				"https://goo.su/CHHpYh",
				"N/A",
				"N/A"
			},
			new String[]{//brand3
				"Pure Camel Milk Powder",
				"images/nCharm.png",
				"https://goo.su/WcXt",
				"N/A",
				"N/A"
			});

		Milk breastMilk = new Milk(
		null, null, null, null, null, null,
			new String[]{ //benefits
				"Antioxidant protection from disease",
				"Helps increase stamina",
				"Helps boost immunity"
			},
			new String[]{ //nutrition facts
				"Calories: 552",
				"Protein: 5.5g",
				"Carbohydrates: 13.3g",
				"Fat: 57.1g",
				"Magnesium: 88.8mg"
			},
			new String[]{ //Best for
				"People who want to lose weight",
				"People who want to boost their stamina",
				"Heart health"
			},
			new String[]{ //brand1
				"Al Ain Camel Milk",
				"images/alAin.png",
				"https://goo.su/DzjHam",
				"N/A",
				"N/A"
			},
			new String[]{ //brand2
				"Desertcart Camel Milk",
				"images/Desert.png",
				"https://goo.su/CHHpYh",
				"N/A",
				"N/A"
			},
			new String[]{//brand3
				"Pure Camel Milk Powder",
				"images/nCharm.png",
				"https://goo.su/WcXt",
				"N/A",
				"N/A"
			});

		Milk breastMilk = new Milk(
		null, null, null, null, null, null,
			new String[]{ //benefits
				"Antioxidant protection from disease",
				"Helps increase stamina",
				"Helps boost immunity"
			},
			new String[]{ //nutrition facts
				"Calories: 552",
				"Protein: 5.5g",
				"Carbohydrates: 13.3g",
				"Fat: 57.1g",
				"Magnesium: 88.8mg"
			},
			new String[]{ //Best for
				"People who want to lose weight",
				"People who want to boost their stamina",
				"Heart health"
			},
			new String[]{ //brand1
				"Al Ain Camel Milk",
				"images/alAin.png",
				"https://goo.su/DzjHam",
				"N/A",
				"N/A"
			},
			new String[]{ //brand2
				"Desertcart Camel Milk",
				"images/Desert.png",
				"https://goo.su/CHHpYh",
				"N/A",
				"N/A"
			},
			new String[]{//brand3
				"Pure Camel Milk Powder",
				"images/nCharm.png",
				"https://goo.su/WcXt",
				"N/A",
				"N/A"
			});

		Milk breastMilk = new Milk(
		null, null, null, null, null, null,
			new String[]{ //benefits
				"Antioxidant protection from disease",
				"Helps increase stamina",
				"Helps boost immunity"
			},
			new String[]{ //nutrition facts
				"Calories: 552",
				"Protein: 5.5g",
				"Carbohydrates: 13.3g",
				"Fat: 57.1g",
				"Magnesium: 88.8mg"
			},
			new String[]{ //Best for
				"People who want to lose weight",
				"People who want to boost their stamina",
				"Heart health"
			},
			new String[]{ //brand1
				"Al Ain Camel Milk",
				"images/alAin.png",
				"https://goo.su/DzjHam",
				"N/A",
				"N/A"
			},
			new String[]{ //brand2
				"Desertcart Camel Milk",
				"images/Desert.png",
				"https://goo.su/CHHpYh",
				"N/A",
				"N/A"
			},
			new String[]{//brand3
				"Pure Camel Milk Powder",
				"images/nCharm.png",
				"https://goo.su/WcXt",
				"N/A",
				"N/A"
			});

		Milk breastMilk = new Milk(
		null, null, null, null, null, null,
			new String[]{ //benefits
				"Antioxidant protection from disease",
				"Helps increase stamina",
				"Helps boost immunity"
			},
			new String[]{ //nutrition facts
				"Calories: 552",
				"Protein: 5.5g",
				"Carbohydrates: 13.3g",
				"Fat: 57.1g",
				"Magnesium: 88.8mg"
			},
			new String[]{ //Best for
				"People who want to lose weight",
				"People who want to boost their stamina",
				"Heart health"
			},
			new String[]{ //brand1
				"Al Ain Camel Milk",
				"images/alAin.png",
				"https://goo.su/DzjHam",
				"N/A",
				"N/A"
			},
			new String[]{ //brand2
				"Desertcart Camel Milk",
				"images/Desert.png",
				"https://goo.su/CHHpYh",
				"N/A",
				"N/A"
			},
			new String[]{//brand3
				"Pure Camel Milk Powder",
				"images/nCharm.png",
				"https://goo.su/WcXt",
				"N/A",
				"N/A"
			});

		Milk breastMilk = new Milk(
		null, null, null, null, null, null,
			new String[]{ //benefits
				"Antioxidant protection from disease",
				"Helps increase stamina",
				"Helps boost immunity"
			},
			new String[]{ //nutrition facts
				"Calories: 552",
				"Protein: 5.5g",
				"Carbohydrates: 13.3g",
				"Fat: 57.1g",
				"Magnesium: 88.8mg"
			},
			new String[]{ //Best for
				"People who want to lose weight",
				"People who want to boost their stamina",
				"Heart health"
			},
			new String[]{ //brand1
				"Al Ain Camel Milk",
				"images/alAin.png",
				"https://goo.su/DzjHam",
				"N/A",
				"N/A"
			},
			new String[]{ //brand2
				"Desertcart Camel Milk",
				"images/Desert.png",
				"https://goo.su/CHHpYh",
				"N/A",
				"N/A"
			},
			new String[]{//brand3
				"Pure Camel Milk Powder",
				"images/nCharm.png",
				"https://goo.su/WcXt",
				"N/A",
				"N/A"
			});

		Milk breastMilk = new Milk(
		null, null, null, null, null, null,
			new String[]{ //benefits
				"Antioxidant protection from disease",
				"Helps increase stamina",
				"Helps boost immunity"
			},
			new String[]{ //nutrition facts
				"Calories: 552",
				"Protein: 5.5g",
				"Carbohydrates: 13.3g",
				"Fat: 57.1g",
				"Magnesium: 88.8mg"
			},
			new String[]{ //Best for
				"People who want to lose weight",
				"People who want to boost their stamina",
				"Heart health"
			},
			new String[]{ //brand1
				"Al Ain Camel Milk",
				"images/alAin.png",
				"https://goo.su/DzjHam",
				"N/A",
				"N/A"
			},
			new String[]{ //brand2
				"Desertcart Camel Milk",
				"images/Desert.png",
				"https://goo.su/CHHpYh",
				"N/A",
				"N/A"
			},
			new String[]{//brand3
				"Pure Camel Milk Powder",
				"images/nCharm.png",
				"https://goo.su/WcXt",
				"N/A",
				"N/A"
			});

		Milk breastMilk = new Milk(
		null, null, null, null, null, null,
			new String[]{ //benefits
				"Antioxidant protection from disease",
				"Helps increase stamina",
				"Helps boost immunity"
			},
			new String[]{ //nutrition facts
				"Calories: 552",
				"Protein: 5.5g",
				"Carbohydrates: 13.3g",
				"Fat: 57.1g",
				"Magnesium: 88.8mg"
			},
			new String[]{ //Best for
				"People who want to lose weight",
				"People who want to boost their stamina",
				"Heart health"
			},
			new String[]{ //brand1
				"Al Ain Camel Milk",
				"images/alAin.png",
				"https://goo.su/DzjHam",
				"N/A",
				"N/A"
			},
			new String[]{ //brand2
				"Desertcart Camel Milk",
				"images/Desert.png",
				"https://goo.su/CHHpYh",
				"N/A",
				"N/A"
			},
			new String[]{//brand3
				"Pure Camel Milk Powder",
				"images/nCharm.png",
				"https://goo.su/WcXt",
				"N/A",
				"N/A"
			});

		Milk breastMilk = new Milk(
		null, null, null, null, null, null,
			new String[]{ //benefits
				"Antioxidant protection from disease",
				"Helps increase stamina",
				"Helps boost immunity"
			},
			new String[]{ //nutrition facts
				"Calories: 552",
				"Protein: 5.5g",
				"Carbohydrates: 13.3g",
				"Fat: 57.1g",
				"Magnesium: 88.8mg"
			},
			new String[]{ //Best for
				"People who want to lose weight",
				"People who want to boost their stamina",
				"Heart health"
			},
			new String[]{ //brand1
				"Al Ain Camel Milk",
				"images/alAin.png",
				"https://goo.su/DzjHam",
				"N/A",
				"N/A"
			},
			new String[]{ //brand2
				"Desertcart Camel Milk",
				"images/Desert.png",
				"https://goo.su/CHHpYh",
				"N/A",
				"N/A"
			},
			new String[]{//brand3
				"Pure Camel Milk Powder",
				"images/nCharm.png",
				"https://goo.su/WcXt",
				"N/A",
				"N/A"
			});
		*/
		Milk.milks.add(almondMilk);
		Milk.milks.add(riceMilk);
		Milk.milks.add(oatMilk);
		Milk.milks.add(coconutMilk);
		Milk.milks.add(soyMilk);
		Milk.milks.add(camelMilk);
	}

}
