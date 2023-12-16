package OOP_Project.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import OOP_Project.model.*;

public class MilkPage extends JFrame {
   private Milk milk;
   private Dimension screenSize;
   private JPanel panel;

   public MilkPage(Milk milk)
	{
      this.milk = milk;
      screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      this.setSize(screenSize);
      this.setLayout(new GridBagLayout());
      this.setBackground(Color.black);

      panel = new JPanel();
      panel.setPreferredSize(new Dimension(500,500));
      panel.setLayout(null);
      
      JLabel label = new JLabel(milk.getSName());
      label.setSize(250,250);
      
      panel.add(label);

      this.add(panel);
      this.setVisible(true);
	}
}