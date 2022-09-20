// Vinson Mach
// 09/20/2022
// In this program, we do a challenge where we ask the user for integers and calculate the sum and average

import java.util.Scanner;

public class InputCalculator
{
    // This method asks the user for integers, calculates the sum and average, then prints the results
    public static void inputThenPrintSumAndAverage()
    {
        Scanner scanner = new Scanner(System.in);                   // initializes scanner

        int sum = 0;                                                // initialize summation of user's input
        int count = 0;                                              // initialize user input counter
        long avg = 0;                                               // initialize average of user's input

        while (true)
        {
            System.out.println("Enter Number: ");                   // ask user for input
            boolean isNextInt = scanner.hasNextInt();               // integer validation boolean
            if (isNextInt)
            {
                int number = scanner.nextInt();                     // get user input
                count++;                                            // increment user input counter
                sum += number;                                      // add number to summation integer
            }
            else
            {
                break;                                              // break loop
            }
        }
        scanner.nextLine();                                         // handles end of line --> enter key

        if (count == 0)
        {
            System.out.println("SUM = 0 AVG = 0");                  // print no input statement
        }
        else
        {
            avg = Math.round((double) sum / (double) count);        // calculate user average
            System.out.println("SUM = " + sum + " AVG = " + avg);   // print calculated values
        }

        scanner.close();                                            // close scanner to free up memory
    }
}