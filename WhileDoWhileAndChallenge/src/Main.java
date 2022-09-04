// Vinson Mach
// 09/03/2022
// In this program, we learn about the while and do-while statements and do a challenge

public class Main
{
    public static void main(String[] args)
    {
        int count = 1;                                              // loop counter
        while (count != 6)                                          // while count != 6 loop
        {
            System.out.println("Count value is " + count);          // print count value
            count++;                                                // iterate count
        }

        System.out.println("------------------------------");       // print spacer

        for (count = 1; count != 6; count++)                        // for count != 6 loop
        {
            System.out.println("Count value is " + count);          // print count value
        }

        System.out.println("------------------------------");       // print spacer

        count = 1;                                                  // reinitialize count
        while(true)                                                 // while true loop
        {
            if (count == 6)                                         // if counter = 6
            {
                break;                                              // break loop
            }
            System.out.println("Count value is " + count);          // print count value
            count++;                                                // iterate count
        }

        System.out.println("------------------------------");       // print spacer

        count = 1;                                                  // reinitialize count
        do                                                          // do while loop, do always executes at least once
        {
            System.out.println("Count value is " + count);          // print count
            count++;                                                // iterate count
        } while (count != 6);                                       // while count != 6

        System.out.println("------------------------------");       // print spacer

        int number = 4;                                             // start of range
        int finnishNumber = 20;                                     // end of range
        int evenNumFound = 0;                                       // even number counter

        while (number <= finnishNumber)                             // while start num < end num loop
        {
            number++;                                               // iterate number
            if (!isEvenNumber(number))                              // if number is not even
            {
                continue;                                           // skip rest of loop and restart loop
            }

            System.out.println("Even number = " + number);          // print even number
            evenNumFound++;                                         // iterate evenNumFound
            if (evenNumFound >= 5)                                  // if even num counter >= 5
            {
                break;                                              // break loop
            }
        }

        System.out.println("Total even numbers found = " + evenNumFound);   // print total even num found
    }

    // This method checks if a number is even or not
    public static boolean isEvenNumber (int number)
    {
        if (!(number > 0))
        {
            return false;                                   // return false if number isnt greater than 0
        }
        else if (number % 2 == 0)
        {
            return true;                                    // return true if number is an even number
        }
        else
        {
            return false;                                   // return false under all other conditions
        }
    }
}