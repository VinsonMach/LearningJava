// Vinson Mach
// 08/30/2022
// In this program, we do a challenge where we convert minutes to years and days

public class MinutesToYearsAndDaysCalculator
{
    // This method calculates years and days from minutes
    public static void printYearsAndDays (long minutes)
    {
        if(minutes < 0)
        {
            System.out.println("Invalid Value");                            // print error statement
        }
        else
        {
            long year = (minutes / (60 * 24 * 365));                        // calculate years from minutes
            long remainingDays = ((minutes / (24 * 60)) % 365);             // calculate days from minutes

            // print conversion statement
            System.out.println(minutes + " min = " + year + " y and " + remainingDays + " d");
        }
    }
}
