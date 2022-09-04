// Vinson Mach
// 09/04/2022
// In this program, we do a challenge where we check to see if a number is a palindrome or not

public class Main
{
    public static void main(String[] args)
    {
        // call method, sent value and print palindrome statement
        System.out.println("Is " + 1221 + " a palindrome? " + NumberPalindrome.isPalindrome(1221));
        System.out.println("Is " + 707 + " a palindrome? " + NumberPalindrome.isPalindrome(707));
        System.out.println("Is " + 11212 + " a palindrome? " + NumberPalindrome.isPalindrome(11212));
    }
}