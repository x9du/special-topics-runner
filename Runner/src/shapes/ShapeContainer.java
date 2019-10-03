package shapes;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @author Yalchin Aliyev
 * @version 0.01 28.02.2016
 *
 */
public class ShapeContainer implements Iterable { // Iterable: allows for-each loop over objects
    
    // properties
    private ArrayList<Shape> shapes; // Shape: implements Locatable
    
    // constructors
    public ShapeContainer() {
        shapes = new ArrayList<Shape>();
    }
    
    // methods
    public void add(Shape s) {
        shapes.add(s);
    }
    
    public double getArea() { // total area
        double area = 0;
        for(int i = 0; i < shapes.size(); i++)
            area = area + shapes.get(i).getArea();
        return area;
    }
    
    public String toString() {
        String str = "";
        for(Shape shape : shapes) {
            str = str + shape.toString() + "\n";
        }
        return str;
    }
    
    // Returns shapes at x, y
    public Shape contains(int x, int y) { // Guess contains(x, y) means the shape is at that point
        for(Shape shape : shapes) {
            if( ((Selectable) shape).contains(x, y) != null) // (Selectable): can set something as selected or not
                return shape;
        }
        return null;
    }
    
    public void remove() { // Removes all selected shapes
        for(int i = 0; i < shapes.size(); i++) {
            if( ( ((Selectable) shapes.get(i)).getSelected())) {
                shapes.remove(i);
                i--;
            }
        }
    }
    
    public int size() {
    	return shapes.size();
    }
    
    public int selectAllAt(int x, int y) { // Selects shapes at x, y
    	int containers;
    	
    	containers = 0;
    	for(Shape shape : shapes) {
            if ( ((Selectable) shape).contains(x, y) != null) {
            	((Selectable) shape).setSelected(true);
            	containers++;
            } 
        }
    	return containers; // Returns number of Shapes selected
    }

	@Override
	public Iterator iterator() { // Creates an iterator
		return shapes.iterator();
	}
	
	public Shape getShape(int i) {
		return shapes.get(i);
	}
}
