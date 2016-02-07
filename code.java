/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author PRAYALANKAR ASHUTOSH
 */
import java.awt.*;
import java.util.Random;

import javax.swing.JFrame;


public class fafa extends JFrame {
	
	Random randm;
	Color color = new Color(15);
	private Color[] colors = {Color.BLACK,Color.BLUE,Color.GREEN,Color.RED,Color.GRAY,Color.CYAN,Color.MAGENTA,Color.ORANGE};
    public fafa() {
    	super("A Algorithmic Tree");
        
        randm = new Random();
        setBounds(10, 10, 800, 600);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
 
    private void drawTree(Graphics g, int x1, int y1, double angle, int depth) {
        if (depth == 0) return;
        int x2 = x1 + (int) (Math.cos(Math.toRadians(angle))* depth * 6);
        int y2 = y1 + (int) (Math.sin(Math.toRadians(angle))* depth * 6);
        g.drawLine(x1, y1, x2, y2);
        g.setColor(colors[randm.nextInt(colors.length)]);
        drawTree(g, x2, y2, angle - 20, depth - 1);
        drawTree(g, x2, y2, angle - 10, depth - 1);
        drawTree(g, x2, y2, angle + 20, depth - 1);
        drawTree(g, x2, y2, angle + 10, depth - 1);
    }
 
    
    public void paint(Graphics gg) {
        gg.setColor(Color.BLACK);
        int x1 = 200;
        int x2 = 350;
        int y1 = 100;
        int y2 = 800;
      
        
        drawTree(gg, 500, 400, -90, 9);
        drawTree(gg, 900, 400, -120, 9);
        drawTree(gg, 100, 400, -60, 9);
    }
 
    public static void main(String[] args) {
        new fafa().setVisible(true);
    }
}

