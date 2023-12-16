package OOP_Project.controller;

import OOP_Project.view.ProfilePage;
import OOP_Project.view.SearchPage;
import OOP_Project.view.SearchResultPage;
import OOP_Project.view.WelcomePage;

import java.awt.event.*;

//import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class SearchPageController implements ActionListener {
    private SearchPage sPage;
    private JButton submit,clear,signOut,profile;
    public SearchPageController(SearchPage sPage, JButton submit,JButton clear, JButton signOut,JButton profile){
        this.sPage = sPage;
        this.submit = submit;
        this.signOut = signOut;
        this.profile = profile;
        this.clear = clear;
    }
    
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == signOut){
            int result = JOptionPane.showConfirmDialog(null, "Are you sure?", "Signout", JOptionPane.YES_NO_OPTION);

            if(result == JOptionPane.YES_OPTION){
                sPage.dispose();
                new WelcomePage();
            }
        }
        else if (e.getSource() == profile){
            sPage.dispose();
            new ProfilePage("rustum", 10, "Gay");
        }
        else if (e.getSource() == clear)
            clear();
        else {
            sPage.dispose();
            new SearchResultPage();
        }
    }

    public void clear(){
        sPage.getGender().clearSelection();
        sPage.getAge().setSelectedIndex(0);
        sPage.getStatus().setSelectedIndex(0);
        sPage.getCondition().setSelectedIndex(0);
        sPage.getLevel().setSelectedIndex(0);
    }
}
