// Vinson Mach
// 08/30/2022
// In this program, we do a challenge where we check if 3 parameters are different, equal or neither

public class IntEqualityPrinter
{
    // This method calculates if any parameters are different, equal or neither
    public static void printEqual(int one, int two, int three)
    {
        if ((one < 0) || (two < 0) || (three < 0))
        {
            System.out.println("Invalid Value");                            // print error statement if values are out of bounds
        }
        else if ((one != two) && (two != three) && (three != one))
        {
            System.out.println("All numbers are different");                // print different statement if values dont match
        }
        else if ((one == two) && (two == three) && (three == one))
        {
            System.out.println("All numbers are equal");                    // print equal statement if all values match
        }
        else
        {
            System.out.println("Neither all are equal or different");       // print neither statement
        }
    }
}