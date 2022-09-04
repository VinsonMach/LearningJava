// Vinson Mach
// 09/03/2022
// In this program, we do a challenge where we get the sum of all the digits of a number

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("The sum of the digits in the number 125 is " + sumDigits(125));     // call method and print sum of digits
        System.out.println("The sum of the digits in the number -125 is " + sumDigits(-125));   // call method and print sum of digits
        System.out.println("The sum of the digits in the number 4 is " + sumDigits(4));         // call method and print sum of digits
        System.out.println("The sum of the digits in the number 32123 is " + sumDigits(32123)); // call method and print sum of digits
    }

    // This method calculates the sum of the digits in the parameter
    public static int sumDigits (int number)
    {
        if(number < 10)
        {
            return -1;                                  // return -1 if the number is < 10
        }

        int sum = 0;                                    // sum of the digits in number
        // 125 -> 125 / 10 = 12 * 10 = 125 - 120 = 5
        while(number > 0)
        {
            int digit = number % 10;                    // extracting the least sig number
            sum += digit;                               // add the digit to the sum
            number /= 10;                               // dropping the least sig number
        }
        return sum;                                     // return the sum of all the digits in number
    }
}