// Vinson Mach
// 09/20/2022
// In this program, we do a challenge where we get the largest prime of an integer and return it

public class LargestPrime
{
    // This method calculates the largest prime number of an integer
    public static int getLargestPrime (int number)
    {
        int prime = 0;                      // to hold largest prime number
        if (number <= 1)
        {
            return -1;                      // return -1 if integer is 0, 1, or negative
        }
        else
        {
            for (prime = 2; prime <= number; prime++)
            {
                if (number % prime == 0)    // if integer is divisible by prime
                {
                    number /= prime;        // preform division on integer with prime number
                    prime--;                // decrement prime number
                }
            }
        }
        return prime;                       // return prime number
    }
}