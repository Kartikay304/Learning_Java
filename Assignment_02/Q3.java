package Assignment_02;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JFrame;

public class Q3 extends Canvas{

	public static void main(String[] args) {
		
		Q3 o = new Q3();
		
		JFrame f= new JFrame();
		f.add(o);
		
		f.setSize(400, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public void paint(Graphics grap) {
		Graphics2D g = (Graphics2D) grap;
		//grap.drawOval(25, 140, 40, 70);
		setForeground(Color.BLUE);
		grap.fillOval(50,50,50,50);
		grap.setColor(Color.BLUE);
      g.draw(new Line2D.Double(0, 0, 400, 400));
		
	
		

		
		
	}

}


