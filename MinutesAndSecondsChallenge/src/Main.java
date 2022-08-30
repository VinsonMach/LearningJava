// Vinson Mach
// 08/30/2022
// In this program, we do a challenge where we convert minutes and seconds to hours, min, sec

public class Main
{
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";        // error statement

    public static void main(String[] args)
    {
        System.out.println(getDurationString(65, 45));          // call conversion method and send min and seconds
        System.out.println(getDurationString(3945L));                  // call conversion method and send seconds
    }

    // This method converts min and sec to formatted hour, min, and sec
    private static String getDurationString (long minutes, long seconds)
    {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59))                   // if values are out of bounds
        {
            return INVALID_VALUE_MESSAGE;                                       // send error statement
        }

        long hours = minutes / 60;                                              // convert minutes to hours
        long remainingMin = minutes % 60;                                       // calculate remaining minutes

        String hoursString = hours + "h ";                                      // create hour statement
        if(hours < 10)
        {
            hoursString = "0" + hoursString;                                    // add leading zero
        }

        String minString = remainingMin + "m ";                                 // create minute statement
        if(remainingMin < 10)
        {
            minString = "0" + minString;                                        // add leading zero
        }

        String secString = seconds + "s";                                       // create second statement
        if(seconds < 10)
        {
            secString = "0" + secString;                                        // add leading zero
        }

        return (hoursString + minString + secString);                           // return converted values
    }

    // This method converts seconds to min and sec
    private static String getDurationString (long seconds)
    {
        if (seconds < 0)                                                        // if values are out of bounds
        {
            return INVALID_VALUE_MESSAGE;                                       // return error statement
        }

        long minutes = seconds / 60;                                            // calculate minutes
        long remainingSec = seconds % 60;                                       // calculate remaining seconds
        return (getDurationString(minutes, remainingSec));                      // call other conversion method and send min and sec
    }
}