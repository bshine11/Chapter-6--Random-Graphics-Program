/*************************************
 * Brendan Shine 
 * Mr. Kiedes Period 2               *
 * 10-6-15             
 * Random Graphics Program           *
 *                                   *
 ************************************/
// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;

public class Lab06vst extends Applet {
	public void init() {
		setSize(800, 600);
	}

	public void paint(Graphics g) {
		int x;
		int y;
		int x1;
		int y1;

		// Draw Grid
		g.drawRect(10, 10, 780, 580);
		g.drawLine(400, 10, 400, 590);
		g.drawLine(10, 300, 790, 300);

		// Draw Random Lines
		for (int k = 1; k <= 50; k++) {
			int red = (int) (Math.random() * 256); // colors
			int green = (int) (Math.random() * 256); // colors
			int blue = (int) (Math.random() * 256); // colors
			g.setColor(new Color(red, green, blue));
			x = (int) (Math.random() * 390) + 10;
			x1 = (int) (Math.random() * 390) + 10;
			y = (int) (Math.random() * 290) + 10;
			y1 = (int) (Math.random() * 290) + 10;
			g.drawLine(x, y, x1, y1);
		}
		// Draw Random Squares
		for (int k = 1; k <= 100; k++) {
			int red = (int) (Math.random() * 256); // colors
			int green = (int) (Math.random() * 256); // colors
			int blue = (int) (Math.random() * 256); // colors
			g.setColor(new Color(red, green, blue));
			x = (int) (Math.random() * 340) + 400; // x
			x1 = 50; // width
			y = (int) (Math.random() * 240) + 10; // y
			y1 = 50; // height
			g.fillRect(x, y, x1, y1);
		}
		// Draw Random Circles
		for (int k = 1; k <= 200; k++) {
			int red = (int) (Math.random() * 256); // colors
			int green = (int) (Math.random() * 256); // colors
			int blue = (int) (Math.random() * 256); // colors
			g.setColor(new Color(red, green, blue));
			x = (int) (Math.random() * 290) + 10; // x coord
			x1 = (int) (Math.random() * 90) + 10; // radius (width and height)
			y = (int) (Math.random() * 190) + 300; // y coord
			g.drawOval(x, y, x1, x1);
		}
		// Draw 3-D Box
		g.setColor(Color.red);
		g.fillRect(580, 430, 100, 100);// red box
		g.setColor(Color.blue);
		Polygon blueBox = new Polygon(); // blue box
		blueBox.addPoint(640, 430);
		blueBox.addPoint(640, 380);
		blueBox.addPoint(680, 430);
		g.fillPolygon(blueBox);

		g.setColor(Color.green);
		Polygon greenBox = new Polygon(); // green box
		greenBox.addPoint(580, 530);
		greenBox.addPoint(580, 430);
		greenBox.addPoint(540, 380);
		greenBox.addPoint(540, 480);
		g.fillPolygon(greenBox);

		g.setColor(Color.yellow);
		Polygon yellowBox = new Polygon(); // yellow box
		yellowBox.addPoint(640, 380);
		yellowBox.addPoint(540, 380);
		yellowBox.addPoint(580, 430);
		yellowBox.addPoint(640, 430);
		g.fillPolygon(yellowBox);
	}
}
