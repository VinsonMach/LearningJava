// Vinson Mach
// 08/24/2022
// In this program we learn the basics of operators, operands and expressions
// as well as abbreviating operators

public class Main
{
    public static void main(String[] args)
    {
        int result = 3;                                             // 1 + 2 = 3 --> addition operator
        System.out.println("1 + 2 = " + result);                    // print operation statement
        int previousResult = result;                                // copy result value
        System.out.println("PreviousResult = " + previousResult);   // print previousResult statement
        result = result - 1;                                        // decrement result
        System.out.println("3 - 1 = " + result);                    // print decrement statement
        System.out.println("PreviousResult = " + previousResult);   // print previousResult statement

        result = result * 10;                                       // 2 * 10 = 20 --> multiplication operator
        System.out.println("2 * 10 = " + result);                   // print multiplication operation

        result = result / 5;                                        // 20 / 5 = 4 --> division operator
        System.out.println("20 / 5 = " + result);                   // print division operation

        result = result % 3;                                        // the remainder of 4 / 3 = 1 --> modulus operator
        System.out.println("4 % 3 = " + result);                    // print modulus operation

        result++;                                                   // increments result + 1 --> result = result + 1
        System.out.println("1 + 1 = " + result);                    // prints incremented result

        result--;                                                   // decrements result -1 --> result = result - 1
        System.out.println("2 - 1 = " + result);                    // prints decremented result

        result += 2;                                                // add 2 to result --> result = result + 2
        System.out.println("1 + 2 = " + result);                    // prints result + 2

        result *= 10;                                               // multiplys result by 10 --> result = result * 10
        System.out.println("3 * 10 = " + result);                   // prints multiplied result statement

        result /= 3;                                                // divides result by 3 --> result = result / 3
        System.out.println("30 / 3 = " + result);                   // print divided result statement

        result -= 2;                                                // subtracts result by 2 --> result = result - 2
        System.out.println("10 - 2 = " + result);                   // print subtracted result statement
    }
}