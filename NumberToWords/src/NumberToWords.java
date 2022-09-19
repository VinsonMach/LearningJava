// Vinson Mach
// 09/19/2022
// In this program, we do a challenge where we convert an integer value to string value

public class NumberToWords
{
    // This method converts integer values to string and prints it
    public static void numberToWords(int number)
    {
        if (number < 0)
        {
            System.out.println("Invalid Value");            // print error statement
        }

        int reverseNumber = reverse(number);                // call reverse method and send parameter
        int digitCount = getDigitCount(number);             // call digit counting method and send parameter
        int count = 0;                                      // counter integer
        while (reverseNumber > 0)
        {
            int remainder = reverseNumber % 10;             // calculate remainder of reverse number
            switch (remainder)                              // switch case with last digit
            {
                case 0:
                    System.out.print("Zero ");              // print zero if case 0
                    break;
                case 1:
                    System.out.print("One ");               // print one if case 1
                    break;
                case 2:
                    System.out.print("Two ");               // print two if case 2
                    break;
                case 3:
                    System.out.print("Three ");             // print three if case 3
                    break;
                case 4:
                    System.out.print("Four ");              // print four if case 4
                    break;
                case 5:
                    System.out.print("Five ");              // print five if case 5
                    break;
                case 6:
                    System.out.print("Six ");               // print six if case 6
                    break;
                case 7:
                    System.out.print("Seven ");             // print seven if case 7
                    break;
                case 8:
                    System.out.print("Eight ");             // print eight if case 8
                    break;
                case 9:
                    System.out.print("Nine ");              // print nine if case 9
                    break;
                default:
                    System.out.println("Invalid Value");    // print default error statement
                    break;
            }

            count++;                                        // increment counter
            reverseNumber /= 10;                            // remove digit place
        }

        if (digitCount != count)
        {
            for (int i = 0; i < (digitCount - count); i++)
            {
                System.out.print("Zero ");                  // print leading zero
            }
        }
    }

    // This method gets the digit count of the parameter
    public static int getDigitCount(int number)
    {
        int count = 0;                                      // digit counter
        if (number < 0)
        {
            return -1;                                      // print -1 if invalid parameter
        }
        else if (number == 0)
        {
            return 1;                                       // print 1 if parameter = 0
        }
        else
        {
            while (number > 0)
            {
                count++;                                    // increment counter
                number /= 10;                               // remove digit place
            }
        }
        return count;                                       // return digit count
    }

    // This method calculates the reverse value of the parameter
    public static int reverse(int number)
    {
        int reverseNumber = 0;                              // value to hold the reversed integer value
        while (number != 0)
        {
            int remainder = number % 10;                    // calculate remainder
            if (reverseNumber != 0)
            {
                reverseNumber = (reverseNumber * 10) + remainder;   // calculate reversed value
            }
            else
            {
                reverseNumber = remainder;                  // reversed value = remainder
            }
            number /= 10;                                   // remove digit place
        }
        return reverseNumber;                               // return reversed value
    }
}