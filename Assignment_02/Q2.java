package Assignment_02;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Q2 extends Canvas{

	public static void main(String[] args) {
		
		Q2 o = new Q2();
		
		JFrame f= new JFrame();
		f.add(o);
		
		f.setSize(500, 280);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public void paint(Graphics grap) {
		
		//grap.drawOval(25, 140, 40, 70);
		
		//grap.drawLine(FRAMEBITS, ERROR, ALLBITS, ABORT);
		
		setForeground(Color.ORANGE);
		grap.fillOval(140,140,40,60);
		

		
		
	}

}
