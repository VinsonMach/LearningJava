// Vinson Mach
// 08/27/2022
// In this program, we do a challenge where we compare decimals up to 3 places for similarity

public class DecimalComparator
{
    // This method compares 2 doubles to see if they match up to 3 decimals
    public static boolean areEqualByThreeDecimalPlaces (double valueOne, double valueTwo)
    {
        if ((int) (valueOne * 1000) == (int) (valueTwo * 1000)) // compares if decimals up to 3 places match
        {
            return true;    // decimals match
        }
        else
        {
            return false;   // decimals dont match
        }
    }
}