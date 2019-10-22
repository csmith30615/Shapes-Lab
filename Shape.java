package ShapesLab;

/**
 * Parent class for the other shapes
 * @author csmit
 */
public abstract class Shape {
    //Initialize Global Variables
    private Point center;
    
    //Constructors
    /**
     * Creates a Shape object, superclass for other shapes
     * @param X int X coordinate of the center of the shape
     * @param Y int Y coordinate of the center of the shape
     * @param Z int Z coordinate of the center of the shape
     */
    public Shape(int X, int Y, int Z){
        this.center = new Point(X, Y, Z);
    }
    
    //Setters
    
    /**
     * Sets this Shape's Point center
     * @param cent Point center of this Shape
     */
    public void setCenter(Point cent){
        this.center = cent;
    }
    
    //Getters
    
        
    /**
     * Gets the X coordinate of Point center of this Shape
     * @return int X coordinate of the center of this Shape
     */
    public int getX(){
        return this.center.getX();
    }
    
    /**
     * Gets the Y coordinate of Point center of this Shape
     * @return int Y coordinate of the center of this Shape
     */
    public int getY(){
        return this.center.getY();
    }
    
    /**
     * Gets the Z coordinate of Point center of this Shape
     * @return int Z coordinate of the center of this Shape
     */
    public int getZ(){
        return this.center.getZ();
    }
    
    /**
     * Gets the coordinates of the center of this Shape
     * @return String coordinates of this Shape's center (Written as (X, Y, Z))
     */
    public String getCenter(){
        return center.getCoordinates();
    }
    
    //Abstract methods
    
    public abstract double area();
    public abstract String toString();
}
