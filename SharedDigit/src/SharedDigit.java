// Vinson Mach
// 09/05/2022
// In this program, we do a challenge where we check if 2 parameters share a digit

public class SharedDigit
{
    // This method checks if either parameters share a digit
    public static boolean hasSharedDigit (int x, int y)
    {
        int modX = x % 10;              // get second digit of x
        int modY = y % 10;              // get second digit of y
        int divX = x / 10;              // get first digit of x
        int divY = y / 10;              // get first digit of y

        if (!((x >= 10) && (x <= 99) && (y >= 10) && (y <= 99)))
        {
            return false;           // return false if either parameters are out of bounds
        }
        else if ((x == y) || (modX == modY) || (divX == divY) || (divX == modY) || (modX == divY))
        {
            return true;            // return true if parameters share a digit
        }
        else
        {
            return false;           // return false in any other condition
        }
    }
}