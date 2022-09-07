package bin;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

public class Gun {

	private Polygon p;

	public Gun() {

		int[] xlist = {0,0,8,13,18,26,26,0};
		int[] ylist = {15,5,5,0,5,5,15,15};
		p = new Polygon(xlist,ylist,xlist.length);

	}

	public void draw(Graphics2D g2) {

		g2.setColor(Color.YELLOW);
		g2.fill(p);
		g2.setColor(Color.BLACK);
		g2.draw(p);
	}

	public void moveLeftGun() {

	}

	public void moveRightGun() {

	}

	public void setGun() {

	}
}
