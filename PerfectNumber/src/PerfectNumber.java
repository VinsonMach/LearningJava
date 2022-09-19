// Vinson Mach
// 09/19/2022
// In this program, we do a challenge where we check if a number is a perfect number or not

public class PerfectNumber
{
    // This method checks if the parameter is a perfect number and returns boolean
    public static boolean isPerfectNumber (int number)
    {
        int sum = 1;                                    // summation of all the factors of the parameter

        if (number < 1)
        {
            return false;                               // return false if the parameter is < 0
        }
        else
        {
            for (int i = 2; (i * i) <= number; i++)     // increment if i^2 <= parameter
            {
                if (number % i == 0)                    // if i is a factor of parameter
                {
                    if ((i * i) != number)              // if i^2 != parameter
                    {
                        sum += (i + (number / i));      // add factor to summation integer
                    }
                    else
                    {
                        sum += i;                       // add factor to summation integer
                    }
                }
            }
        }

        if (sum == number && number != 1)
        {
            return true;                                // return true if parameter is a perfect number
        }
        else
        {
            return false;                               // return false if parameter is a not a perfect number
        }
    }
}