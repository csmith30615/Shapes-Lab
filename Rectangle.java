package ShapesLab;

/**
 * Creates a Rectangle Object
 * @author csmit
 */
public class Rectangle extends Shape{
    //Initialize Global Variables
    private double base, height, area;
    
    //Constructors
    
    /**
     * Creates a Rectangle shaped object
     * @param base double base of this Rectangle
     * @param height double height of this Rectangle
     * @param X int X coordinate of the center of this Rectangle
     * @param Y int Y coordinate of the center of this Rectangle
     * @param Z int Z coordinate of the center of this Rectangle
     */
    public Rectangle(int X, int Y, int Z, double base, double height){
        super(X, Y, Z);
        this.base = base;
        this.height = height;
    }
    
    //Setters
    
    /**
     * Sets this Rectangle's base
     * @param newBase double new base for this Rectangle
     */
    public void setBase(double newBase){
        this.base = newBase;
    }
    
    /**
     * Sets this Rectangle's height
     * @param newHeight double new height for this Rectangle
     */
    public void setHeight(double newHeight){
        this.height = newHeight;
    }
    
    //Getters
    
    /**
     * Gets the base of this Rectangle
     * @return double base of this Rectangle
     */
    public double getBase(){
        return this.base;
    }
    
    /**
     * Gets the height of this Rectangle
     * @return double height of this Rectangle
     */
    public double getHeight(){
        return this.height;
    }

    /**
     * Gets the area of this Rectangle
     * @return double area of this Rectangle
     */
    @Override
    public double area(){
        this.area = this.base * this.height;
        return this.area;
    }
    
    /**
     * Returns String format of this Rectangle
     * @return String written to include Shape coordinates, shape, and area
     */
    @Override
    public String toString(){
        return super.getCenter() + ": [ " + this.area() + " ]";
    }
}
