// Vinson Mach
// 09/26/2022
// In this program, we get the physical properties of a circle and cylinder

// This class is a template for the properties of a cylinder and inherits from the Circle class
public class Cylinder extends Circle
{
    private double height;                          // initialize new cylinder object

    // This constructor sets values when called with parameters
    public Cylinder(double radius, double height)
    {
        super(radius);                              // call parent constructor and get values

        if (height < 0)
        {
            this.height = 0;                        // set object height = 0 if height < 0
        }
        else
        {
            this.height = height;                   // set object height = parameter height
        }
    }

    // This method gets the cylinder height
    public double getHeight()
    {
        return height;                              // return cylinder height
    }

    // This method gets cylinder volume
    public double getVolume()
    {
        return (super.getArea() * this.height);     // return calculated volume of cylinder
    }
}
