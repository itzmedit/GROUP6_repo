package OOP_Project.view;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

import OOP_Project.model.*;

public class MilkPage extends JFrame {
   private Milk milk;
   private Dimension screenSize;
   private JPanel mainPanel;
   private JLabel title,bTitle,bLTitle,aName,nutrients,nutrients1,nutrients2,nutrients3,nutrients4,nutrients5,sName,logo1,logo2,logo3,logo4,logo5,logo6,dash,dash2,dash3,dash4,dash5,bFit,brandName1,
   brandName2,brandName3,brandLink1,brandLink11,brandLink12,brandLink2,brandLink21,brandLink22,brandLink3,brandLink31,brandLink32;
   private JTextArea description,bFit2,bFit3,bFit4,mName,milkDescription;
   private ImageIcon patternRight, patternBottom,icon,pic,pic1,pic2,pic3;

   public static ImageIcon createImage(String path, int width, int height) {
        ImageIcon icon = new ImageIcon(Objects.requireNonNull(MilkPage.class.getResource(path)));
        return new ImageIcon(icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
   }

   public MilkPage(Milk milk)
	{  
      String[] benefits = milk.getBenefits();
      String[] mNutrients = milk.getNutrients();
      String[] brand1 = milk.getBrand1();
      String[] brand2 = milk.getBrand2();
      String[] brand3 = milk.getBrand3();

      patternRight = createImage("images/patternRight.png", 150, 150);
      patternBottom = createImage("images/patternBottomRight.png", 250, 250);
      icon = createImage("images/logoSmall.png",40,40);
      pic = createImage(milk.getImage(), 270, 130);
      pic1 = createImage(brand1[1],150,160);
      pic2 = createImage(brand2[1],200,160);
      pic3 = createImage(brand3[1],200,160);

      this.milk = milk;
      screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      this.setSize(screenSize);
      this.setLayout(new GridBagLayout());
      this.getContentPane().setBackground(new Color(0xFFC0CB));

      mainPanel = new JPanel();
      mainPanel.setPreferredSize(new Dimension(1200,750));
      mainPanel.setBackground(new Color(0xF5ECEE));
      mainPanel.setLayout(null);

      logo1 = new JLabel();
      logo1.setIcon(patternRight);
      logo1.setBounds(1049,-24,300,200);
      mainPanel.add(logo1);

      logo2 = new JLabel();
      logo2.setIcon(patternBottom);
      logo2.setBounds(955,570,300,180);
      mainPanel.add(logo2);

      logo3 = new JLabel();
      logo3.setIcon(pic);
      logo3.setBounds(80,60,600,300);
      mainPanel.add(logo3);

      logo4 = new JLabel();
      logo4.setIcon(pic1);
      logo4.setBounds(700,150,220,170);
      mainPanel.add(logo4);

      logo5 = new JLabel();
      logo5.setIcon(pic2);
      logo5.setBounds(680,330,180,170);
      mainPanel.add(logo5);

      logo6 = new JLabel();
      logo6.setIcon(pic3);
      logo6.setBounds(680,510,180,170);
      mainPanel.add(logo6);

      title = new JLabel("Milkipedia");
      title.setIcon(icon);
      title.setFont(new Font("MonoSpaced",Font.BOLD, 50));
      title.setForeground(Color.BLACK);
      title.setBounds(400,30,350,60);
      mainPanel.add(title);

      bTitle = new JLabel(milk.getMName());
      bTitle.setFont(new Font("MonoSpaced", Font.BOLD,20));
      bTitle.setForeground(Color.BLACK);
      bTitle.setBounds(407,88,250,25);
      mainPanel.add(bTitle);

      bLTitle = new JLabel("DETAILS");
      bLTitle.setFont(new Font("MonoSpaced", Font.PLAIN,30));
      bLTitle.setForeground(Color.BLACK);
      bLTitle.setBounds(635,82,230,35);
      mainPanel.add(bLTitle);

      aName = new JLabel(milk.getName());
      aName.setFont(new Font("MonoSpaced", Font.BOLD, 20));
      aName.setForeground(Color.black);
      aName.setBounds(78,240,100,100);
      mainPanel.add(aName);

      sName = new JLabel(milk.getSName());
      sName.setFont(new Font("MonoSpaced", Font.BOLD, 20));
      sName.setForeground(Color.black);
      sName.setBounds(180,240,190,100);
      mainPanel.add(sName);

      dash = new JLabel("-");
      dash.setFont(new Font("MonoSpaced", Font.PLAIN, 40));
      dash.setForeground(Color.black);
      dash.setBounds(78,270,140,100);
      mainPanel.add(dash);

      dash2 = new JLabel("-");
      dash2.setFont(new Font("MonoSpaced", Font.PLAIN, 40));
      dash2.setForeground(Color.black);
      dash2.setBounds(78,490,140,100);
      mainPanel.add(dash2);

      dash3 = new JLabel("-");
      dash3.setFont(new Font("MonoSpaced", Font.PLAIN, 40));
      dash3.setForeground(Color.black);
      dash3.setBounds(78,535,140,100);
      mainPanel.add(dash3);

      dash4 = new JLabel("-");
      dash4.setFont(new Font("MonoSpaced", Font.PLAIN, 40));
      dash4.setForeground(Color.black);
      dash4.setBounds(78,585,140,100);
      mainPanel.add(dash4);

      description = new JTextArea(milk.getDescription());
      description.setFont(new Font("MonoSpaced", Font.PLAIN, 15));
      description.setForeground(Color.black);
      description.setBackground(new Color(0xF5ECEE));
      description.setLineWrap(true);
      description.setEditable(false);
      description.setWrapStyleWord(true);
      description.setBounds(105,310,220,180);
      mainPanel.add(description);
      
      bFit = new JLabel("BENEFITS:");
      bFit.setFont(new Font("MonoSpaced", Font.BOLD, 23));
      bFit.setForeground(Color.black);
      bFit.setBounds(78,460,150,100);
      mainPanel.add(bFit);

      bFit2 = new JTextArea(benefits[0]);
      bFit2.setFont(new Font("MonoSpaced", Font.PLAIN, 15));
      bFit2.setForeground(Color.black);
      bFit2.setBackground(new Color(0xF5ECEE));
      bFit2.setLineWrap(true);
      bFit2.setEditable(false);
      bFit2.setWrapStyleWord(true);
      bFit2.setBounds(105,530,220,50);
      mainPanel.add(bFit2);

      bFit3 = new JTextArea(benefits[1]);
      bFit3.setFont(new Font("MonoSpaced", Font.PLAIN, 15));
      bFit3.setForeground(Color.black);
      bFit3.setBackground(new Color(0xF5ECEE));
      bFit3.setLineWrap(true);
      bFit3.setEditable(false);
      bFit3.setWrapStyleWord(true);
      bFit3.setBounds(105,577,220,50);
      mainPanel.add(bFit3);

      bFit4 = new JTextArea(benefits[2]);
      bFit4.setFont(new Font("MonoSpaced", Font.PLAIN, 15));
      bFit4.setForeground(Color.black);
      bFit4.setBackground(new Color(0xF5ECEE));
      bFit4.setLineWrap(true);
      bFit4.setEditable(false);
      bFit4.setWrapStyleWord(true);
      bFit4.setBounds(105,625,220,50);
      mainPanel.add(bFit4);

      mName = new JTextArea(milk.getMName());
      mName.setFont(new Font("MonoSpaced", Font.BOLD, 40));
      mName.setForeground(Color.black);
      mName.setBackground(new Color(0xF5ECEE));
      mName.setLineWrap(true);
      mName.setEditable(false);
      mName.setWrapStyleWord(true);
      mName.setBounds(430,145,185,150);
      mainPanel.add(mName);

      dash5 = new JLabel("-");
      dash5.setFont(new Font("MonoSpaced", Font.PLAIN, 40));
      dash5.setForeground(Color.black);
      dash5.setBounds(410,270,75,75);
      mainPanel.add(dash5);

      milkDescription = new JTextArea(milk.getMilkDescription());
      milkDescription.setFont(new Font("MonoSpaced", Font.PLAIN, 15));
      milkDescription.setForeground(Color.black);
      milkDescription.setBackground(new Color(0xF5ECEE));
      milkDescription.setLineWrap(true);
      milkDescription.setEditable(false);
      milkDescription.setWrapStyleWord(true);
      milkDescription.setBounds(440,298,185,190);
      mainPanel.add(milkDescription);
      
      nutrients = new JLabel("Milk Nutrients:");
      nutrients.setFont(new Font("MonoSpaced", Font.BOLD, 23));
      nutrients.setForeground(Color.black);
      nutrients.setBounds(420,470,250,100);
      mainPanel.add(nutrients);

      nutrients1 = new JLabel(mNutrients[0]);
      nutrients1.setFont(new Font("MonoSpaced", Font.BOLD, 15));
      nutrients1.setForeground(Color.black);
      nutrients1.setBounds(430,495,200,100);
      mainPanel.add(nutrients1);

      nutrients2 = new JLabel(mNutrients[1]);
      nutrients2.setFont(new Font("MonoSpaced", Font.BOLD, 15));
      nutrients2.setForeground(Color.black);
      nutrients2.setBounds(430,520,200,100);
      mainPanel.add(nutrients2);

      nutrients3 = new JLabel(mNutrients[2]);
      nutrients3.setFont(new Font("MonoSpaced", Font.BOLD, 15));
      nutrients3.setForeground(Color.black);
      nutrients3.setBounds(430,545,200,100);
      mainPanel.add(nutrients3);

      nutrients4 = new JLabel(mNutrients[3]);
      nutrients4.setFont(new Font("MonoSpaced", Font.BOLD, 15));
      nutrients4.setForeground(Color.black);
      nutrients4.setBounds(430,570,200,100);
      mainPanel.add(nutrients4);

      nutrients5 = new JLabel(mNutrients[4]);
      nutrients5.setFont(new Font("MonoSpaced", Font.BOLD, 15));
      nutrients5.setForeground(Color.black);
      nutrients5.setBounds(430,595,200,100);
      mainPanel.add(nutrients5);

      brandName1 = new JLabel(brand1[0]);
      brandName1.setFont(new Font("MonoSpaced", Font.BOLD, 15));
      brandName1.setForeground(Color.black);
      brandName1.setBounds(850,150,400,80);
      mainPanel.add(brandName1);

      brandLink1 = new JLabel(brand1[2]);
      brandLink1.setFont(new Font("MonoSpaced", Font.PLAIN, 15));
      brandLink1.setForeground(Color.black);
      brandLink1.setBounds(850,175,400,80);
      mainPanel.add(brandLink1);

      brandLink11 = new JLabel(brand1[3]);
      brandLink11.setFont(new Font("MonoSpaced", Font.PLAIN, 15));
      brandLink11.setForeground(Color.black);
      brandLink11.setBounds(850,200,400,80);
      mainPanel.add(brandLink11);
      
      brandLink12 = new JLabel(brand1[4]);
      brandLink12.setFont(new Font("MonoSpaced", Font.PLAIN, 15));
      brandLink12.setForeground(Color.black);
      brandLink12.setBounds(850,225,400,80);
      mainPanel.add(brandLink12);

      brandName2 = new JLabel(brand2[0]);
      brandName2.setFont(new Font("MonoSpaced", Font.BOLD, 15));
      brandName2.setForeground(Color.black);
      brandName2.setBounds(850,325,400,80);
      mainPanel.add(brandName2);

      brandLink2 = new JLabel(brand2[2]);
      brandLink2.setFont(new Font("MonoSpaced", Font.PLAIN, 15));
      brandLink2.setForeground(Color.black);
      brandLink2.setBounds(850,350,400,80);
      mainPanel.add(brandLink2);

      brandLink21 = new JLabel(brand2[3]);
      brandLink21.setFont(new Font("MonoSpaced", Font.PLAIN, 15));
      brandLink21.setForeground(Color.black);
      brandLink21.setBounds(850,375,400,80);
      mainPanel.add(brandLink21);
      
      brandLink22 = new JLabel(brand2[4]);
      brandLink22.setFont(new Font("MonoSpaced", Font.PLAIN, 15));
      brandLink22.setForeground(Color.black);
      brandLink22.setBounds(850,400,400,80);
      mainPanel.add(brandLink22);

      brandName3 = new JLabel(brand3[0]);
      brandName3.setFont(new Font("MonoSpaced", Font.BOLD, 15));
      brandName3.setForeground(Color.black);
      brandName3.setBounds(850,500,400,80);
      mainPanel.add(brandName3);

      brandLink3 = new JLabel(brand3[2]);
      brandLink3.setFont(new Font("MonoSpaced", Font.PLAIN, 15));
      brandLink3.setForeground(Color.black);
      brandLink3.setBounds(850,525,400,80);
      mainPanel.add(brandLink3);

      brandLink31 = new JLabel(brand3[3]);
      brandLink31.setFont(new Font("MonoSpaced", Font.PLAIN, 15));
      brandLink31.setForeground(Color.black);
      brandLink31.setBounds(850,550,400,80);
      mainPanel.add(brandLink31);
      
      brandLink32 = new JLabel(brand3[4]);
      brandLink32.setFont(new Font("MonoSpaced", Font.PLAIN, 15));
      brandLink32.setForeground(Color.black);
      brandLink32.setBounds(850,575,400,80);
      mainPanel.add(brandLink32);

      this.add(mainPanel);
      this.setVisible(true);
	}
   public static void main(String[] args) {
      new SearchResultPage();
   }
}