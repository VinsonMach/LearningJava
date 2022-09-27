// Vinson Mach
// 09/27/2022
// In this program, we learn about composition and do a challenge

// This class is a template for the attributes of a ceiling
public class Ceiling
{
    private int height;                     // initialize object height
    private int paintedColor;               // initialize object paintedColor

    // This constructor sets values when called with parameters
    public Ceiling(int height, int paintedColor)
    {
        this.height = height;               // set object height = parameter height
        this.paintedColor = paintedColor;   // set object paint color = parameter paint color
    }

    // This method gets ceiling height
    public int getHeight()
    {
        return this.height;                 // return ceiling height
    }

    // This method gets ceiling color
    public int getPaintedColor()
    {
        return this.paintedColor;           // return ceiling color
    }
}