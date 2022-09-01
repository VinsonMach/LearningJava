// Vinson Mach
// 08/31/2022
// In this program, we do a challenge where we print a day corresponding to the int value

public class NumberInWord
{
    // This method prints number string that correspond to the value passed
    public static void printNumberInWord (int num)
    {
        switch (num)
        {
            case 0:
                System.out.println("ZERO");                 // print ZERO if num is 0
                break;

            case 1:
                System.out.println("ONE");                  // print ONE if num is 1
                break;

            case 2:
                System.out.println("TWO");                  // print TWO if num is 2
                break;

            case 3:
                System.out.println("THREE");                // print THREE if num is 3
                break;

            case 4:
                System.out.println("FOUR");                 // print FOUR if num is 4
                break;

            case 5:
                System.out.println("FIVE");                 // print FIVE if num is 5
                break;

            case 6:
                System.out.println("SIX");                  // print SIX if num is 6
                break;

            case 7:
                System.out.println("SEVEN");                // print SEVEN if num is 7
                break;

            case 8:
                System.out.println("EIGHT");                // print EIGHT if num is 8
                break;

            case 9:
                System.out.println("NINE");                 // print NINE if num is 9
                break;

            default:
                System.out.println("OTHER");                // print OTHER if num is out of bounds
                break;
        }
    }
}
