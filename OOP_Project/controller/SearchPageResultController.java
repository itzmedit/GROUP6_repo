package OOP_Project.controller;

import OOP_Project.view.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class SearchPageResultController implements ActionListener{
    private SearchResultPage sRPage;
    private JButton back, profile,milk, search,signOut;

    public SearchPageResultController(SearchResultPage sRPage, JButton back,JButton milk,  JButton profile, JButton signOut){
        this.sRPage = sRPage;
        this.back = back;
        this.milk = milk;
        this.profile = profile;
        this.signOut = signOut;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == back){
            sRPage.dispose();
            new SearchPage();
        }
        else if (e.getSource() == profile){
            sRPage.dispose();
            new ProfilePage(" ", 0, " ");
        }
        else if (e.getSource() == milk){
            sRPage.dispose();
            new MilkPage();
        }
        else{
            sRPage.dispose();
            int result = JOptionPane.showConfirmDialog(null, "Are you sure?", "Signout", JOptionPane.YES_NO_OPTION);

            if(result == JOptionPane.YES_OPTION){
                sRPage.dispose();
                new WelcomePage();
            }
        }
    }
        
}
