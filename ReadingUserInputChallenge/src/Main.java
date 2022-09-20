// Vinson Mach
// 09/20/2022
// In this program, we do a challenge where we get the sum of 10 user inputted integers

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);                   // initialize scanner

        int counter = 0;                                            // number counter
        int sum = 0;                                                // summation of user inputted numbers

        while(counter < 10)
        {
            int order = counter + 1;                                // initialize number order
            System.out.println("Enter number #" + order + ": ");    // ask user for number

            boolean isAnInt = scanner.hasNextInt();                 // integer validation boolean
            if (isAnInt)
            {
                int number = scanner.nextInt();                     // take user input
                counter++;                                          // increment counter
                sum += number;                                      // add user input to sum value
            }
            else
            {
                System.out.println("Error: Invalid Number");        // print error statement
            }
            scanner.nextLine();                                     // handles end of line --> enter key
        }

        System.out.println("Sum = " + sum);                         // print total sum of user's inputted numbers
        scanner.close();                                            // close scanner to free memory
    }
}