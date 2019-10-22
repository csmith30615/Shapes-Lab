package ShapesLab;

import java.util.ArrayList;

/**
 * Tests if the shapes classes function properly
 * @author csmith30615
 */
public class ShapesLab {
    //Initialize Global Variables
    static ArrayList<Shape> shapes = new ArrayList<>();

    /**
     * Creates 6 shapes (2 of each), cycles through each of them, and prints 
     * their String format to the System
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initialize Variables
        shapes.add(new Triangle(1, 4, 5, 1.0, 3.0));
        shapes.add(new Circle(1, 2, 3, 4.0));
        shapes.add(new Rectangle(-1, -1, -1, 2.0, 2.0));
        shapes.add(new Triangle(0, 0, 0, 2.0, 5.0));
        shapes.add(new Circle(1, -3, 2, 1.0));
        shapes.add(new Rectangle(1, 0, 0, 2.5, 3.7));

        for(Shape e : shapes){
            System.out.println(e.toString());
        }
    }

}
