// Vinson Mach
// 08/26/2022
// In this program, we do a challenge where we check if a year is a leap year

public class LeapYear
{
    // This method calculates if a parameter value is a leap year and returns a boolean value
    public static boolean isLeapYear (int year)
    {
        if(year < 1 && year > 9999)
        {
            return false;           // year value is out of bounds
        }
        else if((year % 4 == 0 && year % 100 != 0) && (year >= 1 && year <= 9999) || year % 400 == 0 && (year >= 1 && year <= 9999))
        {
            return true;            // year is a leap year
        }
        else
        {
            return false;           // year is not a leap year
        }
    }
}