package shapes;

/**
 * 
 * @author Yalchin Aliyev
 * @version 0.01 28.02.2016
 *
 */
public class Circle extends Shape implements Selectable {
    
    // properties
    protected int radius;
    private boolean selected;
    
    // constructors
    public Circle( int radius) {
        
        this.radius = radius;
        selected = false;
    }
    
    // methods
    public double getArea() {
        
        return Math.PI * radius * radius;
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
        
        if ( (x - getX()) * (x - getX()) + (y - getY()) * (y - getY()) <= this.radius * this.radius) {
          return this;
        }
        return null;
    }
}
