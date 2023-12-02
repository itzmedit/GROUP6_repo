package FrontPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WelcomePage extends JFrame {
   private Dimension screenSize;
   private ImageIcon logoIcon1, logoIcon2, logoIcon3a, logoIcon3b;
   private Container cont;
   private JMenuBar barLine;
   private JLabel title, labelIcon;
   private JButton register;
   private JLabel black1, black2;

   public WelcomePage() {
      setTitle("Welcome to Milkipedia");
      screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      setSize(screenSize.width, screenSize.height);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(true);
      
      logoIcon1 = new ImageIcon("logoOrig.png");
      setIconImage(logoIcon1.getImage());
      logoIcon2 = new ImageIcon("logoBig.png");
      logoIcon3a = new ImageIcon("black.png");
      logoIcon3b = new ImageIcon("blackRev.png");

      cont = getContentPane();
		cont.setLayout(null);
      
      barLine = new JMenuBar();
      barLine.setBounds(0, 0, screenSize.width-15, 35);
      barLine.setBackground(Color.BLACK);
      cont.add(barLine);
      
      labelIcon = new JLabel();
      labelIcon.setBounds(602, 115, 200, 200);
      labelIcon.setIcon(logoIcon2);
      cont.add(labelIcon);
      
      title = new JLabel("MILKIPEDIA");
      title.setForeground(Color.BLACK);
      title.setBounds(400, 315, 1000, 80);
      title.setFont(new Font("Courier", Font.BOLD, 100));
      title.setForeground(Color.BLACK);
      cont.add(title);

      register = new JButton("REGISTER");
      register.setForeground(Color.BLACK);
      register.setFont(new Font("Courier", Font.BOLD, 30));
      register.setBackground(Color.WHITE);
      register.setBorder(BorderFactory.createLineBorder(Color.BLACK, 4));
      register.setBounds(585, 420, 250, 50);
      register.setFocusable(false);
      register.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      register.addMouseListener(new MouseAdapter() {
      
      @Override
      public void mouseEntered(MouseEvent e) {          
         register.setBackground(Color.BLACK);
         register.setForeground(Color.WHITE);
      }
            
      @Override
      public void mouseExited(MouseEvent e) {
         register.setBackground(Color.WHITE);
         register.setForeground(Color.BLACK);
      }
      });

      cont.add(register);
      
      black1 = new JLabel();
      black1.setIcon(logoIcon3a);
      black1.setBounds(-48, -60, 500, 500);
      cont.add(black1);
      
      black2 = new JLabel();
      black2.setIcon(logoIcon3b);
      black2.setBounds(900, 330, 500, 500);
      cont.add(black2);
      
      setVisible(true);     
    }
   
    public JButton getRegister() {
      return register;
    }
}