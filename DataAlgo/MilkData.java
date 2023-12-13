package DataAlgo;

import java.util.ArrayList;

public class MilkData {
    protected ArrayList<String> milkGender;
    protected ArrayList<String> milkAgeStages;
    protected ArrayList<String> milkVegetaryStatus;
    protected ArrayList<String> milkHealthCondition;
    protected ArrayList<String> milkSugarLevel;
    protected ArrayList<String> animalImage;
    protected ArrayList<String> milkName;
    protected ArrayList<String> animalName;
    protected ArrayList<String> animalScientificName;
    protected ArrayList<String> animalDescription;
    protected ArrayList<String> milkDescription;
    protected ArrayList<String> milkBenefits;
    protected ArrayList<String> milkNutriFact;
    protected ArrayList<String> milkOtherInfo;
    protected ArrayList<String> milkBrandsImage;
    protected ArrayList<String> milkBrands;
    protected ArrayList<String> milkWeight;
    protected ArrayList<String> milkPrices;
    protected ArrayList<String> milkReference;
   
    // Search Filter = Gender, Age Stages, Vegetary Status, Health Condition/s
    
    public MilkData() {
        milkGender = new ArrayList<String>();
        milkAgeStages = new ArrayList<String>();
        milkVegetaryStatus = new ArrayList<String>();
        milkHealthCondition = new ArrayList<String>();
        milkSugarLevel = new ArrayList<String>();
        milkName = new ArrayList<String>();
        animalImage = new ArrayList<String>();
        animalName = new ArrayList<String>();
        animalScientificName = new ArrayList<String>();
        animalDescription = new ArrayList<String>();
        milkDescription = new ArrayList<String>();
        milkBenefits = new ArrayList<String>();
        milkNutriFact = new ArrayList<String>();
        milkOtherInfo = new ArrayList<String>();
        milkBrandsImage = new ArrayList<String>();
        milkBrands = new ArrayList<String>();
        milkWeight = new ArrayList<String>();
        milkPrices = new ArrayList<String>();
        milkReference = new ArrayList<String>();

        // Animal-based Milk
        // Buffalo Milk - Initial
        milkName.add("Buffalo Milk");
        milkGender.add("Both"); 
        milkAgeStages.add("Infancy"); /
        milkVegetaryStatus.add("Non-Vegan"); 
        milkHealthCondition.add("None"); 
        milkSugarLevel.add("No Sugar"); 

        String str1 = "";

        animalImage.add(str1);
        animalName.add("Domestic Water Buffalo");
        animalScientificName.add("Bubalus Bubalis");
        
        String str1a = "The water buffalo, also referred to as the Asian buffalo, encompasses two main\n"
            + "subspecies: the river buffalo (B. bubalis bubalis) and the swamp buffalo (B.\n" 
            + "bubalis kerebau). These animals are generally larger compared to swamp\n"
            + "buffaloes. The river buffalo is commonly bred for dairy production, primarily in\n"
            + "Asia and Europe, but it is also utilized for meat production, serving as a\n"
            + "dual-purpose animal, and for draft work.";
            
        animalDescription.add(str1a);
        
        String str1b = "";
        
        milkDescription.add(str1b);

        String str1c = "";

        milkBenefits.add(str1c);

        String str1d = "";

        milkNutriFact.add(str1d);

        String str1e = "";

        milkOtherInfo.add(str1e);

        String str1f = "";

        milkBrandsImage.add(str1f);

        String str1g = "";

        milkBrands.add(str1g);

        String str1h = "";

        milkWeight.add(str1h);

        String str1i = "";

        milkPrices.add(str1i);

        String strj = "";

        milkReference.add(strj);

        // Camel Milk - Initial
        milkName.add("");
        milkGender.add(""); 
        milkAgeStages.add(""); 
        milkVegetaryStatus.add(""); 
        milkHealthCondition.add(""); 
        milkSugarLevel.add(""); 

        String str2 = "";

        animalImage.add(str2);
        animalName.add("");
        animalScientificName.add("");
        
        String str2a = "";
        animalDescription.add(str2a);
        
        String str2b = "";
        
        milkDescription.add(str2b);

        String str2c = "";

        milkBenefits.add(str2c);

        String str2d = "";

        milkNutriFact.add(str2d);

        String str2e = "";

        milkOtherInfo.add(str2e);

        String str2f = "";

        milkBrandsImage.add(str2f);

        String str2g = "";

        milkBrands.add(str2g);

        String str2h = "";

        milkWeight.add(str2h);

        String str1i = "";

        milkPrices.add(str1i);

        String strj = "";

        milkReference.add(strj);

        // Flavored Cow Milk
        milkName.add("Flavored Cow Milk");
        milkGender.add("Both"); // initial
        // Goat Milk
        milkName.add("Goat Mlk");
        milkGender.add("Male");
        // Lactose-free Cow Milk
        milkName.add("Lactose-free Cow Milk");
        milkGender.add("Female"); // initial
        // Low-fat Cow Milk
        milkName.add("Low-fat Cow Milk");
        milkGender.add("Both"); // initial
        // Organic Cow Milk
        milkName.add("Organic Cow Milk");
        milkGender.add("Male"); // initial
        // Reduced Fat Cow Milk
        milkName.add("Reduced Fat Cow Milk");
        milkGender.add("Both"); // initial
        // Sheep Milk
        milkName.add("Sheep Milk");
        milkGender.add("Both"); // initial
        // Skimmed Cow Milk
        milkName.add("Skimmed Cow Milk");
        milkGender.add("Both"); // initial
        // Whole Cow Milk
        milkName.add("Whole Cow Milk");
        milkGender.add("Female"); // initial

        // Plant-based Milk
        // Almond Milk
        milkName.add("Almond Milk");
        milkGender.add("Both"); // initial
        // Coconut Milk
        milkName.add("Coconut Milk");
        milkGender.add("Male"); // initial
        // Oat Milk
        milkName.add("Oat Milk");
        milkGender.add("Female"); // initial
        // Rice Milk
        milkName.add("Rice Milk");
        milkGender.add("Both"); // initial
        // Soy Milk
        milkName.add("Soy Milk");
        milkGender.add("Female"); // initial

        // Human-based Milk
        // Breast Milk
        milkName.add("Breast Milk");
        milkGender.add("Both"); // initial
    }

    // public void setArray(ArrayList<String> arrGender, ArrayList<String> arrAge, ArrayList<String> arrVeget, ArrayList<String> arrHealth, ArrayList<String> arrSugar) {
    //     arrGender = milkGender;
    // }
}