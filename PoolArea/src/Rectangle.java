// Vinson Mach
// 09/26/2022
// In this program, we do a challenge where we get the volume of a pool

// This class is the base template for rectangles and will be inherited by other classes
public class Rectangle
{
    private double width;                       // initialize new object width
    private double length;                      // initialize new object length

    // This constructor sets values when called with parameters
    public Rectangle(double width, double length)
    {
        if (width < 0 && length > 0)
        {
            this.width = 0;                     // set object width = 0 if parameter < 0
            this.length = length;               // set object length = parameter length
        }
        else if (width > 0 && length < 0)
        {
            this.width = width;                 // set object width = parameter width
            this.length = 0;                    // set object length = 0 if parameter < 0
        }
        else if (width < 0 && length < 0)
        {
            this.width = 0;                     // set object width = 0 if parameter < 0
            this.length = 0;                    // set object length = 0 if parameter < 0
        }
        else
        {
            this.width = width;                 // set object width = parameter width
            this.length = length;               // set object length = parameter length
        }
    }

    // This method gets rectangle width
    public double getWidth()
    {
        return this.width;                      // return rectangle width
    }

    // This method gets rectangle length
    public double getLength()
    {
        return this.length;                     // return rectangle length
    }

    // This method calculates area of rectangle
    public double getArea()
    {
        return (this.width * this.length);      // return calculated area of rectangle
    }
}