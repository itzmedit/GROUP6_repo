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
      sugar = main.getMHealth();

      System.out.println("Gender: " + gender);
      System.out.println("Age: " + age);
      System.out.println("Veget: " + veget);
      System.out.println("Health: " + health);
      System.out.println("Sugar: " + sugar);

      milk = new MilkData();
      
      milkNameResult = new ArrayList<String>();

      if (gender.equals(milk.milkGender.get(0))) { milkNameResult.add(milk.milkName.get(0)); }
   }
}