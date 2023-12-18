package MainInterface;

import FrontPage.*;
import MainPage.*;
import DataAlgo.*;

import javax.swing.*;
import java.awt.event.*;

public class MainInterface {
   static ImageIcon admin, enter, search, exit;
   static String firstName, middleName, lastName, suffixName, fullName, email;
   static int age;
   static String mGender, mAge, mVeget, mHealth, mSugar;
   static WelcomePage wel;
   static RegistrationPage reg;
   static TermsAndConditionsPage ter;
   static SearchPage sea;
   static SearchResultPage res;
   static MilkPage mil;
   static ProfilePage pro;
   static String windowBack;
   static Timer timer;
   static JDialog dialog;
   static JOptionPane optionPane;
   static int select;
   static SearchData data;
   static JButton[] buttons;
   static int numLoop;
   
   public static void main(String[] args) {
      admin = new ImageIcon("logoSmall.png");
      runWelcome();
   }
   
   static void runWelcome() {
      wel = new WelcomePage();
      wel.getRegister().addActionListener(new ActionListener() {
         
      @Override
      public void actionPerformed(ActionEvent e) {
         if (e.getSource() == wel.getRegister()) {
            wel.dispose();
            runRegistration();
         }
      }
      });
   }
   
   static void runRegistration() {
      reg = new RegistrationPage();
      reg.getTerms().addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
         if (e.getSource() == reg.getTerms()) {
            runTermsAndConditions();
         }
      }
      });

      reg.getSubmit().addActionListener(new ActionListener() {
               
      @Override
      public void actionPerformed(ActionEvent e) {
         firstName = reg.fNameT.getText();
         middleName = reg.mNameT.getText();
         lastName = reg.lNameT.getText();
         email = reg.emailT.getText();
         age = 2023 - Integer.parseInt(reg.years[reg.year.getSelectedIndex()]);
               
         if (reg.suffix.getSelectedIndex() == 0)
            suffixName = "";
         else
            suffixName = reg.suffixes[reg.suffix.getSelectedIndex()];
               
		   if (e.getSource() == reg.getSubmit() && reg.terms.isSelected() && notEmptyReg()) { 
            if (middleName.length() == 0) 
               fullName = lastName + ", " + firstName + " " + suffixName; 

            else { fullName = lastName + ", " + firstName + " " + lastName.charAt(0) + ". " + suffixName; }

            JOptionPane.showMessageDialog(null, "Registered Successfully!", "Milkipedia Admin", JOptionPane.INFORMATION_MESSAGE, admin);
            runSignIn();
            reg.dispose();
            runSearch();
         }  
                     
         else if (!notEmptyReg())
            JOptionPane.showMessageDialog(null, "Complete the registration!", "Milkipedia Admin", JOptionPane.INFORMATION_MESSAGE, admin);
                   
         else
            JOptionPane.showMessageDialog(null, "Accept terms and conditions!", "Milkipedia Admin", JOptionPane.INFORMATION_MESSAGE, admin);
      }
      });
             
      reg.getReset().addActionListener(new ActionListener() {   
               
      @Override
      public void actionPerformed(ActionEvent e) {
         if (e.getSource() == reg.getReset()) {
	         reg.fNameT.setText("");
            reg.mNameT.setText("");
            reg.lNameT.setText("");
            reg.suffix.setSelectedIndex(0);
            reg.male.setSelected(true);         
            reg.date.setSelectedIndex(0);
			   reg.month.setSelectedIndex(0);
			   reg.year.setSelectedIndex(0);
            reg.country.setSelectedIndex(0);
            reg.status.setSelectedIndex(0);
            reg.emailT.setText("");
            reg.terms.setSelected(false);
		   }
      }
      });
   }
   
   static void runTermsAndConditions() {
      ter = new TermsAndConditionsPage();
      ter.getAgree().addActionListener(new ActionListener() {
             
      @Override
      public void actionPerformed(ActionEvent e) {
         if (e.getSource() == ter.getAgree()) {
            reg.terms.setSelected(true);
            ter.dispose();
         }
      }
      });

      ter.getDisagree().addActionListener(new ActionListener() {
             
      @Override
      public void actionPerformed(ActionEvent e) {
         if (e.getSource() == ter.getDisagree()) {
            reg.terms.setSelected(false);
            ter.dispose();
         }
      }   
      });
   }

   static void runSearch() {
      sea = new SearchPage();

      sea.getSearch().addActionListener(new ActionListener() {
             
      @Override
      public void actionPerformed(ActionEvent e) {
         if (sea.male.isSelected()) 
            mGender = "Male"; 
         else   
            mGender = "Female"; 

         mAge = sea.stages[sea.stage.getSelectedIndex()];
         mVeget = sea.statuses[sea.status.getSelectedIndex()];
         mHealth = sea.conditions[sea.condition.getSelectedIndex()];
         mSugar = sea.levels[sea.level.getSelectedIndex()];

         if (e.getSource() == sea.getSearch()) { 
            runSearchIcon();
            sea.dispose();
            runSearchResult();
         }
      }
      });
      
      sea.getReset().addActionListener(new ActionListener() {
             
      @Override
      public void actionPerformed(ActionEvent e) {
         if (e.getSource() == sea.getReset()) {
            sea.male.setSelected(true);
            sea.stage.setSelectedIndex(0);
            sea.status.setSelectedIndex(0);
            sea.condition.setSelectedIndex(0);
            sea.level.setSelectedIndex(0);
         }
      }
      });  
      
      sea.getProfile().addActionListener(new ActionListener() {
             
      @Override
      public void actionPerformed(ActionEvent e) {
         if (e.getSource() == sea.getProfile())  { 
            windowBack = "sea";
            sea.dispose();
            runProfile();
         }
      }
      });
      
      sea.getSignOut().addActionListener(new ActionListener() {
             
      @Override
      public void actionPerformed(ActionEvent e) {
         if (e.getSource() == sea.getSignOut()) {
            runSure();
         
         if (select == JOptionPane.YES_OPTION) {
            runSignOut();
            sea.dispose();
            runWelcome();
         }
      }
      }
      });
   }
   
   static void runSearchResult() {
      res = new SearchResultPage();
      
      res.getBack().addActionListener(new ActionListener() {
      
      @Override
      public void actionPerformed(ActionEvent e) {
         if (e.getSource() == res.getBack()) {
            res.dispose();
            runSearch();
         }
      }
      });
      
      res.getProfile().addActionListener(new ActionListener() {
      
      @Override
      public void actionPerformed(ActionEvent e) {
         if (e.getSource() == res.getProfile()) {
            windowBack = "res";
            res.dispose();
            runProfile();
         }
      }
      });
      
      res.getSearch().addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
         if (e.getSource() == res.getSearch()) {
            res.dispose();
            runSearch();
         }
      }
      });
      
      res.getSignOut().addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
         if (e.getSource() == res.getSignOut()) {
            runSure();
            
            if (select == JOptionPane.YES_OPTION) {
               runSignOut();
               res.dispose();
               runWelcome();
            }
         }
      }
      });
      
      // INITIAL
      buttons = res.getMilk();
      numLoop = res.getNumSize();

      for (int y = 0; y < numLoop; y++) {
         buttons[y].addActionListener(new ActionListener() {
            
         @Override
         public void actionPerformed(ActionEvent e) {
            if (e.getSource() == buttons[0]) { // Buffalo Milk
               res.dispose();
               runMilk();
            }
         }
         });
      }
   }
   
   static void runMilk() {
      mil = new MilkPage();
      
      mil.getDone().addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
         if (e.getSource() == mil.getDone()) {
            mil.dispose();
            runSearchResult();  
         }   
      }
      });
      
      mil.getProfile().addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
         if (e.getSource() == mil.getProfile())  { 
            windowBack = "mil";
            mil.dispose();
            runProfile();
         }
      }
      });
      
      mil.getSearch().addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
         if (e.getSource() == mil.getSearch())  { 
            mil.dispose();
            runSearch();
         }
      }
      });
      
      mil.getSignOut().addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
         if (e.getSource() == mil.getSignOut()) {
            runSure();
         
            if (select == JOptionPane.YES_OPTION) {
               runSignOut();
               mil.dispose();
               runWelcome();
            }
         }
      }
      });
   }
   
   static void runProfile() {
      pro = new ProfilePage(fullName, age);
      pro.getBack().addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
         // Initial
         if (e.getSource() == pro.getBack()) {
            pro.dispose();
         
            switch (windowBack) {
               case "sea": 
                  runSearch(); break;
               
               case "res": 
                  runSearchResult(); break;
               
               case "mil": 
                  runMilk(); break;
               
               default: 
                  runSearch(); break;
            }
         }
      }
      });
      
      pro.getSearch().addActionListener(new ActionListener() {
      
      @Override
      public void actionPerformed(ActionEvent e) {
         if (e.getSource() == pro.getSearch()) {
            pro.dispose();
            runSearch();
         }
      }
      });
      
      pro.getSignOut().addActionListener(new ActionListener() {
      
      @Override
      public void actionPerformed(ActionEvent e) {
         if (e.getSource() == pro.getSignOut()) {
            runSure();
         
            if (select == JOptionPane.YES_OPTION) {
               runSignOut();
               pro.dispose();
               runWelcome();
            }
         }   
      }
      });
   }
   
   static void runSure() {
      Object[] options = {"Yes", "No"};
      select = JOptionPane.showOptionDialog(res, "Are you sure to sign out?", 
            "Milkipedia Admin", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
            admin, options, options[0]);
   }
   
   static void runSignIn() {
      enter = new ImageIcon("enter.png");
      optionPane = new JOptionPane("Signing In...", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, enter, new Object[]{}, null);
      
      dialog = new JDialog();
      dialog.setIconImage(admin.getImage());
      dialog.setTitle("Milkipedia Admin");
      dialog.setModal(true);
      dialog.setSize(300, 100);
      dialog.setLocationRelativeTo(null);
      dialog.setContentPane(optionPane);
      dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
      dialog.pack();

      timer = new Timer(3000, new AbstractAction() {
      
      @Override
      public void actionPerformed(ActionEvent ae) {
         dialog.dispose();
      }
      });
            
      timer.setRepeats(false);
      timer.start();
      dialog.setVisible(true);
   }
   
   static void runSearchIcon() {
      search = new ImageIcon("search.png");
      optionPane = new JOptionPane("Searching...", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, search, new Object[]{}, null);
      
      dialog = new JDialog();
      dialog.setIconImage(admin.getImage());
      dialog.setTitle("Milkipedia Admin");
      dialog.setModal(true);
      dialog.setSize(300, 100);
      dialog.setLocationRelativeTo(null);
      dialog.setContentPane(optionPane);
      dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
      dialog.pack();

      timer = new Timer(3000, new AbstractAction() {
      
      @Override
      public void actionPerformed(ActionEvent ae) {
         dialog.dispose();
      }
      });
            
      timer.setRepeats(false);
      timer.start();
      dialog.setVisible(true);
   }
   
   static void runSignOut() {
      exit = new ImageIcon("exit.png");
      optionPane = new JOptionPane("Signing Out...", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, exit, new Object[]{}, null);
      
      dialog = new JDialog();
      dialog.setIconImage(admin.getImage());
      dialog.setTitle("Milkipedia Admin");
      dialog.setModal(true);
      dialog.setSize(300, 100);
      dialog.setLocationRelativeTo(null);
      dialog.setContentPane(optionPane);
      dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
      dialog.pack();

      timer = new Timer(3000, new AbstractAction() {
      
      @Override
      public void actionPerformed(ActionEvent ae) {
         dialog.dispose();
      }
      });
            
      timer.setRepeats(false);
      timer.start();
      dialog.setVisible(true);
   }
   
   static boolean notEmptyReg() {
      return (firstName.length() != 0 && lastName.length() != 0 && email.length() != 0);
   }

   public String getMGender() { return mGender; }
   public String getMAge() { return mAge; }
   public String getMVeget() { return mVeget; }
   public String getMHealth() { return mHealth; }
   public String getMSugar() { return mSugar; }
}
