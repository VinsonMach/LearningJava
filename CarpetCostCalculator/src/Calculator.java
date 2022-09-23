// Vinson Mach
// 09/23/2022
// In this program, we do a challenge where we calculate the cost of carpet

// This class calculates the total cost of carpet
public class Calculator
{
    private Floor floor;                                    // initialize instance floor
    private Carpet carpet;                                  // initialize instance carpet

    // This constructor sets values when called with parameters
    public Calculator(Floor floor, Carpet carpet)
    {
        this.floor = floor;                                 // set instance floor = parameter floor
        this.carpet = carpet;                               // set instance carpet = parameter carpet
    }

    // This method calculates the cost of carpet
    public double getTotalCost()
    {
        return floor.getArea() * carpet.getCost();          // return calculated cost of carpet
    }
}
