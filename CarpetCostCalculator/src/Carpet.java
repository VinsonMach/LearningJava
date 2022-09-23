// Vinson Mach
// 09/23/2022
// In this program, we do a challenge where we calculate the cost of carpet

// This class is a template for the cost of a carpet
public class Carpet
{
    private double cost;            // initialize instance cost

    // This constructor sets cost values when called with parameters
    public Carpet(double cost)
    {
        if (cost < 0)
        {
            this.cost = 0;          // set instance cost = 0 if invalid parameters
        }
        else
        {
            this.cost = cost;       // set instance cost = parameter cost
        }
    }

    // This method gets the cost of carpet
    public double getCost()
    {
        return this.cost;           // return cost of carpet
    }
}