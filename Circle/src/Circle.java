// Vinson Mach
// 09/26/2022
// In this program, we get the physical properties of a circle and cylinder

// This class is a base template for the properties of a circle and will be inherited from
public class Circle
{
    private double radius;                              // initialize new radius object

    // This constructor sets the values of the radius when called with parameters
    public Circle(double radius)
    {
        if (radius < 0)
        {
            this.radius = 0;                            // set object radius = 0 if parameter < 0
        }
        else
        {
            this.radius = radius;                       // set object radius = parameter radius
        }
    }

    // This method gets the radius of the circle
    public double getRadius()
    {
        return this.radius;                             // return circle radius
    }

    // This method gets the area of the circle
    public double getArea()
    {
        return ((this.radius * this.radius) * Math.PI); // return calculated area of circle
    }
}
