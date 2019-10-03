package main;

import java.awt.Color;
import java.awt.Graphics2D;

import shapes.Drawable;
import shapes.Square;
/**
 * 
 * @author Yalchin ALIYEV
 * @version 1.0 26.03.2016
 *
 */
public class Obstacle extends Square implements Drawable { // Square: Local class Rectangle with same width and height
	// Drawable: void draw(Graphics2D g)

	private int R, G, B;
	
	public Obstacle(int x, int y) {
		super(20); // Create square with side length 20
		setLocation(x, y);
		
		// Fill a random color
		R = (int) (Math.random() * 256);
		G = (int) (Math.random() * 256);
		B = (int) (Math.random() * 256);
		
	}
	
	@Override
	public void draw(Graphics2D g) {
		g.setColor(new Color(R, G, B));
		g.fillRect(getX(), getY(), side, side);
	}
}
