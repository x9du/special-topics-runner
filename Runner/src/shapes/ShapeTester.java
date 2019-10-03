package shapes;
import java.util.Scanner;

/**
 * 
 * @author Yalchin Aliyev
 * @version 0.01 28.02.2016
 *
 */
public class ShapeTester {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		
		// variables
		char yesNo;
		int option, type, width, height, radius, x, y;
		ShapeContainer shapes;
		
		shapes = new ShapeContainer();
		
		do {
			
			menu();
			System.out.print("Select an option: ");
			option = scan.nextInt();
			
			if ( option == 1) {
				
				shapes = new ShapeContainer();
				System.out.println( "The set is created");
			}
			else if ( option == 2) {
				
				do {
					
					System.out.print( "\n(1) Circle\n"
									+ "(2) Rectangle\n"
									+ "(3) Square\n"
									+ "(4) Main menu\n"
									+ "\nSelect the type: ");
					type = scan.nextInt();
					if ( type == 1) {
						
						System.out.print( "Enter radius: ");
						radius = scan.nextInt();
						
						if ( radius > 0) {
							shapes.add( new Circle( radius));
							System.out.println( "The circle is added!");
						}
						else
							System.out.println( "ERROR! Radius should be positive integer!");
					}
					else if ( type == 2) {
						
						System.out.print( "Enter width and height: ");
						width = scan.nextInt();
						height = scan.nextInt();
						
						if ( width > 0 && height > 0) {
							
							shapes.add( new Rectangle(width, height));
							System.out.println( "The rectangle is added!");
						}
						else
							System.out.println( "ERROR! Width and height should be positive integers!");
					}
					else if ( type == 3) {
						
						System.out.print( "Enter side: ");
						width = scan.nextInt();
						
						if ( width > 0) {
							
							shapes.add( new Square(width));
							System.out.println( "The square is added!");
						}
						else
							System.out.println( "ERROR! Width and height should be positive integers!");
					}
						
				} while ( type != 4);
			}
			else if ( option == 3) {
				
				System.out.println( "the total surface area is " + shapes.getArea());
			}
			else if ( option == 4) {
				
				System.out.println( shapes);
			}
			else if ( option == 5) {
				
				System.out.println( "Enter a point(x,y): ");
				x = scan.nextInt();
				y = scan.nextInt();
				
				if ( shapes.contains(x, y) != null) {
					
					System.out.println( shapes.contains(x, y));
					System.out.print( "Do u want to change the selected state(y/n)?");
					yesNo = in.next().charAt(0);
					
					if( yesNo == 'y') {
						if ( (shapes.contains(x, y) instanceof Rectangle) )
							if ( ((Rectangle) shapes.contains(x, y)).getSelected())
								((Rectangle) shapes.contains(x, y)).setSelected( false);
							else
								((Rectangle) shapes.contains(x, y)).setSelected( true);
						else 
							if ( ((Circle) shapes.contains(x, y)).getSelected())
								((Circle) shapes.contains(x, y)).setSelected( false);
							else
								((Circle) shapes.contains(x, y)).setSelected( true);
						System.out.println( "The selected state was changed!");
					}
					
				}
				else 
					System.out.println( "There is no such shape!");
			}
			else if ( option == 6) {
				
				shapes.remove();
				System.out.println( "The selected shapes were removed!");
			}
			
		} while ( option != 7);
		System.out.println( "Bye Bye!");
	}
	
	// menu
	private static void menu() {
		
		System.out.println( "\n|--------------------------------------------------|\n"
				            + "|(1) Create an empty set of shapes-----------------|\n"
				            + "|(2) Add a shape to the set------------------------|\n"
				            + "|(3) Compute & print out the total surface area----|\n"
				            + "|(4) Print out information about all of the shapes-|\n"
				            + "|(5) Find the first shape containing the point-----|\n"
				            + "|(6) Remove selected shapes------------------------|\n"
				            + "|(7) Quit------------------------------------------|\n"
				            + "|--------------------------------------------------|\n");
	}

}
