// Vinson Mach
// 08/27/2022
// In this program, we do a challenge where we check 3 variables to see if they are teens

public class TeenNumberChecker
{
    // This method checks if one of the 3 parameters are a teen number
    public static boolean hasTeen (int one, int two, int three)
    {
        if (one >= 13 && one <= 19)             // checks if first parameter is a teen number
        {
            return true;                        // return true if first parameter is a teen number
        }
        else if (two >= 13 && two <= 19)        // checks if second parameter is a teen number
        {
            return true;                        // return true if second parameter is a teen number
        }
        else if (three >= 13 && three <= 19)    // checks if third parameter is a teen number
        {
            return true;                        // return true if third parameter is a teen number
        }
        else
        {
            return false;                       // return false if none of the parameters are teen numbers
        }
    }

    // This method checks if the parameter is a teen number
    public static boolean isTeen (int one)
    {
        if (one >= 13 && one <= 19)             // checks if parameter is a teen number
        {
            return true;                        // return true if parameter is a teen number
        }
        else
        {
            return false;                       // return false if parameter is not a teen number
        }
    }
}