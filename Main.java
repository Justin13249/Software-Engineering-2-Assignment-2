import javax.swing.JFrame;


import model.Smil;
import view.SmilPanel;

public class Main {
    public static void main(String[] args) {

        
        
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocation(400,100);

        Smil smil = new Smil();

        var smilPanel = new SmilPanel(window, smil);
        smilPanel.init();

        window.pack();
        window.setVisible(true);
        
    }
}