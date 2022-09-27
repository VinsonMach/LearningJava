// Vinson Mach
// 09/27/2022
// In this program, we learn about composition and do a challenge

// This class is a template for the attributes of the dimensions of an objectSS
public class Dimensions
{
    private int width;                  // initialize object width
    private int height;                 // initialize object height
    private int depth;                  // initialize object depth

    // This constructor sets values when called with parameters
    public Dimensions(int width, int height, int depth)
    {
        this.width = width;             // set object width = parameter width
        this.height = height;           // set object height = parameter height
        this.depth = depth;             // set object depth = parameter depth
    }

    // This method gets dimension width
    public int getWidth()
    {
        return this.width;               // return dimension width
    }

    // This method gets dimension height
    public int getHeight()
    {
        return this.height;              // return dimension height
    }

    // This method gets dimension depth
    public int getDepth()
    {
        return this.depth;               // return dimension depth
    }
}