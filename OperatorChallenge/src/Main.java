// Vinson Mach
// 08/24/2022
// In this program, we do an operator challenge

public class Main
{
    public static void main(String[] args)
    {
        double firstDouble = 20.00;                                             // operand 1 --> set first double to 20.00
        double secondDouble = 80.00;                                            // operand 2 --> set second double to 80.00
        double totalDouble = firstDouble + secondDouble;                        // operand 3 --> add both numbers

        System.out.println("FirstDouble = " + firstDouble);                     // print first variable
        System.out.println("SecondDouble = " + secondDouble);                   // print second variable
        System.out.println("TotalDouble = " + totalDouble);                     // print addition operand of first and second double

        totalDouble *= 100.00;                                                  // operand 3 --> multiply number by 100.00
        System.out.println("TotalDouble multiplied by 100.00 = " + totalDouble);// print totalDouble multiplied by 100

        double remainderDouble = totalDouble % 40.00;                           // operand 4 --> get remainder of totalDouble and 40.00
        System.out.println("RemainderDouble = " + remainderDouble);             // print remainder double

        boolean isRemainderDoubleZero = (remainderDouble == 0) ? true : false;  // operand 5 --> set boolean value to true if op4 is 0

        System.out.println("IsRemainderDoubleZero = " + isRemainderDoubleZero); // operand 6 --> output boolean variable

        if(!isRemainderDoubleZero)                                              // operand 7 --> print statement if op5 is false
        {
            System.out.println("Got some remainder.");                          // print remainder statement
        }
    }
}