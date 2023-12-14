package MainPage;

import javax.swing.*;
import javax.swing.border.Border;

import FrontPage.RegistrationPage;

import java.awt.*;
import java.awt.event.*;
import java.util.Objects;

public class SearchResultPage extends JFrame{
   private Dimension screenSize;
   private ImageIcon logoIcon, patternTopRight, patternBottomLeft, blackIcon;
   private JLabel title, word;
   private JButton back; 
   private JButton profile, signOut, search;
   private JLabel black1, black2, black3;
   
   // Initial
   public JButton milk;

   public static ImageIcon createImage(String path, int width, int height) {
      ImageIcon icon = new ImageIcon(Objects.requireNonNull(RegistrationPage.class.getResource(path)));
      return new ImageIcon(icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
   }
   
   public SearchResultPage() {
      Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
      setTitle("Milkipedia Search Result");
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      setSize(screenSize.width, screenSize.height);
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
      setExtendedState(JFrame.MAXIMIZED_BOTH);
      getContentPane().setBackground(new Color(0xFFC0CB)); // sets the bg color to black
		setResizable(true);
      setLayout(new GridBagLayout());

      // set images
      logoIcon = createImage("/logoBig.png", 65, 65); // cow image
      patternTopRight = createImage("/patternRight.png", 320, 320);
      patternBottomLeft = createImage("/patternLeft.png", 320, 320);
      blackIcon = createImage("/blob2.png", 290, 290);

      title = new JLabel("MILKIPEDIA"); // milkipedia text
      title.setForeground(Color.BLACK);
		title.setFont(new Font("Monospaced", Font.BOLD, 90));
      title.setIcon(logoIcon);
      title.setVerticalAlignment(JLabel.CENTER);
      title.setHorizontalAlignment(JLabel.CENTER);
      title.setIconTextGap(10);
		title.setBounds(350, 190, 730, 100);
      
      word = new JLabel("Search Result"); // search result text
      word.setForeground(Color.BLACK);
      word.setFont(new Font("Monospaced", Font.PLAIN, 40));    
      word.setBounds(480, 255, 500, 70);
      
      back = new JButton("BACK"); // back text
      back.setForeground(Color.WHITE);
      back.setFont(new Font("Monospaced", Font.BOLD, 30)); // back text size
      back.setBackground(Color.BLACK);
      back.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
      back.setBounds(1125, 570, 300, 60);
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
      
      // Initial
      milk = new JButton("Cow Milk");// cow milk 
      milk.setForeground(Color.WHITE);
      milk.setFont(new Font("Monospaced", Font.BOLD, 37)); // cow milk size
      milk.setBackground(Color.BLACK);
      milk.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
      milk.setBounds(420, 325, 600, 70); // cow milk width height
      
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

      black1 = new JLabel();
      // black1.setBorder(border);
      black1.setBounds(2, 350, 300, 300);
      black1.setIcon(patternBottomLeft);

      black2 = new JLabel();
      black2.setBounds(1148, 0, 300, 300);
      black2.setIcon(patternTopRight);

      black3 = new JLabel();
      black3.setBounds(575, 550, 300, 300);
      black3.setIcon(blackIcon);

      profile = new JButton("Profile");
      profile.setFont(new Font("Monospaced", Font.BOLD, 20));
      profile.setBounds(0, 0, 100, 40);
      profile.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      profile.setHorizontalAlignment(JLabel.CENTER);
      profile.setBorder(border);
      profile.setForeground(Color.WHITE);
      profile.setBackground(Color.BLACK);
      profile.setOpaque(true);
      profile.setFocusable(false);

      profile.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseEntered(MouseEvent e) {
            profile.setForeground(Color.BLACK);
            profile.setBackground(new Color(0xE5E4E2));
         }

         @Override
         public void mouseExited(MouseEvent e) {
            profile.setForeground(Color.WHITE);
            profile.setBackground(Color.BLACK);
         }
      });

      search = new JButton("Search");
      search.setFont(new Font("Monospaced", Font.BOLD, 20));
      search.setBounds(100, 0, 100, 40);
      search.setFocusable(false);
      search.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      search.setHorizontalAlignment(JLabel.CENTER);
      search.setBorder(border);
      search.setForeground(Color.WHITE);
      search.setBackground(Color.BLACK);
      search.setOpaque(true);

      search.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseEntered(MouseEvent e) {
            search.setForeground(Color.BLACK);
            search.setBackground(new Color(0xE5E4E2));
         }

         @Override
         public void mouseExited(MouseEvent e) {
            search.setForeground(Color.WHITE);
            search.setBackground(Color.BLACK);
         }
      });

      signOut = new JButton("Signout");
      signOut.setFocusable(false);
      signOut.setFont(new Font("Monospaced", Font.BOLD, 20));
      signOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      signOut.setBounds(200, 0, 100, 40);
      signOut.setHorizontalAlignment(JLabel.CENTER);
      signOut.setBorder(border);
      signOut.setBackground(Color.BLACK);
      signOut.setForeground(Color.WHITE);
      signOut.setOpaque(true);

      signOut.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseEntered(MouseEvent e) {
            signOut.setForeground(Color.BLACK);
            signOut.setBackground(new Color(0xE5E4E2));
         }

         @Override
         public void mouseExited(MouseEvent e) {
            signOut.setForeground(Color.WHITE);
            signOut.setBackground(Color.BLACK);
         }
      });
   
      JPanel mainPanel = new JPanel();
      mainPanel.setPreferredSize(new Dimension(1450, 650));
      mainPanel.setBackground(Color.WHITE);
      mainPanel.setLayout(null);
      mainPanel.add(title);
      mainPanel.add(word);
      mainPanel.add(back);
      mainPanel.add(black1);
      mainPanel.add(black2);
      mainPanel.add(milk);
      mainPanel.add(profile);
      mainPanel.add(search);
      mainPanel.add(signOut);
      mainPanel.add(black3);

      add(mainPanel);
      setVisible(true);
   }
   
   public JButton getBack() {
      return back;
   }
   
   public JButton getProfile() {
      return profile;
   }
   
   public JButton getSearch() {
      return search;
   }
   
   public JButton getSignOut() {
      return signOut;
   }
   
   // Initial
   public JButton getMilk() {
      return milk;
   }
}