package DataAlgo;

import java.util.ArrayList;

public class MilkData {
    protected ArrayList<String> animalImage;
    protected ArrayList<String> milkName;
    protected ArrayList<String> animalName;
    protected ArrayList<String> animalScientificName;
    protected ArrayList<String> animalDescription;
    protected ArrayList<String> milkDescription;
    protected ArrayList<String> milkBenefits;
    protected ArrayList<String> milkNutriFact;
    protected ArrayList<String> milkBestFor;
    protected ArrayList<String> milkBrands; // initial
    protected ArrayList<String> buffaloBrandImages;
    protected ArrayList<String> buffaloBrandNames;
    protected ArrayList<String> buffaloBrandLinks;
    protected ArrayList<String> milkReferences;
   
    // Search Filter = Gender, Age Stages, Vegetary Status, Health Condition/s
    
    public MilkData() {
        milkName = new ArrayList<String>();
        animalImage = new ArrayList<String>();
        animalName = new ArrayList<String>();
        animalScientificName = new ArrayList<String>();
        animalDescription = new ArrayList<String>();
        milkDescription = new ArrayList<String>();
        milkBenefits = new ArrayList<String>();
        milkNutriFact = new ArrayList<String>();
        milkBestFor = new ArrayList<String>();
        milkBrands = new ArrayList<String>();
        buffaloBrandImages = new ArrayList<String>();
        buffaloBrandNames = new ArrayList<String>();
        buffaloBrandLinks = new ArrayList<String>();
        milkReferences = new ArrayList<String>();

        // ANIMAL-BASED MILK
        // Buffalo Milk - Initial
        milkName.add("Buffalo Milk");

        final String str1 = "";

        animalImage.add(str1);
        animalName.add("DOMESTIC WATER BUFFALO");
        animalScientificName.add("(Bubalus Bubalis)");
        
        final String str1a = "\tThe water buffalo, also referred\nto as the Asian buffalo, encompasses\ntwo main "
            + "subspecies: the river buffalo\n(B. bubalis bubalis) and the swamp\n buffalo (B." 
            + "bubalis kerebau)"; 
            
            // These animals are generally larger compared to swamp\n"
            // + "buffaloes. The river buffalo is commonly bred for dairy production, primarily in\n"
            // + "Asia and Europe, but it is also utilized for meat production, serving as a\n"
            // + "dual-purpose animal, and for draft work.";
            
        animalDescription.add(str1a);
        
        final String str1b = "\tBuffalo milk boasts higher fat,\nprotein, lactose, vitamins, and minerals\nin " 
            + "comparison to cow's milk.";
            
            // Its whiter color and thicker consistency make it ideal\n"
            // + "for producing fat-based dairy products.";
        
        milkDescription.add(str1b);

        final String str1c = "1. May support bone health.\nBuffalo milk is rich in calcium,\nessential for bone "
            + "development.\n" + "2. May provide antioxidant activity.\nBuffalo milk, akin to other dairy products,\n"
            + "possesses antioxidants derived from its vitamins,\n minerals, and bioactive compounds.\n"
            + "3. May improve heart health.\nBeta-lactoglobulin, a significant whey\nprotein found in buffalo milk,\n"
            + "along with potassium, has potential\nin reducing high blood pressure.";

        milkBenefits.add(str1c);

        final String str1d = "- Calories: 237\n" + "- Total Fat: 17g (26% daily value)\n" 
            + "- Saturated Fat: 11g (55% daily value)\n" + "- Carbohydrates: 13g (4% daily value)\n"
            + "- Sugar: 13g\n" + "- Protein: 9.2 g (18% daily value)\n" + "- Calcium: 41%\n"
            + "- Iron: 2%";
            
            // + "- Phosphorus (41% daily value)\n" + "- Magnesium (19% daily value)\n"
            // + "- Vitamin A (14% daily value)";

        milkNutriFact.add(str1d); // 1 cup or 224 grams

        final String str1e = "- People who are lactose intolerant\nor mild allergy to cow's milk\n"
            + "- People with high cholesterol";

            // + "- Substitute for protein shakes\n" + "- Women\n" + 

        milkBestFor.add(str1e);

        final String str1f = "1. Buffy's Philippines - BUFFY'S PHILIPPINES (@buffysphilippines) (instagram.com)\n"
            + "2. Feel Well Raw Buffalo Milk - organics.ph/products/feel-well-raw-buffalo-milk-240ml-pre-order-1-wk-delivery (P228)\n"
            + "3. DVF Dairy Farm Gatas Ng Kalabaw - DVF Dairy Farm Gatas Ng Kalabaw | Shopee Philippines (P318 1L)\n"
            + "4. Organic Raw Carabao Milk - Organic Raw Carabao Milk, Frozen (1 liter) | The Green Grocer Manila (P275 1L)";

        milkBrands.add(str1f); // AVAILABLE BRANDS IN THE PHILIPPINES

        // final String str1g = "- Frontiers | Bubalus bubalis: A Short Story (frontiersin.org)\n"
        //     + "- Buffalo Milk: Nutrition, Benefits, and How It Compares (healthline.com)\n"
        //     + "- Magnesium | The Nutrition Source | Harvard T.H. Chan School of Public Health\n"
        //     + "- Buffalo Milk vs Cow Milk - Difference and Comparison | Diffen\n"
        //     + "- 5 Reasons Why Drinking Buffalo Milk is Good for Health | Onlymyhealth";

        // milkReferences.add(str1g);

        // Camel Milk - Initial (None)
        milkName.add("Camel Milk");

        final String str2 = "";

        animalImage.add(str2);
        animalName.add("");
        animalScientificName.add("");
        
        final String str2a = "";

        animalDescription.add(str2a);
        
        final String str2b = "";
        
        milkDescription.add(str2b);

        final String str2c = "";

        milkBenefits.add(str2c);

        final String str2d = "";

        milkNutriFact.add(str2d);

        final String str2e = "";

        milkBestFor.add(str2e);

        final String str2f = "";

        milkBrands.add(str2f);

        final String str2g = "";

        milkReferences.add(str2g);

        // Flavored Cow Milk - Initial
        milkName.add("Flavored Cow Milk");

        final String str3 = "";

        animalImage.add(str3);
        animalName.add("DAIRY CATTLE / COW");
        animalScientificName.add("(Bos Taurus)");
        
        final String str3a = "\tairy cows produce substantial quantities of milk throughout their lives.\n"
            + "Their highest milk production occurs roughly 40 to 60 days after giving\n"
            + "birth. After this peak period, milk production gradually decreases until it\n"
            + "ceases at approximately 10 months after calving.";

        animalDescription.add(str3a);
        
        final String str3b = "\tFlavored milk is milk enhanced with additional flavors, typically using sweeteners and\n"
            + "flavorings. Chocolate, strawberry, and vanilla are the most popular flavors, although\n"
            + "numerous other flavors are also available in the market.";
        
        milkDescription.add(str3b);

        final String str3c = "- Helps lower blood pressure\n" + "- Good for healthy bone development\n"
            + "- Helps prevent weight gain\n" + "- Maintains heart health\n" + "- Helps with inflammatory issues\n"
            + "- Boosts Immune";

        milkBenefits.add(str3c);

        final String str3d = "- Calories: 190 calories\n" + "- Protein: 8 grams\n" + "- Fat: 5 grams\n"
            + "- Saturated Fat: 3 grams\n" + "- Cholesterol: 20 milligrams\n" + "- Carbohydrates: 30 grams\n"
            + "- Sugar: 26 grams\n" + "- Calcium\n" + "- Vitamin D\n" + "- Vitamin B12\n" + "- Potassium\n"
            + "- Phosphorus\n" + "- Vitamin A\n" + "- Vitamin B2\n" + "- Vitamin B3\n" + "- Probiotics\n"
            + "- Zinc";

        milkNutriFact.add(str3d);

        final String str3e = "- Children and Adolescents\n" + "- Individuals with Lactose Intolerance\n"
            + "- Post-Workout Recovery\n" + "- Weight Gain or Maintenance\n" + "- Taste Preference\n"
            + "- Convenience\n" + "- Dietary Variety";

        milkBestFor.add(str3e);

        final String str3f = "1. Nestle Bear Brand Sterilized Milk with Ginseng Extract Added - https://www.lazada.com.ph/products/nestle-bear-brand-sterilized-milk-with-ginseng-extract-added-vanilla-flavored-milk-12-pieces-x-200-ml-i1798623798-s7633664962.html?from_gmc=1 (₱472.00)\n"
            + "2. NESTLÉ CHUCKIE Chocolate Flavoured Milk 180ml - Pack of 6 - https://shopee.ph/product/120674187/21979015201 (₱170)\n"
            + "3. Bear brand 300g + b.b Choco 300g - https://shopee.ph/product/142894072/22252511034 (₱240)\n"
            + "4. Bear Brand Fortified Chocolate Flavored Powdered Milk 300g - https://shopsuki.ph/products/4800361339520?variant=32857289588868&currency=PHP&utm_medium=product_sync&utm_source=google&utm_content=sag_organic&utm_campaign=sag_organic&srsltid=AfmBOoralyvj2r1IWUD0RYJ33yiJygQfkdlocvBDXMqXCv8LPxOSHW3R3KI (₱115.65)\n"
            + "5. Bear Brand Adult Plus Milk Powder With Coffee 300g - https://www.digitindahan.com.ph/products/bear-brand-adult-plus-with-coffee-300g?variant=40683943428140&currency=PHP&utm_medium=product_sync&utm_source=google&utm_content=sag_organic&utm_campaign=sag_organic&srsltid=AfmBOoqeB-lFZKZMKHebXWa7pPM43S9fhzgX-RbkQqFnS_zlD3K6Hn2xEg4 (₱162.00)\n"
            + "6. Mr Milk Yoghurt Flavoured Milk Drink 100Ml.6) - https://www.lazada.com.ph/products/mr-milk-yoghurt-flavoured-milk-drink-100ml6-i2960416865-s14469378955.html?from_gmc=1 (₱85.00)\n"
            + "7. Mr Milk Yoghurt Milk Grn Apple 100ml 6'S - https://www.allday.com.ph/mr-milk-yoghurt-milk-grn-apple-100ml-6-s.html (₱54.50)\n"
            + "8. MR. MILK Strawberry Yoghurt Flavored Milk Drink that Kids Love - https://www.lazada.com.ph/products/mr-milk-strawberry-yoghurt-flavored-milk-drink-that-kids-love-100ml-x-6-i4219358114-s23434989548.html?from_gmc=1 (₱188.00)\n"
            + "9. Mr Milk Yoghurt Milk Mango 100ML - https://www.allday.com.ph/mr-milk-yoghurt-milk-mango-100ml-6-s.html (₱54.50) \n"
            + "10. Cowhead Chocolate Flavoured Milk 1L - http://xn--https-0m4b//www.lazada.com.ph/products/cowhead-chocolate-flavoured-milk-1l-i2338940615-s10619953706.html?from_gmc=1 (₱120.75)\n"
            + "11. Cowhead Premium Strawberry Flavored Milk 1L - https://shopee.ph/product/149174871/16720998114\n"
            + "12. Cowhead Banana Flavored Milk 200ml Set of 4 - https://www.lazada.com.ph/products/cowhead-banana-flavored-milk-200ml-set-of-4-i2392389648-s10895674249.html?from_gmc=1(₱279.00)\n"
            + "13. Nutriboost Strawberry Flavoured Drink with Milk 200mL - Pack of 6 - https://shopee.ph/product/484302854/19380184340 (₱132)\n"
            + "14. Nutriboost Milk Orange | 110ml - https://www.allday.com.ph/nutriboost-orange-110ml.html (₱14.00)\n"
            + "15. 12+1 Buy Nutriboost Chocolate Milk Drink 200mL Pack Of 12 - https://www.lazada.com.ph/products/121-buy-nutriboost-chocolate-milk-drink-200ml-pack-of-12-get-1-free-i4144021246-s23061661508.html?from_gmc=1 (₱821.00)";

        milkBrands.add(str3f); // AVAILABLE BRANDS IN THE PHILIPPINES

        final String str3g = ""; // none

        milkReferences.add(str3g);

        // Goat Milk - Initial
        milkName.add("Goat Mlk");

        final String str4 = "";

        animalImage.add(str4);
        animalName.add("GOAT");
        animalScientificName.add("(Capra Aegragrus Hircus)");
        
        final String str4a = "\tThe domesticated species of goat antelope, derived from the Capra Aegagrus, is\n" 
            + "commonly raised as livestock. Originating from southwest Asia and parts of\n"
            + "Eastern Europe, these goats are exceptionally clean animals and exhibit\n"
            + "selective feeding habits compared to cows, sheep, pigs, and even dogs. They\n"
            + "are highly intelligent and curious creatures, often displaying a strong desire to\n"
            + "explore and investigate unfamiliar surroundings or objects.";

        animalDescription.add(str4a);
        
        final String str4b = ""; // none
        
        milkDescription.add(str4b);

        final String str4c = "- High in Digestible Protein\n" + "- May not provoke Milk Allergies\n"
            + "- Good for the skin\n" + "- Increases Platelet Count";

        milkBenefits.add(str4c);

        final String str4d = "- Calories: 168\n" + "- Carbohydrates: 10.9 g\n" + "- Protein: 8.7g\n"
            + "- Fat: 10.1 g\n" + "- Sugar: 11g\n" + "- Selenium (3.7 micrograms / 5% DV)\n"
            + "- Calcium (327 mg / 33% DV)\n" + "- Phosphorus (271 mg / 27% DV)\n"
            + "- Vitamin B2 Riboflavin (0.3 mg / 20% DV)\n" + "- Potassium (498 mg / 14% DV)\n"
            + "- Vitamin A (483 international units / 10% DV)\n" + "- Magnesium (34.2 mg / 9% DV)\n"
            + "- Vitamin B1 Thiamine (0.1 mg / 8% DV)\n" + "- Vitamin D (29.3 international units/ 7% DV)\n"
            + "- Vitamin B6 (0.1 mg / 6% DV)\n" + "- Vitamin C (3.2 mg / 5% DV)";

        milkNutriFact.add(str4d); // 1 cup or 244 grams

        final String str4e = "- People trying to gain weight\n" + "- People who are lactose Intolerant\n"
            + "- People with high cholesterol\n" + "- People with insulin issues";

        milkBestFor.add(str4e);

        final String str4f = "1. DG Goat Milk - Dairy Goat Milk Philippines (dggoatmilkph.com)\n"
            + "2. Alaminos Milk Star Goat's Milk - Alaminos Milk Star Goat's Milk | Facebook\n"
            + "3. Meyenberg Goat Milk \n\t- Meyenberg Evaporated Goat Milk Unsweetened Rich Creamy 12 fl oz / 354 ml | Shopee Philippines (P199)\n"
            + "\t- Meyenberg Evaporated Goat Milk, Vitamin D, 12 oz / 354 mL Unsweetened, Rich, Creamy | Lazada PH (P196.81)\n"
            + "4. Goat's Milk Raw & Pasteurized 1L - GOAT'S MILK RAW & PASTEURIZED 1L | Shopee Philippines\n"
            + "5. Malagos Fresh Goat's Milk 1L - Malagos Fresh Goat's Milk 1L (lahatdito.com.ph)";

        milkBrands.add(str4f); // AVAILABLE BRANDS IN THE PHILIPPINES

        final String str4g = "- Goat - Scientific Name, Classification, Uses and FAQs (vedantu.com)\n"
            + "- Benefits of Goat Milk | Meyenberg Goat Milk\n"
            + "- Benefits, Uses, And Everything About Goat Milk - HealthifyMe\n"
            + "- (PDF) Role of Goat Milk and Milk Products in Dengue Fever (researchgate.net)\n"
            + "- Goat's Milk Intake Prevents Obesity, Hepatic Steatosis and Insulin Resistance in Mice Fed A\n"
            + "- High-Fat Diet by Reducing Inflammatory Markers and Increasing Energy Expenditure and Mitochondrial Content in Skeletal Muscle - PMC (nih.gov)\n"
            + "- Goat milk feeding causes an increase in biliary secretion of cholesterol and a decrease in plasma cholesterol levels in rats - PubMed (nih.gov)\n"
            + "- Is Goat's Milk Right for You? (healthline.com)\n"
            + "- Goat Milk Benefits, Nutrition, Types and How to Use - Dr. Axe (draxe.com)\n"
            + "- Thiamin (Vitamin B1) | The Nutrition Source | Harvard T.H. Chan School of Public Health\n"
            + "- Selenium | The Nutrition Source | Harvard T.H. Chan School of Public Health\n"
            + "- Vitamin B6 | The Nutrition Source | Harvard T.H. Chan School of Public Health\n"
            + "- Vitamin C | The Nutrition Source | Harvard T.H. Chan School of Public Health";

        milkReferences.add(str4g);

        // Lactose-free Cow Milk - Initial
        milkName.add("Lactose-free Cow Milk");

        final String str5 = "";

        animalImage.add(str5);
        animalName.add("");
        animalScientificName.add("");
        
        final String str5a = "";
        animalDescription.add(str5a);
        
        final String str5b = "";
        
        milkDescription.add(str5b);

        final String str5c = "";

        milkBenefits.add(str5c);

        final String str5d = "";

        milkNutriFact.add(str5d);

        final String str5e = "";

        milkBestFor.add(str5e);

        final String str5f = "";

        milkBrands.add(str5f);

        final String str5g = "";

        milkReferences.add(str5g);

        // Low-fat Cow Milk - Initial
        milkName.add("Low-fat Cow Milk");

        final String str6 = "";

        animalImage.add(str6);
        animalName.add("");
        animalScientificName.add("");
        
        final String str6a = "";
        animalDescription.add(str6a);
        
        final String str6b = "";
        
        milkDescription.add(str6b);

        final String str6c = "";

        milkBenefits.add(str6c);

        final String str6d = "";

        milkNutriFact.add(str6d);

        final String str6e = "";

        milkBestFor.add(str6e);

        final String str6f = "";

        milkBrands.add(str6f);

        final String str6g = "";

        milkReferences.add(str6g);

        // Organic Cow Milk - Initial
        milkName.add("Organic Cow Milk");

        final String str7 = "";

        animalImage.add(str7);
        animalName.add("");
        animalScientificName.add("");
        
        final String str7a = "";
        animalDescription.add(str7a);
        
        final String str7b = "";
        
        milkDescription.add(str7b);

        final String str7c = "";

        milkBenefits.add(str7c);

        final String str7d = "";

        milkNutriFact.add(str7d);

        final String str7e = "";

        milkBestFor.add(str7e);

        final String str7f = "";

        milkBrands.add(str7f);

        final String str7g = "";

        milkReferences.add(str7g);

        // Reduced Fat Cow Milk - Initial
        milkName.add("Reduced Fat Cow Milk");

        final String str8 = "";

        animalImage.add(str8);
        animalName.add("");
        animalScientificName.add("");
        
        final String str8a = "";
        animalDescription.add(str8a);
        
        final String str8b = "";
        
        milkDescription.add(str8b);

        final String str8c = "";

        milkBenefits.add(str8c);

        final String str8d = "";

        milkNutriFact.add(str8d);

        final String str8e = "";

        milkBestFor.add(str8e);

        final String str8f = "";

        milkBrands.add(str8f);

        final String str8g = "";

        milkReferences.add(str8g);

        // Sheep Milk - Initial
        milkName.add("Sheep Milk");

        final String str9 = "";

        animalImage.add(str9);
        animalName.add("");
        animalScientificName.add("");
        
        final String str9a = "";
        animalDescription.add(str9a);
        
        final String str9b = "";
        
        milkDescription.add(str9b);

        final String str9c = "";

        milkBenefits.add(str9c);

        final String str9d = "";

        milkNutriFact.add(str9d);

        final String str9e = "";

        milkBestFor.add(str9e);

        final String str9f = "";

        milkBrands.add(str9f);

        final String str9g = "";

        milkReferences.add(str9g);

        // Skimmed Cow Milk - Initial
        milkName.add("Skimmed Cow Milk");

        final String str10 = "";

        animalImage.add(str10);
        animalName.add("");
        animalScientificName.add("");
        
        final String str10a = "";
        animalDescription.add(str10a);
        
        final String str10b = "";
        
        milkDescription.add(str10b);

        final String str10c = "";

        milkBenefits.add(str10c);

        final String str10d = "";

        milkNutriFact.add(str10d);

        final String str10e = "";

        milkBestFor.add(str10e);

        final String str10f = "";

        milkBrands.add(str10f);

        final String str10g = "";

        milkReferences.add(str10g);

        // Whole Cow Milk - Initial
        milkName.add("Whole Cow Milk");

        final String str11 = "";

        animalImage.add(str11);
        animalName.add("");
        animalScientificName.add("");
        
        final String str11a = "";
        animalDescription.add(str11a);
        
        final String str11b = "";
        
        milkDescription.add(str11b);

        final String str11c = "";

        milkBenefits.add(str11c);

        final String str11d = "";

        milkNutriFact.add(str11d);

        final String str11e = "";

        milkBestFor.add(str11e);

        final String str11f = "";

        milkBrands.add(str11f);

        final String str11g = "";

        milkReferences.add(str11g);

        // PLANT-BASED MILK
        // Almond Milk - Initial
        milkName.add("Almond Milk");

        final String str12 = "";

        animalImage.add(str12);
        animalName.add("");
        animalScientificName.add("");
        
        final String str12a = "";
        animalDescription.add(str12a);
        
        final String str12b = "";
        
        milkDescription.add(str12b);

        final String str12c = "";

        milkBenefits.add(str12c);

        final String str12d = "";

        milkNutriFact.add(str12d);

        final String str12e = "";

        milkBestFor.add(str12e);

        final String str12f = "";

        milkBrands.add(str12f);

        final String str12g = "";

        milkReferences.add(str12g);

        // Coconut Milk - Initial
        milkName.add("Coconut Milk");

        final String str13 = "";

        animalImage.add(str13);
        animalName.add("");
        animalScientificName.add("");
        
        final String str13a = "";
        animalDescription.add(str13a);
        
        final String str13b = "";
        
        milkDescription.add(str13b);

        final String str13c = "";

        milkBenefits.add(str13c);

        final String str13d = "";

        milkNutriFact.add(str13d);

        final String str13e = "";

        milkBestFor.add(str13e);

        final String str13f = "";

        milkBrands.add(str13f);

        final String str13g = "";

        milkReferences.add(str13g);

        // Oat Milk - Initial
        milkName.add("Oat Milk");

        final String str14 = "";

        animalImage.add(str14);
        animalName.add("");
        animalScientificName.add("");
        
        final String str14a = "";
        animalDescription.add(str14a);
        
        final String str14b = "";
        
        milkDescription.add(str14b);

        final String str14c = "";

        milkBenefits.add(str14c);

        final String str14d = "";

        milkNutriFact.add(str14d);

        final String str14e = "";

        milkBestFor.add(str14e);

        final String str14f = "";

        milkBrands.add(str14f);

        final String str14g = "";

        milkReferences.add(str14g);

        // Rice Milk - Initial
        milkName.add("Rice Milk");

        final String str15 = "";

        animalImage.add(str15);
        animalName.add("");
        animalScientificName.add("");
        
        final String str15a = "";
        animalDescription.add(str15a);
        
        final String str15b = "";
        
        milkDescription.add(str15b);

        final String str15c = "";

        milkBenefits.add(str15c);

        final String str15d = "";

        milkNutriFact.add(str15d);

        final String str15e = "";

        milkBestFor.add(str15e);

        final String str15f = "";

        milkBrands.add(str15f);

        final String str15g = "";

        milkReferences.add(str15g);

        // Soy Milk - Initial
        milkName.add("Soy Milk");

        final String str16 = "";

        animalImage.add(str16);
        animalName.add("");
        animalScientificName.add("");
        
        final String str16a = "";
        animalDescription.add(str16a);
        
        final String str16b = "";
        
        milkDescription.add(str16b);

        final String str16c = "";

        milkBenefits.add(str16c);

        final String str16d = "";

        milkNutriFact.add(str16d);

        final String str16e = "";

        milkBestFor.add(str16e);

        final String str16f = "";

        milkBrands.add(str16f);

        final String str16g = "";

        milkReferences.add(str16g);

        // HUMAN-BASED MILK
        // Breast Milk - Initial
        milkName.add("Breast Milk");

        final String str17 = "";

        animalImage.add(str17);
        animalName.add("");
        animalScientificName.add("");
        
        final String str17a = "";
        animalDescription.add(str17a);
        
        final String str17b = "";
        
        milkDescription.add(str17b);

        final String str17c = "";

        milkBenefits.add(str17c);

        final String str17d = "";

        milkNutriFact.add(str17d);

        final String str17e = "";

        milkBestFor.add(str17e);

        final String str17f = "";

        milkBrands.add(str17f);

        final String str17g = "";

        milkReferences.add(str17g);
    }

    // public void setArray(ArrayList<String> arrGender, ArrayList<String> arrAge, ArrayList<String> arrVeget, ArrayList<String> arrHealth, ArrayList<String> arrSugar) {
    //     arrGender = milkGender;
    // }
}