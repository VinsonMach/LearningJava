// Vinson Mach
// 09/06/2022
// In this program, we do a challenge where we check if the 2 of the 3 parameters share the last digit

public class LastDigitChecker
{
    // This method checks if 2  of the 3 parameters share the last digit
    public static boolean hasSameLastDigit (int x, int y, int z)
    {
        int modX = x % 10;          // get last digit of x
        int modY = y % 10;          // get last digit of y
        int modZ = z % 10;          // get last digit of z
        if ((isValid(x) == false) || (isValid(y) == false) || (isValid(z) == false))
        {
            return false;           // return false if any of the parameters are out of bounds
        }
        else if ((modX == modY) || (modX == modZ) || (modY == modZ))
        {
            return true;            // return true if 2 of the 3 parameters share the last digit
        }
        else
        {
            return false;           // return false under all other conditions
        }
    }

    // This method checks if the parameter is within the bounds of 10 - 1000
    public static boolean isValid (int x)
    {
        if ((x >= 10) && (x <= 1000))
        {
            return true;            // return true if parameter is within range
        }
        else
        {
            return false;           // return false if parameter is out of bounds
        }
    }
}