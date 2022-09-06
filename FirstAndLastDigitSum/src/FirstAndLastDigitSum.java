// Vinson Mach
// 09/05/2022
// In this program, we do a challenge where we add the first and last digits of a number

public class FirstAndLastDigitSum
{
    public static int sumFirstAndLastDigit (int number)
    {
        int last = 0;                               // initialize last digit holder
        if (number >= 0)
        {
            last = number % 10;                     // get last digit of number
            while(number > 9)
            {
                number /= 10;                       // get first digit of number
            }
            return (last + number);                 // return sum of first and last digit
        }
        else
        {
            return -1;                              // return -1 if number is negative
        }
    }
}