package FrontPage;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class WelcomePage extends JFrame implements ActionListener {
   private Dimension screenSize;
   private ImageIcon logoIcon;
   private ImageIcon logoIcon1;
   private Container cont;
   private JLabel title;
   private JLabel labelIcon;
   private JButton register;

   public WelcomePage() {
      setTitle("Welcome to Milkipedia");
      screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      setSize(screenSize.width, screenSize.height);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(true);
      
      logoIcon = new ImageIcon("logoOrig.png");
      logoIcon1 = new ImageIcon("logoBig.png");
      setIconImage(logoIcon.getImage());

      cont = getContentPane();
		cont.setLayout(null);
      
      labelIcon = new JLabel();
      labelIcon.setBounds(602, 80, 200, 200);
      labelIcon.setIcon(logoIcon1);
      cont.add(labelIcon);
      
      title = new JLabel("MILKIPEDIA");
      title.setBounds(400, 275, 1000, 80);
      title.setFont(new Font("Courier", Font.BOLD, 100));
      title.setForeground(Color.BLACK);
      cont.add(title);

      register = new JButton("REGISTER");
      register.setFont(new Font("Courier", Font.BOLD, 30));
      register.setBounds(585, 375, 250, 50);
      register.setFocusable(false);
      register.addActionListener(this);
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
      setVisible(true);     
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == register) {
         this.dispose();
         new RegistrationPage();
      }
   }
}