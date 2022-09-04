// Vinson Mach
// 09/03/2022
// In this program, we do a challenge where we add all of the odd numbers from a range

public class SumOdd
{
    // This method checks to see if the parameter is an odd number
    public static boolean isOdd (int number)
    {
        if (!(number > 0))
        {
            return false;                                   // return false if number isnt greater than 0
        }
        else if (number % 2 == 1)
        {
            return true;                                    // return true if number is an odd number
        }
        else
        {
            return false;                                   // return false under all other conditions
        }
    }

    // This method adds all of the odd numbers from a range
    public static int sumOdd (int start, int end)
    {
        int sum = 0;                                        // sum of all odd numbers
        if ((start > 0) && (end > 0) && (end >= start))     // if start and end are greater than 0 and end greater than start
        {
            for (int i = start; i <= end; i++)              // iterate through range of start to end
            {
                if (isOdd(i))                               // check if number is odd
                {
                    sum += i;                               // add number to sum if number is odd
                }
            }
        }
        else
        {
            return -1;                                      // return -1 if invalid input
        }
        return sum;                                         // return sum of odd numbers
    }
}