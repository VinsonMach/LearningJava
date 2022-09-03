// Vinson Mach
// 09/02/2022
// In this program, we learn about for statements (for loops) and do a challenge

public class Main
{
    public static void main(String[] args)
    {
        // print interest statement with calculated interest
        System.out.println("10,000 at 2% interest is " + calculateInterest(10000.0, 2.0));

        for (int i = 0; i < 5; i++)
        {
            System.out.println("Loop " + i + " hello");                             // print loop i
        }

        System.out.println("-----------------------------------------------");      // print spacer

        for (int i = 2; i < 9; i++)
        {
            // print interest statement with incrementing calculated i interest
            System.out.println("10,000 at " + i + "% interest is " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("-----------------------------------------------");      // print spacer

        for (int i = 8; i >= 2; i--)
        {
            // print interest statement with decrementing calculated i interest
            System.out.println("10,000 at " + i + "% interest is " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        int primeCounter = 0;                                                       // prime number counter
        for (int i = 10; i < 49; i++)
        {
            if(isPrime(i))                                                          // if i is a prime number
            {
                primeCounter++;                                                     // increment prime number counter
                System.out.println(i + " is prime");                                // print prime number
                if(primeCounter == 10)                                              // if there are 10 prime numbers counted
                {
                    System.out.println("Exiting for loop");                         // print exit loop statement
                    break;                                                          // break the loop
                }
            }
        }
    }

    // This method checks a number to see if its prime
    public static boolean isPrime (int n)
    {
        if (n == 1)
        {
            return false;                                                           // return false if num is 1
        }

        for (int i = 2; i <= n/2; i++)
        {
            if (n % i == 0)
            {
                return false;                                                       // if n is not divisible by itself return false
            }
        }
        return true;                                                                // return true if n is a prime number
    }

    // This method calculates interest and returns it
    public static double calculateInterest (double amount, double interestRate)
    {
        return (amount * (interestRate / 100));                                     // return calculated interest
    }
}