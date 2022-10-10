// Vinson Mach
// 10/10/2022
// In this program, we do a challenge where we reverse the contents of an array

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] array = {1, 5, 3, 7, 11, 9, 15};                              // initialize new int array
        System.out.println("Array = " + Arrays.toString(array));            // print array contents statement
        reverse(array);                                                     // call reverse method and send array
        System.out.println("Reversed Array = " + Arrays.toString(array));   // print reverse array contents statement
    }

    // This method reverses an int array
    private static void reverse (int[] array)
    {
        int maxIndex = array.length - 1;                                    // initialize max array length
        int halfLen = array.length / 2;                                     // initialize half array length
        for (int i = 0; i < halfLen; i++)
        {
            int temp = array[i];                                            // initialize temp variable to hold current element in array
            array[i] = array[maxIndex - i];                                 // set current element value to max length - i value
            array[maxIndex - i] = temp;                                     // set max length - i value to temp value
        }
    }
}