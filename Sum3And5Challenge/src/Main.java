// Vinson Mach
// 09/03/2022
// In this program, we do a challenge where we sum all of the numbers from 1 - 1000
// that are divisible by 3 and 5

public class Main
{
    public static void main(String[] args)
    {
        int count = 0;                                          // num divisible by 3 and 5 counter
        int sum = 0;                                            // sum of numbers divisible by 3 and 5

        for (int i = 1; i <= 1000; i++)
        {
            if ((i % 3 == 0) && (i % 5 == 0))                   // if num is divisible by 3 and 5
            {
                sum += i;                                       // add num to sum
                count++;                                        // iterate counter
                System.out.println("Found number = " + i);      // print number
            }

            if (count == 5)
            {
                break;                                          // break loop if counter iterated to 5
            }
        }

        System.out.println("Sum = " + sum);                     // print the sum of all numbers divisible by 3 and 5
    }
}