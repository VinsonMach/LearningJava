// Vinson Mach
// 08/30/2022
// In this program, we do a challenge where we check if a cat is playing

public class PlayingCat
{
    // This method checks if a cat is playing depending on the parameter conditions
    public static boolean isCatPlaying (boolean summer, int temperature)
    {
        if ((temperature > 24) && (temperature < 36))
        {
            return true;                                                // return true if temp is > 24 and < 36
        }
        else if (summer && ((temperature > 24) && (temperature < 46)))
        {
            return true;                                                // return true if its summer and temp > 24 and < 46
        }
        else
        {
            return false;                                               // return false under all other conditions
        }
    }
}