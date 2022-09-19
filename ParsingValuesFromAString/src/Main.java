// Vinson Mach
// 09/19/2022
// In this program, we learn about parsing values from a string

public class Main
{
    public static void main(String[] args)
    {
        String numberAsAString = "2018.125";                            // string to be parsed
        System.out.println("numberAsAString = " + numberAsAString);     // print string

        Double number = Double.parseDouble(numberAsAString);            // parse string to double
        System.out.println("number = " + number);                       // print double

        numberAsAString += 1;                                           // append 1 to string
        number += 1;                                                    // add 1 to double

        System.out.println("numberAsAString = " + numberAsAString);     // print string
        System.out.println("number = " + number);                       // print double
    }
}