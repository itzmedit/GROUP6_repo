package DataAlgo;

import java.util.ArrayList;

public class MilkData {
    protected ArrayList<String> milkName;
    protected ArrayList<String> animalName;
    protected ArrayList<String> animalScienName;
    protected ArrayList<String> animalDescriptn;
    protected ArrayList<String> milkDescriptn;
    protected ArrayList<String> milkBenefits;
    protected ArrayList<String> milkNutriFact;
    protected ArrayList<String> milkHealthCon;
    protected ArrayList<String> milkGender;
    protected ArrayList<String> milkOtherInfo;
    protected ArrayList<String> milkBrands;
    protected ArrayList<String> milkWeight;
    protected ArrayList<String> milkPrices;
    protected ArrayList<String> milkReference;
   
    // Search Filter = Gender, Age Stages, Vegetary Status, Health Condition/s
    
    public MilkData() {
        milkName = new ArrayList<String>();
        animalName = new ArrayList<String>();
        animalScienName = new ArrayList<String>();
        animalDescriptn = new ArrayList<String>();
        milkDescriptn = new ArrayList<String>();
        milkBenefits = new ArrayList<String>();
        milkNutriFact = new ArrayList<String>();
        milkHealthCon = new ArrayList<String>();
        milkGender = new ArrayList<String>();
        milkOtherInfo = new ArrayList<String>();
        milkBrands = new ArrayList<String>();
        milkWeight = new ArrayList<String>();
        milkPrices = new ArrayList<String>();
        milkReference = new ArrayList<String>();

        // Animal-based Milk
        // Buffalo Milk
        milkName.add("Buffalo Milk");
        milkGender.add("Both"); // initial
       
        animalName.add("Domestic Water Buffalo");
        animalScienName.add("Bubalus Bubalis");
        
        String str1a = "The water buffalo, also referred to as the Asian buffalo, encompasses two main\n"
            + "subspecies: the river buffalo (B. bubalis bubalis) and the swamp buffalo (B.\n" 
            + "bubalis kerebau). These animals are generally larger compared to swamp\n"
            + "buffaloes. The river buffalo is commonly bred for dairy production, primarily in\n"
            + "Asia and Europe, but it is also utilized for meat production, serving as a\n"
            + "dual-purpose animal, and for draft work.";
            
        animalDescriptn.add(str1a);
        
        String str1b;
        
        milkDescriptn.add("");
        // Camel Milk
        milkName.add("Camel Milk");
        milkGender.add("Female"); // initial
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