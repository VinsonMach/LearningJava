// Vinson Mach
// 10/10/2022
// In this program, we learn about reference vs value types

import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        int myIntValue = 10;                                        // initialize int value
        int anotherIntValue = myIntValue;                           // initialize int value with reference to value

        System.out.println("myIntValue = " + myIntValue);           // print int value statement
        System.out.println("anotherIntValue = " + anotherIntValue); // print int value statement

        anotherIntValue++;                                          // increment value

        System.out.println("myIntValue = " + myIntValue);           // print int value statement
        System.out.println("anotherIntValue = " + anotherIntValue); // print int value statement

        int[] myIntArray = new int[5];                              // initialize new int array
        int[] anotherArray = myIntArray;                            // initialize int array with reference to memory

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));              // print int array
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));          // print int array

        anotherArray[0] = 1;                                        // set element in array = 1

        System.out.println("Changed myIntArray = " + Arrays.toString(myIntArray));      // print changed int array
        System.out.println("Changed anotherArray = " + Arrays.toString(anotherArray));  // print changed int array

        anotherArray = new int[] {4, 5, 6, 7, 8};                   // dereference array and initialize new elements
        modifyArray(myIntArray);                                    // call modify array method and send array

        System.out.println("Modified myIntArray = " + Arrays.toString(myIntArray));     // print modified int array
        System.out.println("Modified anotherArray = " + Arrays.toString(anotherArray)); // print modified int array
    }

    // This method modifies an array
    private static void modifyArray(int[] array)
    {
        array[0] = 2;                                               // set element in array = 2
        array = new int[] {1, 2, 3, 4, 5};                          // initialize new array elements
    }
}
