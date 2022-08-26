// Vinson Mach
// 08/26/2022
// In this program, we do a challenge where we convert kmh to mph

public class SpeedConverter {

    // This method converts kmh to mph and returns a rounded value
    public static long toMilesPerHour(double kilometersPerHour)
    {
        if (kilometersPerHour < 0)
        {
            return -1;                                                                  // return invalid
        }

        return Math.round(kilometersPerHour / 1.609);                                   // return converted value
    }

    // This method displays the converted kmh to mph value
    public static void printConversion(double kilometersPerHour)
    {
        if (kilometersPerHour < 0)
        {
            System.out.println("Invalid Value");                                        // print invalid value statement
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);                      // mph variable calls conversion method
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");// print converted value statement
        }
    }
}