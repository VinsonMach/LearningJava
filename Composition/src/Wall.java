// Vinson Mach
// 09/27/2022
// In this program, we learn about composition and do a challenge

// This class is a template for the attributes of a wall
public class Wall
{
    private String direction;               // initialize object direction

    // This constructor sets values when called with parameters
    public Wall(String direction)
    {
        this.direction = direction;         // set object direction = parameter direction
    }

    // This method gets wall direction
    public String getDirection()
    {
        return this.direction;              // return wall direction
    }
}