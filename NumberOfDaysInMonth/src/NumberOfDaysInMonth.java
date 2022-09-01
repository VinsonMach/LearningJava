// Vinson Mach
// 08/31/2022
// In this program, we do a challenge where we check if a year is a leap year and how many days a month has

public class NumberOfDaysInMonth
{
    // This method checks if a year is a leap year
    public static boolean isLeapYear (int year)
    {
        if(year < 1 && year > 9999)
        {
            return false;                                   // return false if year is out of bounds
        }
        else if((year % 4 == 0 && year % 100 != 0) && (year >= 1 && year <= 9999) || year % 400 == 0 && (year >= 1 && year <= 9999))
        {
            return true;                                    // return true if year is leap year
        }
        else
        {
            return false;                                   // return false if year isnt a leap year
        }
    }

    // This method gets the number of days in a month depending if its a leap year or not
    public static int getDaysInMonth (int month, int year)
    {
        int days = 0;                                       // days in the month integer
        if ((month < 1) || (month > 12) || (year < 0) || (year > 9999))
        {
            return -1;                                      // return -1 if month or year is out of bound
        }
        else
        {
            switch (month)
            {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    days =  31;                             // 31 days in the month
                    break;

                case 4: case 6: case 9: case 11:
                    days =  30;                             // 30 days in the month
                    break;

                case 2:
                    if (isLeapYear(year))
                    {
                        days = 29;                          // 29 days in the year if its a leap year
                    }
                    else
                    {
                        days = 28;                          // 28 days in the year
                    }
                    break;

                default:
                    days = -1;                              // invalid number of days in the month
                    break;
            }
        }
        return days;                                        // return the number of days in the month
    }
}