// Vinson Mach
// 09/23/2022
// In this program, we do a challenge where we calculate the cost of carpet

// This class is a template for the dimensions for a floor
public class Floor
{
    private double width;                       // initialize instance width
    private double length;                      // initialize instance length

    // This constructor sets dimension values when called with parameters
    public Floor(double width, double length)
    {
        if (width < 0 && length > 0)
        {
            this.width = 0;                     // set instance width = 0 if invalid width parameter
            this.length = length;               // set instance length = parameter length
        }
        else if (width > 0 && length < 0)
        {
            this.width = width;                 // set instance width = parameter width
            this.length = 0;                    // set instance length = 0 if invalid length parameter
        }
        else
        {
            this.width = width;                 // set instance width = parameter width
            this.length = length;               // set instance length = parameter length
        }
    }

    // This method calculates the area of the floor
    public double getArea()
    {
        return this.width * this.length;        // return calculated area
    }
}