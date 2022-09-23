// Vinson Mach
// 09/23/2022
// In this program, we do a challenge where we represent a point in a 2D space

// This class is a template for the values of a point in a 2D plane
public class Point
{
    private int x;                  // initialize class instance x
    private int y;                  // initialize class instance y

    // This method sets default x & y values when the constructor is called without parameters
    public Point()
    {
        this(0, 0);             // initialize default x & y values
    }

    // This method sets instance values when called with parameters
    public Point(int x, int y)
    {
        this.x = x;                 // set instance x = parameter x
        this.y = y;                 // set instance y = parameter y
    }

    // This method calculates distance between a point and the origin
    public double distance()
    {
        // return calculated distance between a point and the origin
        return Math.sqrt((this.x * this.x) + (this.y * this.y));
    }

    // This method calculates distance between 2 points
    public double distance(int x, int y)
    {
        // return calculated distance between 2 points
        return Math.sqrt(((this.x - x) * (this.x - x)) + ((this.y - y) * (this.y - y)));
    }

    // This method calculates distance between 2 points
    public double distance(Point p2)
    {
        // return calculated distance between 2 points
        return Math.sqrt(((this.x - p2.x) * (this.x - p2.x)) + ((this.y - p2.y) * (this.y - p2.y)));
    }

    // This method gets x value of a point
    public int getX()
    {
        return x;                   // return x value of a point
    }

    // This method sets x value of a point
    public void setX(int x)
    {
        this.x = x;                 // set instance x = parameter x
    }

    // This method gets y value of a point
    public int getY()
    {
        return y;                   // return y value of a point
    }

    // This method sets y value of a point
    public void setY(int y)
    {
        this.y = y;                 // set instance y = parameter y
    }
}
