// Vinson Mach
// 10/10/2022
// In this program, we do a challenge where we get the minimum element in an array

import java.util.Scanner;

public class Main
{
    private static Scanner scanner = new Scanner(System.in);    // initialize scanner variable

    public static void main(String[] args)
    {
        System.out.println("Enter count: ");                    // print enter count statement
        int count = scanner.nextInt();                          // take user input
        scanner.nextLine();                                     // clear next line

        int[] returnedArray = readIntegers(count);              // initialize new array and call method with parameter
        int returnedMin = findMin(returnedArray);               // initialize new int and call method with parameter

        System.out.println("Min = " + returnedMin);             // print min element statement
    }

    // This method reads user input and stores it in an array
    private static int[] readIntegers(int count)
    {
        int[] array = new int[count];                           // initialize new int array with array size

        for (int i = 0; i < array.length; i++)
        {
            System.out.println("Enter a number: ");             // print enter number statement
            int number = scanner.nextInt();                     // take user input
            scanner.nextLine();                                 // clear next line
            array[i] = number;                                  // store user input in element i in array
        }

        return array;                                           // return array
    }

    // This method calculates minimum element in array
    private static int findMin (int[] array)
    {
        int min = Integer.MAX_VALUE;                            // initialize int variable with max integer value

        for (int i = 0; i < array.length; i++)
        {
            int value = array[i];                               // set value = element i in array
            if (value < min)
            {
                min = value;                                    // set min = value if min < value
            }
        }

        return min;                                             // return minimum element in array
    }
}