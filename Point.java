package ShapesLab;

/**
 * Creates a 3D Point Object
 * @author csmit
 */
public class Point {
    //Initialize Global Variables
    private int X, Y, Z;
    
    //Constructors
    
    /**
     * Creates a point object
     * @param X int X coordinate (between 0 and 500)
     * @param Y int Y coordinate (between 0 and 500)
     * @param Z int Z coordinate (between 0 and 500)
     */
    public Point(int X, int Y, int Z){
        //Ensure X is between 0 and 500
        if(X <= 0){
            this.X = 0;
        }else if(X >= 500){
            this.X = 500;
        }else{
            this.X = X;
        }
            
        //Ensure Y is between 0 and 500
        if(Y <= 0){
            this.Y = 0;
        }else if(Y >= 500){
            this.Y = 500;
        }else{
            this.Y = Y;
        }
        
        //Ensures Z is between 0 and 500
        if(Z <= 0){
            this.Z = 0;
        }else if(Z >= 500){
            this.Z = 500;
        }else{
            this.Z = Z;
        }
    }
    
    //Getters
    
    /**
     * Gets the X coordinate of this Point
     * @return X coordinate of this Point
     */
    public int getX(){
        return this.X;
    }
    
    /**
     * Gets the Y coordinate of this Point
     * @return Y coordinate of this Point
     */
    public int getY(){
        return this.Y;
    }
    
    /**
     * Gets the Z coordinate of this Point
     * @return Z coordinate of this Point
     */
    public int getZ(){
        return this.Z;
    }
    
    /**
     * Gets the coordinates of this Point
     * @return String coordinates of this Point (Written as (X, Y, Z))
     */
    public String getCoordinates(){
        return "(" + this.X + ", " + this.Y + ", " + this.Z + ")";
    }
}
