package OOP_Project.controller;

import OOP_Project.view.RegistrationPage;
import OOP_Project.view.SearchPage;
import OOP_Project.view.TermsAndConditionsPage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
//import javax.swing.JOptionPane;


public class RegistrationPageController implements ActionListener {
    private RegistrationPage rPage;
    private JButton submitButton;
    private JButton clearButton;
    private JCheckBox terms;
    //private String firstN;
    //private String lastN;
    //private String middleN;

    public RegistrationPageController(RegistrationPage rPage, JCheckBox terms, JButton submitButton, JButton clearButton){
        this.rPage = rPage;
        this.terms = terms;
        this.submitButton = submitButton;
        this.clearButton = clearButton;
    }
    //JOptionPane.showMessageDialog(null, "Everything is empty nigga", "Warning", JOptionPane.WARNING_MESSAGE);
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == terms){
            new TermsAndConditionsPage();
        }
        else if (e.getSource() == submitButton){
            rPage.dispose();
            new SearchPage();
        }
        else if (e.getSource() == clearButton){
            Reset();
        }
    }

    private void Reset(){
            rPage.setFName();
            rPage.setMName();
            rPage.setLName();
            rPage.getSuffix().setSelectedIndex(0);
            rPage.getGender().clearSelection();
            rPage.getYear().setSelectedIndex(0);
            rPage.getMonth().setSelectedIndex(0);
            rPage.getDay().setSelectedIndex(0);
            rPage.setEmail();
            rPage.setCEmail();
            rPage.getTerm().setSelected(false);
    }
}
