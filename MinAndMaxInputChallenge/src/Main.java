// Vinson Mach
// 09/20/2022
// In this program, we do a challenge where we ask the user for integers and find the minimum and maximum integers

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);                   // initialize scanner

        int min = Integer.MIN_VALUE;                                // initialize min value
        int max = Integer.MAX_VALUE;                                // initialize max value

        while (true)
        {
            System.out.println("Enter Number: ");                   // ask user for input
            boolean isAnInt = scanner.hasNextInt();                 // integer validation boolean

            if (isAnInt)
            {
                int number = scanner.nextInt();                     // take user input

                if (number > max)
                {
                    max = number;                                   // update max number
                }

                if (number < min)
                {
                    min = number;                                   // update min number
                }
            }
            else
            {
                break;                                              // break loop
            }
            scanner.nextLine();                                     // handles end of line --> enter key
        }

        System.out.println("Min = " + min + ", Max = " + max);      // print min and max statement
        scanner.close();                                            // close scanner to free up memory
    }
}