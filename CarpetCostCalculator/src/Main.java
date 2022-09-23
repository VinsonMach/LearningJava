// Vinson Mach
// 09/23/2022
// In this program, we do a challenge where we calculate the cost of carpet

public class Main
{
    public static void main(String[] args)
    {
        Carpet carpet = new Carpet(3.5);                        // initialize and call new carpet with parameters
        Floor floor = new Floor(2.75, 4.0);             // initialize and call new floor with parameters
        Calculator calculator = new Calculator(floor, carpet);      // initialize and call new calculator with parameters
        System.out.println("Total = " + calculator.getTotalCost()); // call calculator method and return results
        carpet = new Carpet(1.5);                               // initialize and call new carpet with parameters
        floor = new Floor(5.4, 4.5);                    // initialize and call new floor with parameters
        calculator = new Calculator(floor, carpet);                 // initialize and call new calculator with parameters
        System.out.println("Total = " + calculator.getTotalCost()); // call calculator method and return results
    }
}