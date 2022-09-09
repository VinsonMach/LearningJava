// Vinson Mach
// 09/09/2022
// In this program, we do a challenge where we get the greatest common divisor of 2 numbers

public class GreatestCommonDivisor
{
    public static int getGreatestCommonDivisor (int first, int second)
    {
        int gcd = 0;                                // initialize greatest common divisor
        if (first < 10 || second < 10)
        {
            return -1;                              // return -1 if either parameters are < 10
        }
        else
        {
            for (int i = 1; ((i <= first) && (i <= second)); i++)
            {
                if ((first % i == 0) && (second % i == 0))
                {
                    gcd = i;                        // greatest common divisor = i
                }
            }
        }

        return gcd;                                 // return greatest common divisor
    }
}