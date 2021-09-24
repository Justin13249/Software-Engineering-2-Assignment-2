package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.border.TitledBorder;
import javax.swing.BorderFactory;

import model.Smil;
import view.SmilCanvas;
import controller.SmilListener;

public class SmilPanel {

    private JFrame window;
    private JTextField enter = new JTextField();
    private JRadioButton imageButton = new JRadioButton("Image");
    private JRadioButton textButton = new JRadioButton("Text");
    private JRadioButton videoButton = new JRadioButton("Video");
    private JRadioButton audioButton = new JRadioButton("Audio");
    private JButton sendButton = new JButton("Send");

    private SmilCanvas canvas;
    private Smil smil;

    public SmilPanel(JFrame window, Smil smil) {
        this.window = window;
        this.smil = smil;
    }

    public void init() {

        Container cp = window.getContentPane();
        
        canvas = new SmilCanvas(this);
        cp.add(BorderLayout.CENTER, canvas);
        
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(2,1));

        SmilListener keyListener = new SmilListener(this);
        southPanel.add(enter);
        sendButton.addActionListener(keyListener);
        southPanel.add(sendButton);

        JPanel radioPanel = new JPanel();
        radioPanel.add(imageButton);
        radioPanel.add(textButton);
        radioPanel.add(videoButton);
        radioPanel.add(audioButton);
        southPanel.add(radioPanel);

        // radio group
        ButtonGroup typeGroup = new ButtonGroup();
        typeGroup.add(imageButton);
        typeGroup.add(textButton);
        typeGroup.add(videoButton);
        typeGroup.add(audioButton);

        // // titled border for radio
        // TitledBorder title = BorderFactory.createTitledBorder("Type of Media");
        // radioPanel.setBorder(title);
        
        cp.add(BorderLayout.SOUTH, southPanel);
    }
    
}
