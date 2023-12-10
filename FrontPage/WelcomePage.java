package FrontPage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;
import javax.swing.border.Border;

public class WelcomePage extends JFrame {
   private Dimension screenSize;
   private ImageIcon logoSmall, logoBig, blobIcon, blobIcon2, blobIcon3, patternLeft, patternRight, patternBottomRight;
   JLabel logoXSLabel, welcomeLabel, companyName, container, title, registerPanel;;
   private JButton registerButton;
   JPanel mainPanel;
   JPanel leftPanel;
   JPanel rightPanel;
   JPanel titlePanel;
   JPanel rightPanelContainer;

   public static ImageIcon createImage(String path, int width, int height) {
      ImageIcon icon = new ImageIcon(Objects.requireNonNull(WelcomePage.class.getResource(path)));
      return new ImageIcon(icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
   }
   
   public WelcomePage() {

      logoSmall = createImage("/logoBig.png", 60, 60);
      logoBig = createImage("/milk.png", 300, 250);
      blobIcon = createImage("/blob.png", 200, 200);
      blobIcon2 = createImage("/blob2.png", 200, 200);
      blobIcon3 = createImage("/blob2.png", 100, 100);
      patternLeft = createImage("/patternLeft.png", 250, 250);
      patternRight = createImage("/patternRight.png", 250, 250);
      patternBottomRight = createImage("/patternBottomRight.png", 250, 250);

      Border border = BorderFactory.createLineBorder(Color.BLACK, 4);

      logoXSLabel = new JLabel();
      logoXSLabel.setBorder(border);
      logoXSLabel.setIcon(logoSmall);
      logoXSLabel.setPreferredSize(new Dimension(200, 30));

      setIconImage(logoSmall.getImage());
      setTitle("Welcome to Milkipedia");
      screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      setSize(screenSize.width, screenSize.height);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(true);
      setExtendedState(JFrame.MAXIMIZED_BOTH);
      setLayout(new GridBagLayout());
      // getContentPane().setBackground(Color.BLACK);


      /* Left Panel Part */
      welcomeLabel = new JLabel("Welcome to");
      welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
      welcomeLabel.setFont(new Font("Monospaced", Font.BOLD, 65));
      welcomeLabel.setForeground(Color.BLACK);

      companyName = new JLabel("Milkipedia");
      // companyName.setBorder(border);
      companyName.setHorizontalAlignment(JLabel.CENTER);
      companyName.setFont(new Font("Monospaced", Font.BOLD, 65));
      companyName.setForeground(Color.BLACK);
      
      registerButton = new JButton("Register");
      registerButton.setPreferredSize(new Dimension(300, 60));
      registerButton.setFont(new Font("Monospaced", Font.BOLD, 40));
      registerButton.setBorder(border);
      registerButton.setFocusable(false);
      registerButton.setBackground(Color.WHITE);
      registerButton.setVerticalAlignment(JButton.CENTER);
      registerButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      registerButton.setForeground(Color.BLACK);

      registerButton.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseEntered(MouseEvent e) {
             registerButton.setBackground(Color.BLACK);
             registerButton.setForeground(Color.WHITE);
         }

         @Override
         public void mouseExited(MouseEvent e) {
             registerButton.setBackground(Color.WHITE);
             registerButton.setForeground(Color.BLACK);
         }
     });


      registerPanel = new JLabel();
      // registerPanel.setBorder(border);
      // registerPanel.setBackground(Color.RED);
      // registerPanel.setOpaque(true);
      registerPanel.setHorizontalAlignment(JLabel.CENTER);
      registerPanel.setForeground(Color.BLACK);
      registerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 10));
      registerPanel.add(registerButton);

      container = new JLabel();
      container.setPreferredSize(new Dimension(450, 240));
      container.setLayout(new GridLayout(3, 1));
      container.add(welcomeLabel);
      container.add(companyName);
      container.add(registerPanel);

      JPanel leftPanelMain = new JPanel();
      leftPanelMain.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 80));
      leftPanelMain.setPreferredSize(new Dimension(20, 500));
      leftPanelMain.setBackground(new Color(0xFFC0CB));
      leftPanelMain.add(container);

      titlePanel = new JPanel();
      titlePanel.setBackground(new Color (0xFFC0CB));
      titlePanel.setPreferredSize(new Dimension(100, 150));
      titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 30));
      
      title = new JLabel("");
      title.setFont(new Font("Monospaced", Font.BOLD, 45));
      title.setPreferredSize(new Dimension(450, 70));
      title.setForeground(Color.BLACK);
      title.setIcon(logoSmall);
      title.setBackground(new Color (0xFFC0CB));

      
      // title.setHorizontalAlignment(JLabel.CENTER);
      // title.setBorder(border);
      title.setOpaque(true);
      titlePanel.add(title);

      leftPanel = new JPanel();
      // leftPanel.setBackground(new Color(0xeec0c8));
      leftPanel.setPreferredSize(new Dimension(500, 100));
      leftPanel.setOpaque(true);
      leftPanel.setLayout(new BorderLayout());
      leftPanel.add(titlePanel, BorderLayout.NORTH);
      leftPanel.add(leftPanelMain);
      /* Left Panel Part */


      /* Right Panel Part Starts*/

      JLabel blackLabel1 = new JLabel();
      blackLabel1.setBounds(380, 220, 300, 250);
      blackLabel1.setIcon(logoBig);
      // blackLabel1.setBorder(border);

      JLabel blackLabel2 = new JLabel();
      blackLabel2.setIcon(blobIcon);
      blackLabel2.setBounds(-20, 50, 200, 200);
      // blackLabel2.setBorder(border);

      JLabel blackLabel3 = new JLabel();
      blackLabel3.setBounds(100, 435, 250, 250);
      blackLabel3.setIcon(patternLeft);
      // blackLabel3.setBorder(border);

      JLabel blackLabel4 = new JLabel();
      blackLabel4.setBounds(450, -70, 200, 200);
      blackLabel4.setIcon(blobIcon2);
      // blackLabel4.setBorder(border);

      JLabel blackLabel5 = new JLabel();
      blackLabel5.setBounds(750, 0, 250, 250);
      // blackLabel5.setBorder(border);
      blackLabel5.setIcon(patternRight);

      JLabel blackLabel6 = new JLabel();
      blackLabel6.setBounds(250, 150, 100, 100);
      blackLabel6.setIcon(blobIcon3);
      // blackLabel6.setBorder(border);

      JLabel blackLabel7 = new JLabel();
      blackLabel7.setBounds(720, 310, 100, 100);
      blackLabel7.setIcon(blobIcon3);
      // blackLabel7.setBorder(border);
    

      JLabel blackLabel8 = new JLabel();
      blackLabel8.setBounds(750, 435, 250, 250);
      blackLabel8.setIcon(patternBottomRight);
      // blackLabel8.setBorder(border);

      JLabel blackLabel9 = new JLabel();
      blackLabel9.setBounds(630, 630, 100, 100);
      blackLabel9.setIcon(blobIcon3);

      JLabel blackLabel10 = new JLabel();
      blackLabel10.setBounds(930, 290, 100, 100);
      blackLabel10.setIcon(blobIcon3);

      JLabel blackLabel11 = new JLabel();
      blackLabel11.setBounds(280, 510, 100, 100);
      // blackLabel11.setBorder(border);
      blackLabel11.setIcon(blobIcon3);
      // blackLabel10.setBorder(border);
      // blackLabel6.setBorder(border);


      rightPanelContainer = new JPanel();
      rightPanelContainer.setPreferredSize(new Dimension(1000, 100));
      rightPanelContainer.setBackground(Color.WHITE);
      rightPanelContainer.setLayout(null);
      rightPanelContainer.add(blackLabel1);
      rightPanelContainer.add(blackLabel2);
      rightPanelContainer.add(blackLabel3);
      rightPanelContainer.add(blackLabel4);
      rightPanelContainer.add(blackLabel5);
      rightPanelContainer.add(blackLabel6);
      rightPanelContainer.add(blackLabel7);
      rightPanelContainer.add(blackLabel8);
      rightPanelContainer.add(blackLabel9);
      rightPanelContainer.add(blackLabel10);
      rightPanelContainer.add(blackLabel11);

      rightPanel = new JPanel();
      rightPanel.setLayout(new GridLayout());
      rightPanel.setBackground(new Color (0x0000));
      rightPanel.setPreferredSize(new Dimension(1000, 100));
      rightPanel.setOpaque(true);
      rightPanel.add(rightPanelContainer);

      /* Right Panel Part Ends*/

      mainPanel = new JPanel();
      mainPanel.setPreferredSize(new Dimension(1400, 685));
      mainPanel.setBackground(Color.CYAN);
      mainPanel.setLayout(new BorderLayout());
      // mainPanel.setBorder(border);
      add(mainPanel);
      mainPanel.add(leftPanel, BorderLayout.WEST);
      mainPanel.add(rightPanel, BorderLayout.EAST);
      setVisible(true);
   }
   
   public JButton getRegister() {
      return registerButton;
   }
}