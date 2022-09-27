// Vinson Mach
// 09/27/2022
// In this program, we learn about composition and do a challenge

// This class is a template for the attributes of the resolution of an object
public class Resolution
{
    private int width;              // initialize object width
    private int height;             // initialize object height

    // This constructor sets values when called with parameters
    public Resolution(int width, int height)
    {
        this.width = width;         // set object width = parameter width
        this.height = height;       // set object height = parameter height
    }

    // This method gets resolution width
    public int getWidth()
    {
        return this.width;          // return resolution width
    }

    // This method gets resolution height
    public int getHeight()
    {
        return this.height;          // return resolution height
    }
}