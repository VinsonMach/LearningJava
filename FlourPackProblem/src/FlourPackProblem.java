// Vinson Mach
// 09/20/2022
// In this program, we do a challenge where we check to see if the total kilo count meets the kilo goal

public class FlourPackProblem
{
    // This method checks to see if the total kilos of the big and small bags meet the kilo goal
    public static boolean canPack (int bigCount, int smallCount, int goal)
    {
        int totalCount = (bigCount * 5) + smallCount;                       // total kilo count

        if (bigCount < 0 || smallCount < 0 || goal < 0 || totalCount < goal)
        {
            return false;                                                   // return false if any parameter is < 0
        }

        bigCount *= 5;                                                      // multiply by 5 because each big bag weighs 5 kilos
        int maxBigBags = goal / 5;                                          // calculate maximum number of big bags
        int minBigBags = goal % 5;                                          // calculate minimum number of big bags

        if (bigCount > 0)
        {
            return (bigCount >= maxBigBags && smallCount >= minBigBags);    // return boolean of big bag >= max bag and small bag and min bag
        }

        return (smallCount >= goal);                                        // return boolean value of small bag >= kilo goal
    }
}