// Vinson Mach
// 10/05/2022
// In this program, we learn about arrays and do a challenge

import java.util.Arrays;                                        // import java library
import java.util.Scanner;                                       // import java library

public class Main
{
    private static Scanner scanner = new Scanner(System.in);    // initialize scanner object

    public static void main(String[] args)
    {
        //int[] myIntArray = new int[25];                 //{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] myInt = getIntegers(5);                   // initialize new array
        int[] sorted = sortIntegers(myInt);                     // initialize new sorted array and call array sorting method
        //myIntArray[0] = 45;
        //myIntArray[1] = 476;
        //myIntArray[5] = 50;

        //for (int i = 0; i < myInt.length; i++)
        //{
        //    myIntArray[i] = i * 10;
        //    System.out.println("Element " + i + ", typed value = " + myInt[i]);
        //}

        //System.out.println("The average is " + getAverage(myInt));
        //printArray(myIntArray);
        printArray(sorted);                                     // call print array method
    }

    // This method asks the user for input
    public static int[] getIntegers (int capacity)
    {
        int[] array = new int [capacity];                       // initialize new array
        System.out.println("Enter " + capacity + " integer values: \r");    // ask user for integers

        for (int i = 0; i < array.length; i++)
        {
            array[i] = scanner.nextInt();                       // save integers into array
        }

        return array;                                           // return filled array
    }

    // This method gets the average of inputs
    public static double getAverage (int[] array)
    {
        int sum = 0;                                            // initialize sum of all inputs
        for (int i = 0; i < array.length; i++)
        {
            sum += array[i];                                    // add elements of array to sum
        }

        return ((double)sum / (double)array.length);            // return calculated average of elements of array
    }

    // This method prints the elements in the array
    public static void printArray (int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("Element " + i + " contents " + array[i]);   // print elements of array
        }
    }

    // This method sorts all elements of array
    public static int[] sortIntegers(int[] array)
    {
//        int[] sortedArray = new int[array.length];                        // initialize new array with length of parameter array
//        for (int i = 0; i < array.length; i++)
//        {
//            sortedArray[i] = array[i];                                    // copy elements of array to new array
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);             // initialize copy of array from parameter simple

        boolean flag = true;                                                // set sorted flag = false
        int temp;                                                           // initialize temp variable
        while (flag)
        {
            flag = false;                                                   // set sorted flag = false
            for (int i = 0; i < sortedArray.length - 1; i++)
            {
                if (sortedArray[i] < sortedArray[i + 1])
                {
                    temp = sortedArray[i];                                  // set temp = current element in array
                    sortedArray[i] = sortedArray[i + 1];                    // set current element = next element in array
                    sortedArray[i + 1] = temp;                              // set next element in array = temp variable
                    flag = true;                                            // set sorted flag = true
                }
            }
        }
        return sortedArray;                                                 // return sorted array
    }
}