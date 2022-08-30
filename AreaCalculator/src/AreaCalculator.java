// Vinson Mach
// 08/30/2022
// In this program, we do a challenge where we calculate area using overloaded methods

public class AreaCalculator
{
    // This method calculates area with the radius of a shape
    public static double area(double radius)
    {
        if (radius < 0)
        {
            return -1;                                      // return -1 if radius is negative
        }
        else
        {
            return ((radius * radius) * Math.PI);           // return calculated area
        }
    }

    // This method calculates area with the sides of a shape
    public static double area(double x, double y)
    {
        if(x < 0 || y < 0)
        {
            return -1;                                      // return -1 if either parameter is negative
        }
        else
        {
            return x * y;                                   // return calculated area
        }
    }
}