package ShapesLab;

/**
 * Creates a Circle object
 * @author csmith30615
 */
public class Circle extends Shape{
    //Initialize Global Variables
    private double radius, area;
    
    //Constructors
    
    /**
     * Creates a Circle shaped object
     * @param radius double radius of this Circle
     * @param X int X coordinate of the center of this Circle
     * @param Y int Y coordinate of the center of this Circle
     * @param Z int Z coordinate of the center of this Circle
     */
    public Circle(int X, int Y, int Z, double radius){
        super(X, Y, Z);
        this.radius = radius;
    }
    
    //Setters
    
    /**
     * Sets this Circle's radius
     * @param newRadius double new radius of the circle
     */
    public void setRadius(double newRadius){
        this.radius = newRadius;
    }   
   
    //Getters
    
    /**
     * Gets the radius of this Circle
     * @return double radius of Circle
     */
    public double getRadius(){
        return this.radius;
    }
   
    /**
     * Gets the area of this Circle
     * @return double area of this Circle
     */
    @Override
    public double area(){
        this.area = Math.PI * Math.pow(radius, 2);
        return this.area;
    }
  
    /**
     * Returns String format of this Circle
     * @return String written to include Shape coordinates, shape, and area
     */
    @Override
    public String toString(){
        return super.getCenter() + ": ( " + this.area() + " )";
    }
}
