package shapes;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 * 
 * @author Yalchin Aliyev
 * @version 0.01 28.02.2016
 *
 */
public class Square extends Rectangle {
	// properties
	protected int side;
	
	// constructors
	public Square(int side) {
		super(side, side);
		this.side = side;
	}
}
