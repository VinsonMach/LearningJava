// Vinson Mach
// 08/26/2022
// In this program, we do a challenge where we wake up if the dog is barking at odd hours

public class BarkingDog
{
    // This method returns a wakeUp boolean if the dog is barking at odd hours
    public static boolean shouldWakeUp (boolean barking, int hourOfDay)
    {
        if (hourOfDay < 0 || hourOfDay > 23)                    // if invalid hours of the day
        {
            return false;                                       // return false if invalid hours in the day
        }
        else if (barking && (hourOfDay < 8 || hourOfDay > 22))  // if dog is barking and the hours are odd
        {
            return true;                                        // return true wakeUp boolean
        }
        else
        {
            return false;                                       // return false wakeUp boolean in all other cases
        }
    }
}