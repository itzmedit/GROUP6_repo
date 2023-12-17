package DataAlgo;

import MainInterface.*;

import java.util.ArrayList;

public class SearchData {
   private MainInterface main;
   private MilkData milk;
   private String gender, age, veget, health, sugar;
   public ArrayList<String> milkNameResult;

   public SearchData() {
      main = new MainInterface();

      gender = main.getMGender();
      age = main.getMAge();
      veget = main.getMVeget();
      health = main.getMHealth();
      sugar = main.getMSugar();

      System.out.println("Gender: " + gender);
      System.out.println("Age: " + age);
      System.out.println("Veget: " + veget);
      System.out.println("Health: " + health);
      System.out.println("Sugar: " + sugar);

      milk = new MilkData();
      
      milkNameResult = new ArrayList<String>();

      if (age.equals("Infancy (Birth to 2 years old)")) {
         // HUMAN-BASED MILK
         if (veget.equals("Unidentified") && health.equals("None") && (sugar.equals("All Sugar Levels") 
         || sugar.equals("Unsweetened (0%)") || sugar.equals("Low Sugar (less than 5%)"))) {
            milkNameResult.add(milk.milkName.get(16)); // Breast Milk
         } 
      }

      else {
         if (!veget.equals("Ovo-vegetarian") && !veget.equals("Vegan")) { 
            // ANIMAL-BASED MILK
            if (sugar.equals("All Sugar Levels") || sugar.equals("Low Sugar (less than 5%)")) { 
               if (!health.equals("Milk Allergy") && !health.equals("Lactose Intolerance")) {
                  milkNameResult.add(milk.milkName.get(0)); // Buffalo Milk
                  milkNameResult.add(milk.milkName.get(1)); // Camel Milk
                  milkNameResult.add(milk.milkName.get(6)); // Organic Cow Milk
                  milkNameResult.add(milk.milkName.get(8)); // Sheep Milk
                  milkNameResult.add(milk.milkName.get(9)); // Skimmed Cow Milk
               }

               if (!health.equals("Milk Allergy") || !health.equals("High Cholesterol") 
                  || !health.equals("Lactose Intolerance")) {
                     milkNameResult.add(milk.milkName.get(3)); // Goat Milk
               }
            }

            if (sugar.equals("All Sugar Levels") || sugar.equals("Unsweetened (0%)")
               || sugar.equals("Low Sugar (less than 5%)")) {
                  if (!health.equals("Milk Allergy") && !health.equals("Lactose Intolerance")) {
                     milkNameResult.add(milk.milkName.get(7)); // Reduced Fat Cow Milk
                     milkNameResult.add(milk.milkName.get(10)); // Whole Cow Milk
                  }
            }

            if (sugar.equals("All Sugar Levels") || sugar.equals("Unsweetened (0%)")) {
               if (!health.equals("Milk Allergy") && !health.equals("Lactose Intolerance")) {
                  milkNameResult.add(milk.milkName.get(5)); // Low-fat Cow Milk
               }
            }

            if (!sugar.equals("Unsweetened (0%)") && !sugar.equals("Low Sugar (less than 5%)")) {
               if (!health.equals("Milk Allergy") && !health.equals("Lactose Intolerance")
                  && !health.equals("Diabetic")) {
                     milkNameResult.add(milk.milkName.get(2)); // Flavored Cow Milk
               }
            } 

            else {
               if (!health.equals("Milk Allergy") && !health.equals("High Cholesterol")) {
                  milkNameResult.add(milk.milkName.get(4)); // Lactose-free Cow Milk
               }
            }
         }

         else {
            // PLANT-BASED MILK
            if (sugar.equals("All Sugar Levels") || sugar.equals("Unsweetened (0%)")
               || sugar.equals("Low Sugar (less than 5%)")) {
                  if (!health.equals("Nut Allergy") && !health.equals("Kidney Issues")) {
                     milkNameResult.add(milk.milkName.get(11)); // Almond Milk
                  }

                  if (!health.equals("Soy Allergy") && !health.equals("Thyroid Issues")) {
                     milkNameResult.add(milk.milkName.get(15)); // Soy Milk
                  }
            }

            if (sugar.equals("All Sugar Levels") || sugar.equals("Unsweetened (0%)")) {
               if (!health.equals("Coconut Allergy")) {
                  milkNameResult.add(milk.milkName.get(12)); // Coconut Milk
               }

               if (!health.equals("Rice Allergy") && !health.equals("Arsenic Concerns")
                  && !health.equals("Nutritional Deficiencies")) {
                     milkNameResult.add(milk.milkName.get(14)); // Rice Milk
               }
            }

            if (sugar.equals("All Sugar Levels") || sugar.equals("Low Sugar (less than 5%)")) {
               if (!health.equals("Oat Allergy")) {
                  milkNameResult.add(milk.milkName.get(13)); // Oat Milk
               }
            }
         }
      }

      if (milkNameResult.size() == 0) {
         System.out.println("None");
      }
   }
}