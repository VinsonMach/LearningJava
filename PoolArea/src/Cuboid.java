// Vinson Mach
// 09/26/2022
// In this program, we do a challenge where we get the volume of a pool

// This class is the template for cuboids and inherits from the Rectangle class
public class Cuboid extends Rectangle
{
    private double height;                          // initialize new object height

    // This constructor sets values when called with parameters
    public Cuboid(double width, double length, double height)
    {
        super(width, length);                       // call parent constructor and send parameters
        if (height < 0)
        {
            this.height = 0;                        // set object height = 0 if parameter < 0
        }
        else
        {
            this.height = height;                   // set object height = parameter height
        }
    }

    // This method gets cuboid height
    public double getHeight()
    {
        return height;                              // return cuboid height
    }

    // This method calculates cuboid volume
    public double getVolume()
    {
        return (super.getArea() * this.height);     // return calculated volume of cuboid
    }
}