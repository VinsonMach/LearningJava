// Vinson Mach
// 09/04/2022
// In this program, we do a challenge where we check to see if a number is a palindrome or not

public class NumberPalindrome
{
    // This method checks if the parameter is a palindrome or not
    public static boolean isPalindrome (int number)
    {
        int reverse = 0;                                // initializes reverse to 0 to hold reversed parameter later
        int original = number;                          // initializes original to hold original number

        while (number != 0)
        {
            int lastDigit = number % 10;                // calculate last digit of parameter
            reverse = ((reverse * 10) + lastDigit);     // calculates the reversed value of the original number
            number /= 10;                               // calculates a tenth of the parameter
        }

        return original == reverse;                     // return true if the original number = the reverse, false if not
    }
}
