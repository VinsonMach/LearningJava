// Vinson Mach
// 09/05/2022
// In this program, we do a challenge where we get the sum of all even digits in the number

public class EvenDigitSum
{
    // This method gets the sum of all even digits in the number
    public static int getEvenDigitSum (int number)
    {
        if (number < 0)
        {
            return -1;                  // return -1 if the number is negative
        }

        int sum = 0;                    // initialize the sum of all even digits in the number
        int even = 0;                   // initialize even digit
        while (number > 0)
        {
            even = number % 10;         // calculate even number
            if (even % 2 == 0)          // if digit is even
            {
                sum += even;            // add even digit to sum of all even digits
            }
            number /= 10;               // remove least sig digit
        }
        return sum;                     // return sum of all even digits
    }
}