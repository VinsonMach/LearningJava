// Vinson Mach
// 08/26/2022
// In this program, we do a challenge where we print converted kilobytes to megabytes and the remainder

public class MegaBytesConverter
{
    // This method displays the converted kilobytes to megabytes and the remainder
    public static void printMegaBytesAndKiloBytes (int kiloBytes)
    {
        if (kiloBytes < 0)
        {
            System.out.println("Invalid Value");                // print error statement
        }
        else
        {
            int kiloToMega = kiloBytes / 1024;                  // convert kilobytes to megabytes
            int remainingKB = kiloBytes % 1024;                 // get the remainding kilobytes after conversion

            // print converted value statement
            System.out.println(kiloBytes + " KB = " + kiloToMega + " MB and " + remainingKB + " KB");
        }
    }

}