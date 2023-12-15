package OOP_Project.controller;

import OOP_Project.view.TermsAndConditionsPage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TermsAndConditionsController implements ActionListener{
    private TermsAndConditionsPage tPage;
    public static boolean term = false;
    private JButton accept,decline;
    public TermsAndConditionsController(TermsAndConditionsPage tPage, JButton accept, JButton decline){
        this.tPage = tPage;
        this.accept = accept;
        this.decline = decline;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == accept){
            term = true;
            tPage.dispose();
        }
        else{
            term = false;
            tPage.dispose();
        }
    }
}
