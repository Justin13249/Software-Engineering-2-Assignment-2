package model;

import javax.swing.JOptionPane;

import java.util.ArrayList;

public class SmilGenerator {

    private ArrayList<Smil> smil = new ArrayList<>();
    
    public void Send() {
        if(smil.size() <= 0) {
            JOptionPane.showMessageDialog(new JFrame(), "Dialog");
        }
    }
}
