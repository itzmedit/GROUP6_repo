package MainPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SearchPage extends JFrame {
   private Dimension screenSize;
   private ImageIcon logoIcon1, logoIcon2, logoIcon3a, logoIcon3b;
   private Container con1;
   private JMenuBar bar;
   private JMenuBar barLine;
   private JMenu menu;
   private JMenuItem profile, signOut;
   private JLabel logo, title, word;
   private JLabel gender;
	public JRadioButton male, female, both;
	public ButtonGroup genderGrp;
   private JLabel age;
   public JComboBox<String> stage;
   private JLabel veget;
   public JComboBox<String> status;
   private JLabel health;
   public JComboBox<String> condition;
   private JLabel sugar;
   public JComboBox<String> level;
   private JButton search, reset;
   private JLabel black1, black2;
   
   public String stages[] 
      = {"All", "Infancy (Birth to 2 years old)", "Early Childhood (3 to 5 years old)", 
         "Middle Childhood (6 to 11 years old)", "Adolescence (12 to 18 years old)",
         "Early Adulthood (19 to 39 years old)", "Middle Adulthood (40 to 64 years old)", 
         "Late Adulthood (65+ years old)"};
   
   public String statuses[]
      = {"Unidentified", "Non-vegetarian", "Lacto-ovo vegetarian", "Lacto-vegetarian", "Ovo-vegetarian", "Vegan"};
   
   public String conditions[]
      = {"None", "Arsenic Concerns", "Coconut Allergy", "Diabetic", "High Cholesterol", "Kidney Issues", 
         "Lactose Intolerance", "Milk Allergy", "Nut Allergy", "Nutritional Deficiencies", "Oat Allergy", 
         "Rice Allergy", "Soy Allergy", "Thyroid Issues"};
      
   public String levels[]
      = {"All Sugar Levels", "Unsweetened (0%)", "Low Sugar (less than 5%)", "Moderate Sugar (5% to 15%)", "High Sugar (15% to 25%)", "Very High Sugar (25% or more)"};
   
   public SearchPage() {
      setTitle("Milkipedia Search");
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      setSize(screenSize.width, screenSize.height);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);
      
      logoIcon1 = new ImageIcon("logoOrig.png");
      setIconImage(logoIcon1.getImage());
      logoIcon2 = new ImageIcon("logoOrig1.png");
      logoIcon3a = new ImageIcon("black.png");
      logoIcon3b = new ImageIcon("blackRev.png");
      
      con1 = getContentPane();
		con1.setLayout(null);
      
      barLine = new JMenuBar();
      barLine.setBounds(0, 0, screenSize.width-15, 35);
      barLine.setBackground(Color.BLACK);
      
      barLine = new JMenuBar();
      barLine.setBounds(0, 0, screenSize.width-15, 35);
      barLine.setBackground(Color.BLACK);
      
      bar = new JMenuBar();
      bar.setBounds(screenSize.width-126, 0, 110, 33);
      bar.add(Box.createHorizontalGlue());
      bar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
      
      menu = new JMenu(" MENU ");
      menu.setForeground(Color.BLACK);
      menu.setFont(new Font("Courier", Font.BOLD, 29));
      menu.setFocusable(false);
      menu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      menu.addMouseListener(new MouseAdapter() {
      
      @Override
      public void mouseEntered(MouseEvent e) {          
         menu.setBackground(Color.BLACK);
         menu.setForeground(Color.WHITE);
      }
            
      @Override
      public void mouseExited(MouseEvent e) {
         menu.setBackground(Color.WHITE);
         menu.setForeground(Color.BLACK);
      }
      });
            
      profile = new JMenuItem("Profile");
      profile.setForeground(Color.BLACK);
      profile.setFont(new Font("Courier", Font.BOLD, 20));
      profile.setSize(80, 30);
      profile.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
      profile.setBackground(Color.WHITE);
      profile.setFocusable(false);
      menu.add(profile);
      
      signOut = new JMenuItem("Sign Out");
      signOut.setForeground(Color.BLACK);
      signOut.setFont(new Font("Courier", Font.BOLD, 20));
      signOut.setSize(80, 30);
      signOut.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
      signOut.setBackground(Color.WHITE);
      signOut.setFocusable(false);
      menu.add(signOut);
      bar.add(menu);
      con1.add(bar);
      con1.add(barLine);
      
      logo = new JLabel();
      logo.setBounds(260, 30, 150, 200);
      logo.setIcon(logoIcon2);
      con1.add(logo);
      
      title = new JLabel("MILKIPEDIA");
      title.setForeground(Color.BLACK);
		title.setFont(new Font("Courier", Font.BOLD, 120));
		title.setBounds(410, 70, 1000, 90);
		con1.add(title);
      
      word = new JLabel("Search");
      word.setForeground(Color.BLACK);
      word.setFont(new Font("Courier", Font.BOLD, 40));
      word.setBounds(410, 160, 300, 50);
      con1.add(word);
      
      gender = new JLabel("Gender");
      gender.setForeground(Color.BLACK);
		gender.setFont(new Font("Courier", Font.BOLD, 25));
		gender.setBounds(500, 233, 150, 28);
		con1.add(gender);

		male = new JRadioButton("Male");
      male.setForeground(Color.BLACK);
		male.setFont(new Font("Courier", Font.PLAIN, 20));
		male.setSelected(true);
		male.setBounds(755, 233, 83, 21);
      male.setFocusable(false);
		con1.add(male);

		female = new JRadioButton("Female");
      female.setForeground(Color.BLACK);
		female.setFont(new Font("Courier", Font.PLAIN, 20));
		female.setSelected(false);
		female.setBounds(835, 233, 105, 21);
      female.setFocusable(false);
		con1.add(female);

      // both = new JRadioButton("Both");
      // both.setForeground(Color.BLACK);
		// both.setFont(new Font("Courier", Font.PLAIN, 20));
		// both.setSelected(false);
		// both.setBounds(938, 233, 90, 21);
      // both.setFocusable(false);
		// con1.add(both);
      
		genderGrp = new ButtonGroup();
		genderGrp.add(male);
		genderGrp.add(female);
      // genderGrp.add(both);
      
      age = new JLabel("Age Stage");
      age.setForeground(Color.BLACK);
		age.setFont(new Font("Courier", Font.BOLD, 25));
		age.setBounds(500, 276, 150, 28);
		con1.add(age);
      
      stage = new JComboBox<String>(stages);
      stage.setForeground(Color.BLACK);
		stage.setFont(new Font("Courier", Font.PLAIN, 20));
      stage.setBackground(Color.WHITE);
      stage.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		stage.setBounds(760, 275, 222, 28);
      stage.setFocusable(false);
		con1.add(stage);
      
      veget = new JLabel("Vegetary Status");
      veget.setForeground(Color.BLACK);
      veget.setFont(new Font("Courier", Font.BOLD, 25));
      veget.setBounds(500, 314, 280, 30);
      con1.add(veget);
      
      status = new JComboBox<String>(statuses);
      status.setForeground(Color.BLACK);
      status.setFont(new Font("Courier", Font.PLAIN, 20));
      status.setBackground(Color.WHITE);
      status.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
      status.setBounds(760, 314, 270, 28);
      status.setFocusable(false);
      con1.add(status);
      
      health = new JLabel("Health Condition");
		health.setForeground(Color.BLACK);
      health.setFont(new Font("Courier", Font.BOLD, 25));
		health.setBounds(500, 359, 280, 21);
		con1.add(health);
            
      condition = new JComboBox<String>(conditions);
      condition.setForeground(Color.BLACK);
      condition.setFont(new Font("Courier", Font.PLAIN, 20));
      condition.setBackground(Color.WHITE);
      condition.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
      condition.setBounds(760, 354, 260, 28);
      condition.setFocusable(false);
      con1.add(condition);
      
      sugar = new JLabel("Sugar Level");
		sugar.setForeground(Color.BLACK);
      sugar.setFont(new Font("Courier", Font.BOLD, 25));
		sugar.setBounds(500, 395, 250, 30);
		con1.add(sugar);
      
      level = new JComboBox<String>(levels);
      level.setForeground(Color.BLACK);
      level.setFont(new Font("Courier", Font.PLAIN, 20));
      level.setBackground(Color.WHITE);
      level.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
      level.setBounds(760, 396, 210, 28);
      level.setFocusable(false);
      con1.add(level);
      
      search = new JButton("SEARCH");
      search.setForeground(Color.BLACK);
      search.setFont(new Font("Courier", Font.BOLD, 25));
      search.setBackground(Color.WHITE);
      search.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
      search.setBounds(505, 465, 150, 30);
      search.setFocusable(false);
      search.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      search.addMouseListener(new MouseAdapter() {
      
      @Override
      public void mouseEntered(MouseEvent e) {          
         search.setBackground(Color.BLACK);
         search.setForeground(Color.WHITE);
      }
            
      @Override
      public void mouseExited(MouseEvent e) {
         search.setBackground(Color.WHITE);
         search.setForeground(Color.BLACK);
      }
      });
      
      con1.add(search);
      
      reset = new JButton("RESET");
      reset.setForeground(Color.BLACK);
      reset.setFont(new Font("Courier", Font.BOLD, 25));
      reset.setBackground(Color.WHITE);
      reset.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
      reset.setBounds(800, 465, 150, 30);
      reset.setFocusable(false);
      reset.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      reset.addMouseListener(new MouseAdapter() {
      
      @Override
      public void mouseEntered(MouseEvent e) {          
         reset.setBackground(Color.BLACK);
         reset.setForeground(Color.WHITE);
      }
            
      @Override
      public void mouseExited(MouseEvent e) {
         reset.setBackground(Color.WHITE);
         reset.setForeground(Color.BLACK);
      }
      });
      
      con1.add(reset);
      
      black1 = new JLabel();
      black1.setIcon(logoIcon3a);
      black1.setBounds(-230, -10, 500, 500);
      con1.add(black1);
      
      black2 = new JLabel();
      black2.setIcon(logoIcon3b);
      black2.setBounds(1082, 280, 500, 500);
      con1.add(black2);
      
      setVisible(true);
   }
   
   public JButton getSearch() {
      return search;
   }
   
   public JButton getReset() {
      return reset;
   }
   
   public JMenuItem getProfile() {
      return profile;
   }
   
   public JMenuItem getSignOut() {
      return signOut;
   }
}