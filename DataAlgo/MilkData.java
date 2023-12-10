package DataAlgo;

import java.util.ArrayList;

public class MilkData {
    protected ArrayList<String> milkName;
    private ArrayList<String> milkScienName;
    private ArrayList<String> milkDescriptn;
    private ArrayList<String> milkBenefits;
    private ArrayList<String> milkNutriFact;
    private ArrayList<String> milkHealthCon;
    protected ArrayList<String> milkGender;
    private ArrayList<String> milkOtherInfo;
    private ArrayList<String> milkBrands;
    private ArrayList<String> milkWeight;
    private ArrayList<String> milkPrices;
    private ArrayList<String> milkReference;
   
    // Search Filter = Gender, Age Stages, Vegetary Status, Health Condition/s
    
    public MilkData() {
        milkName = new ArrayList<String>();
        milkScienName = new ArrayList<String>();
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
        // Camel Milk
        milkName.add("Camel Mlk");
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