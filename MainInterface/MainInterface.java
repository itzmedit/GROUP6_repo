package MainInterface;

import FrontPage.*;
import MainPage.*;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class MainInterface {
   static ImageIcon admin, enter, search, exit;
   static String firstName, middleName, lastName, suffixName, fullName, email, confirmEmail, months, days, years;
   static int age;
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
   
   public static void main(String[] args) {
      admin = new ImageIcon("logoSmall.png");
      runWelcome();
      // new SearchResultPage();
      // new ProfilePage("Mark Christian Nunez", 20, "blbsalabl@gmaiol.com");
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
         confirmEmail = reg.confirmEmailInput.getText();
         firstName = reg.firstNameInput.getText();
         middleName = reg.middleNameInput.getText();
         lastName = reg.lastNameInput.getText();
         email = reg.emailInput.getText();
         middleName = reg.middleNameInput.getText();

         if (reg.suffix.getSelectedIndex() == 1)
            suffixName = "";

         else
            suffixName = reg.suffixes[reg.suffix.getSelectedIndex()];
                
		   if (reg.terms.isSelected() && !emptyReg() && sameEmail()) { 
            fullName = lastName + ", " + firstName + " " + suffixName; 
            JOptionPane.showMessageDialog(null, "Registered Successfully!", "Milkipedia Admin", JOptionPane.INFORMATION_MESSAGE, admin);
            runSignIn();
            reg.dispose();
            runSearch();
         }
         else if (emptyReg())
         {
            JOptionPane.showMessageDialog(null, "Complete the registration!", "Milkipedia Admin", JOptionPane.INFORMATION_MESSAGE, admin);
         }

         else if (!sameEmail())
         {
            JOptionPane.showMessageDialog(null, "Please ensure both emails match!", "Milkipedia Admin", JOptionPane.INFORMATION_MESSAGE, admin);
         }

         else
         JOptionPane.showMessageDialog(null, "Accept terms and conditions!", "Milkipedia Admin", JOptionPane.INFORMATION_MESSAGE, admin);
      }
      });
      
      reg.getReset().addActionListener(new ActionListener() {   
      @Override
      public void actionPerformed(ActionEvent e) {
         if (e.getSource() == reg.getReset()) {
	         reg.firstNameInput.setText("First Name");
            reg.firstNameInput.setForeground(Color.GRAY);

            reg.middleNameInput.setText("Middle Name");
            reg.middleNameInput.setForeground(Color.GRAY);

            reg.lastNameInput.setText("Last Name");
            reg.lastNameInput.setForeground(Color.GRAY);

            reg.emailInput.setText("Email");
            reg.emailInput.setForeground(Color.GRAY);

            reg.confirmEmailInput.setText("Confirm Email");
            reg.confirmEmailInput.setForeground(Color.GRAY);

            reg.suffix.setSelectedIndex(0);
            reg.male.setSelected(true);         
            reg.date.setSelectedIndex(0);
			   reg.month.setSelectedIndex(0);
			   reg.year.setSelectedIndex(0);
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
      
      //Initial
      res.getMilk().addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
         if (e.getSource() == res.getMilk()) {
            res.dispose();
            runMilk();
         }
      }
      });

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
      pro = new ProfilePage(fullName, age, email);
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
   
   static boolean emptyReg() {
      return (
            (firstName.equals("First Name") || firstName.equals(""))
         || (middleName.equals("Middle Name") || middleName.equals("")) 
         || (lastName.equals("Last Name") || lastName.equals(""))
         || (email.equals("Email") || email.equals(""))
         || (confirmEmail.equals("confirm Email") || confirmEmail.equals(""))
         || (reg.month.getSelectedIndex() == 0)
         || (reg.date.getSelectedIndex() == 0)
         || (reg.year.getSelectedIndex() == 0)
         || (reg.suffix.getSelectedIndex() == 0)
         );
   }

   static boolean sameEmail()
   {
      return email.equals(confirmEmail);
   }
}
