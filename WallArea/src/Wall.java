// Vinson Mach
// 09/22/2022
// In this program, we do a challenge where we calculate the area of a wall with height and width

public class Wall
{
    private double width;                   // initialize wall width
    private double height;                  // initialize wall height

    // This is an empty constructor
    public Wall() {
    }

    // This constructor sets object values when called with parameters
    public Wall(double width, double height)
    {
        if (width > 0 && height < 0)
        {
            this.width = width;                 // set class width = width
            this.height = 0;                    // set class height = 0 if height < 0
        }
        else if (width < 0 && height > 0)
        {
            this.width = 0;                     // set class width = 0 if width < 0
            this.height = height;               // set class width = width
        }
        else if (width < 0 && height < 0)
        {
            this.width = 0;                     // set class width = 0 if width < 0
            this.height = 0;                    // set class height = 0 if height < 0
        }
        else
        {
            this.width = width;                 // set class width = width
            this.height = height;               // set class width = width
        }
    }

    // This method calculates the area of the wall
    public double getArea()
    {
        return height * width;                  // calculate and return wall area
    }

    // This method gets wall width
    public double getWidth()
    {
        return width;                           // return wall width
    }

    // This method sets wall width
    public void setWidth(double width)
    {
        if (width < 0)
        {
            this.width = 0.0;                   // set class width = 0 if parameter width < 0
        }
        else
        {
            this.width = width;                 // set class width = parameter width
        }
    }

    // This method gets wall height
    public double getHeight()
    {
        return height;                          // return wall height
    }

    // This method sets wall height
    public void setHeight(double height)
    {
        if (height < 0)
        {
            this.height = 0.0;                   // set class height = 0 if parameter height < 0
        }
        else
        {
            this.height = height;               // set class height = parameter height
        }
    }
}