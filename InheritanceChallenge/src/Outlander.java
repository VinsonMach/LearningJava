// Vinson Mach
// 09/26/2022
// In this program, we do an inheritance challenge

// This class is the child class that inherits from the Car class
public class Outlander extends Car
{
    private int roadServiceMonths;                      // initialize new road life object

    // This constructor sets values when called with parameters
    public Outlander(int roadServiceMonths)
    {
        // call car constructor and set values with parameters
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;     // set object road life = parameter road life
    }

    // This method sets vehicle speed with parameter
    public void accelerate(int rate)
    {
        int newVelocity = getCurrentVelocity() + rate;  // calculate vehicle velocity
        if (newVelocity == 0)
        {
            stop();                                     // call vehicle stop method
            changeGear(1);                      // call gear change method with gear
        }
        else if (newVelocity > 0 && newVelocity <= 10)
        {
            changeGear(1);                      // call gear change method with gear
        }
        else if (newVelocity > 10 && newVelocity <= 20)
        {
            changeGear(2);                      // call gear change method with gear
        }
        else if (newVelocity > 20 && newVelocity <= 30)
        {
            changeGear(3);                      // call gear change method with gear
        }
        else
        {
            changeGear(4);                      // call gear change method with gear
        }

        if (newVelocity > 0)
        {
            // call velocity change method with parameters
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
