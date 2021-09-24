package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import view.SmilPanel;

public class SmilCanvas extends JPanel {

    public static int WIDTH = 500;
    public static int HEIGHT = 500;

    private SmilPanel panel;

    public SmilCanvas(SmilPanel panel) {
        this.panel = panel;
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.WHITE);
    }
    
}
