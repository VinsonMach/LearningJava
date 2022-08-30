// Vinson Mach
// 08/30/2022
// In this program, we do a challenge where we check if 3 parameters are different, equal or neither

public class Main
{
    public static void main(String[] args)
    {
        IntEqualityPrinter.printEqual(1, 2, 1);             // call check method and send different values
        IntEqualityPrinter.printEqual(1, 2, 3);             // call check method and send different values
        IntEqualityPrinter.printEqual(-1, -2, -3);          // call check method and send negative values
        IntEqualityPrinter.printEqual(1, 1, 1);             // call check method and send same values
    }
}