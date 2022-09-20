// Vinson Mach
// 09/20/2022
// In this program, we do a challenge where we print a square star

public class DiagonalStar
{
    // This method prints a square star with the size of the parameter
    public static void printSquareStar (int number)
    {
        if (number < 5)
        {
            System.out.println("Invalid Value");        // print error statement
        }
        else
        {
            for (int i = 1; i <= number; i++)
            {
                for (int j = 1; j <= number; j++)
                {
                    // calculate if blank or star piece needs to be printed
                    if (i == 1 || j == 1 || i == number || j == number || i == j || j == (number - i + 1))
                    {
                        System.out.print("*");          // print star piece
                    }
                    else
                    {
                        System.out.print(" ");          // print blank piece
                    }
                }
                System.out.println();                   // print newline
            }
        }
        System.out.println();                           // print spacer
    }
}