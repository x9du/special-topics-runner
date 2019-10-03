package shapes;

/**
 * 
 * @author Yalchin Aliyev
 * @version 0.01 28.02.2016
 *
 */
public class Rectangle extends Shape implements Selectable {
    
    // properties
    private int width, height;
    private boolean selected;
    
    // constructors
    public Rectangle (int width, int height) {
        this.width = width;
        this.height = height;
        selected = false;
    }
    
    // methods
    public double getArea() {
        return width * height;
    }
    
    public String toString() {
        String str;
        
        str = "\nShape : " + ( "" + this.getClass()).substring( 13, ( "" + this.getClass()).length()) + "\nArea : " + this.getArea()
            + "\nSelected : " + getSelected();
        
        return str;
    }
    
    @Override
    public boolean getSelected() {
        return selected;
    }
    
    @Override
    public void setSelected(boolean selected) {
        this.selected = selected;
    }
    
    @Override
    public Shape contains(int x, int y) {
        if(x >= this.x && x <= this.x + width && y >= this.y && y <= this.y + height) {
        	return this;
        }
        return null;
    }
    
}
