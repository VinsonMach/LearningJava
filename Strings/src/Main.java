// Vinson Mach
// 08/24/2022
// In this program we start string basics

public class Main
{
    public static void main(String[] args)
    {
        String myString = "This is a string";                           // basic string
        System.out.println("myString is equal to " + myString);         // string statement

        myString = myString + ", and this is more";                     // string append
        System.out.println("myString is equal to " + myString);         // string statement

        myString = myString + " \u00A9 2022";                           // string unicode append
        System.out.println("myString is equal to " + myString);         // string statement

        String numberString = "250.55";                                 // string number
        numberString = numberString + "49.95";                          // number string append
        System.out.println(numberString);                               // number string statement

        String lastString = "10";                                       // static number string
        int myInt = 50;                                                 // int to append to string
        lastString = lastString + myInt;                                // int append to string
        System.out.println("LastString is equal to " + lastString);     // appended int string statement

        double doubleNumber = 120.47d;                                  // double to append to string
        lastString = lastString + doubleNumber;                         // double append to string
        System.out.println("LastString is equal to " + lastString);     // appended double string statement
    }
}