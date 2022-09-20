// Vinson Mach
// 09/20/2022
// In this program, we do a challenge where we get the largest prime of an integer and return it

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("The largest prime number of " + 125 + " is " + LargestPrime.getLargestPrime(125));  // call checker method and send integer
        System.out.println("The largest prime number of " + 126 + " is " + LargestPrime.getLargestPrime(126));  // call checker method and send integer
        System.out.println("The largest prime number of " + 67 + " is " + LargestPrime.getLargestPrime(67));    // call checker method and send integer
        System.out.println("The largest prime number of " + 0 + " is " + LargestPrime.getLargestPrime(0));      // call checker method and send integer

    }
}