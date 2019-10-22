package ShapesLab;

/**
 * Creates a Triangle object
 * @author csmit
 */
public class Triangle extends Shape{
    //Initialize Global Variabels
    private double base, height, area;
    
    //Constructors
    
    /**
     * Creates a Triangle shaped object
     * @param base double base of this Triangle
     * @param height double height of this Triangle
     * @param X int X coordinate of this Triangle
     * @param Y int Y coordinate of this Triangle
     * @param Z int Z coordinate of this Triangle
     */
    public Triangle(int X, int Y, int Z, double base, double height){
        super(X, Y, Z);
        this.base = base;
        this.height = height;
    }
    
    //Setters
    
    /**
     * Sets this Triangle's base
     * @param newBase double new base value of this Triangle
     */
    public void setBase(double newBase){
        this.base = newBase;
    }
    
    /**
     * Sets this Triangle's height
     * @param newHeight double new height value of this Triangle
     */
    public void setHeight(double newHeight){
        this.height = newHeight;
    }
    
    //Getters
    
    /**
     * Gets the base of this Triangle
     * @return double base of this Triangle
     */
    public double getBase(){
        return this.base;
    }
    
    /**
     * Gets the height of this Triangle
     * @return double height of this Triangle
     */
    public double getHeight(){
        return this.height;
    }

    /**
     * Gets the area of this Triangle
     * @return double area of this Triangle
     */
    @Override
    public double area(){
        this.area = 0.5 * base * height;
        return this.area;
    }

    /**
     * Returns String format of this Triangle
     * @return String written to include Shape coordinates, shape, and area
     */
    @Override
    public String toString(){
        return super.getCenter() + ": / " + this.area() + " \\";
    }
}
