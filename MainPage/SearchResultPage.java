package MainPage;

import DataAlgo.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SearchResultPage extends JFrame{
   private Dimension screenSize;
   private ImageIcon logoIcon1, logoIcon2, logoIcon3a, logoIcon3b, logoIcon3c, blackBg;
   private Container con2;
   private JMenuBar bar;
   private JMenuBar barLine;
   private JMenu menu;
   private JMenuItem profile, search, signOut;
   private JLabel logo, title, word, bg;
   private JButton back; 
   private JLabel black1, black2, black3;
   private SearchData data;
   private int numResult;
   
   // Initial
   public JButton milk;

   // public static void main(String[] args) {
   //    new SearchResultPage();
   // }
   
   public SearchResultPage() {
      setTitle("Milkipedia Search Result");
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      setSize(screenSize.width, screenSize.height);
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
      getContentPane().setBackground(Color.BLACK); // sets the bg color to black
		setResizable(true);
      
      // set images
      logoIcon1 = new ImageIcon("logoOrig.png"); // logo
      setIconImage(logoIcon1.getImage());
      blackBg = new ImageIcon("plainwhite.png"); // white bg
      logoIcon2 = new ImageIcon("logoOrig1.png"); // cow image
      logoIcon3a = new ImageIcon("black1.png"); // black spot top left
      logoIcon3b = new ImageIcon("black1.png"); // black spot top right
      logoIcon3c = new ImageIcon("black1.png"); // black spot bottom left
      
      con2 = getContentPane();
		con2.setLayout(null);
      
      barLine = new JMenuBar();
      barLine.setBounds(0, 0, screenSize.width-15, 35);
      barLine.setBackground(Color.WHITE); // north menu bar color
      
      bar = new JMenuBar();
      bar.setBounds(screenSize.width-126, 0, 110, 35);
      bar.add(Box.createHorizontalGlue());
      bar.setBackground(Color.BLACK); // bar black color
      bar.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1)); // menu bar border color 
      
      menu = new JMenu(" MENU ");      
      menu.setForeground(Color.WHITE); // MENU tab color
      menu.setFont(new Font("Courier", Font.BOLD, 29));
      menu.setFocusable(false);
      menu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      menu.addMouseListener(new MouseAdapter() {
      
      @Override
      public void mouseEntered(MouseEvent e) {       
         menu.setBackground(Color.WHITE);
         menu.setForeground(Color.BLACK);
         bar.setBackground(Color.WHITE);   
         bar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
      }
            
      @Override
      public void mouseExited(MouseEvent e) {
         menu.setBackground(Color.BLACK);
         menu.setForeground(Color.WHITE);
         bar.setBackground(Color.BLACK);   
         bar.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
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
      
      search = new JMenuItem("Search");
      search.setForeground(Color.BLACK);
      search.setFont(new Font("Courier", Font.BOLD, 20));
      search.setSize(80, 30);
      search.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
      search.setBackground(Color.WHITE);
      search.setFocusable(false);
      menu.add(search);
      
      signOut = new JMenuItem("Sign Out");
      signOut.setForeground(Color.BLACK);
      signOut.setFont(new Font("Courier", Font.BOLD, 20));
      signOut.setSize(80, 30);
      signOut.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
      signOut.setBackground(Color.WHITE);
      signOut.setFocusable(false);
      menu.add(signOut);
      bar.add(menu);
      con2.add(bar);
      con2.add(barLine);

      
      logo = new JLabel();       // logo icon2 cow image
      logo.setBounds(675, 60, 150, 200);
      logo.setIcon(logoIcon2);
      con2.add(logo);

      
      title = new JLabel("MILKIPEDIA"); // milkipedia text
      title.setForeground(Color.BLACK);
		title.setFont(new Font("Courier", Font.BOLD, 80));
		title.setBounds(525, 230, 1000, 90);
		con2.add(title);
      
      word = new JLabel("Search Result"); // search result text
      word.setForeground(Color.BLACK);
      word.setFont(new Font("Courier", Font.PLAIN, 30));             
      word.setBounds(650, 305, 400, 50);
      con2.add(word);
      
      back = new JButton("BACK"); // back text
      back.setForeground(Color.WHITE);
      back.setFont(new Font("Courier", Font.BOLD, 25)); // back text size
      back.setBackground(Color.BLACK);
      back.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
      back.setBounds(1290, 685, 170, 50);
      back.setFocusable(false);
      back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      back.addMouseListener(new MouseAdapter() {
      
         @Override
         public void mouseEntered(MouseEvent e) { 
            back.setBackground(Color.WHITE); 
            back.setForeground(Color.BLACK);
         }
         
         @Override
         public void mouseExited(MouseEvent e) { 
            back.setBackground(Color.BLACK);
            back.setForeground(Color.WHITE);
         }
      });
   
      con2.add(back);

      data = new SearchData();
      numResult = data.milkNameResult.size(); // looping
	   
      // Initial
      milk = new JButton("Cow Milk");                 // cow milk 
      milk.setForeground(Color.WHITE);
      milk.setFont(new Font("Courier", Font.ITALIC, 25)); // cow milk size
      milk.setBackground(Color.BLACK);
      milk.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
      milk.setBounds(485, 380, 540, 50); // cow milk width height
      
      milk.setFocusable(false);
      milk.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      milk.addMouseListener(new MouseAdapter() {
         
         @Override
         public void mouseEntered(MouseEvent e) {    // Cow milk color enter      
            milk.setBackground(Color.WHITE);
            milk.setForeground(Color.BLACK);
         }
               
         @Override
         public void mouseExited(MouseEvent e) {    // Cow milk color exit
            milk.setBackground(Color.BLACK);
            milk.setForeground(Color.WHITE);
         }
      });
   
      con2.add(milk);
      setBackground(Color.BLACK);
   
      black1 = new JLabel();
      black1.setIcon(logoIcon3a);        // logoIcon3a black spot
      black1.setSize(screenSize.width, screenSize.height);
      black1.setLocation(-10,-310);
      con2.add(black1);
      
      black2 = new JLabel();
      black2.setIcon(logoIcon3b);       // logoIcon3b block spot
      black2.setSize(screenSize.width, screenSize.height);
      black2.setLocation(1300,-310);
      con2.add(black2);
      
      black3 = new JLabel();
      black3.setIcon(logoIcon3c);      // logoIcon3c black spot
      black3.setSize(screenSize.width, screenSize.height);
      black3.setLocation(-10,300);
      con2.add(black3);
      
      bg = new JLabel();   // white bg
      bg.setBounds(50,80,1425,665);
      bg.setIcon(blackBg);
      con2.add(bg);  
      
      setVisible(true);
   }
   
   public JButton getBack() {
      return back;
   }
   
   public JMenuItem getProfile() {
      return profile;
   }
   
   public JMenuItem getSearch() {
      return search;
   }
   
   public JMenuItem getSignOut() {
      return signOut;
   }
   
   // Initial
   public JButton getMilk() {
      return milk;
   }
}
