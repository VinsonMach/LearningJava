// Vinson Mach
// 09/09/2022
// In this program, we do a challenge where we print all factors of a parameter

public class AllFactors
{
    // This method prints all the factors of a number
    public static void printFactors (int number)
    {
        if (number < 1)
        {
            System.out.println("Invalid Value");        // print error statement if number < 1
        }
        else
        {
            for (int i = 1; i <= number; i++)
            {
                if (number % i == 0)                    // if i is a factor
                {
                    System.out.print(i + " ");          // print all factors of the number
                }
            }
        }
    }
}