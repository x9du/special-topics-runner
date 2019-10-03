package shapes;

/**
 * 
 * @author Yalchin Aliyev
 * @version 0.01 28.02.2016
 *
 */
public interface Selectable {
	
	boolean getSelected();
	
	void setSelected(boolean selected);
	
	Shape contains(int x, int y);
}
