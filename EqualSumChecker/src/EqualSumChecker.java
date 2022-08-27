// Vinson Mach
// 08/27/2022
// In this program, we do a challenge where we check if values 1 and 2 equal value 3

public class EqualSumChecker
{
    // This method checks if variables 1 and 2 are equal to variable 3
    public static boolean hasEqualSum (int one, int two, int three)
    {
        if ((one + two) == three)   // adding variables 1 and 2 to see if they equal variable 3
        {
            return true;            // variables 1 and 2 are equal to variable 3
        }
        else
        {
            return false;           // variables 1 and 2 dont equal variable 3
        }
    }
}