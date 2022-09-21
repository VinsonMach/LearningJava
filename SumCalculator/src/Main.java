// Vinson Mach
// 09/21/2022
// In this program, we do a challenge where we make a calculator class and do simple calculations with it

public class Main
{
    public static void main(String[] args)
    {
        SumCalculator calculator = new SumCalculator();                             // initialize calculator class

        calculator.setFirstNumber(5.0);                                             // call setter method and send first number
        calculator.setSecondNumber(4);                                              // call setter method and send second number
        System.out.println("Add = " + calculator.getAdditionResult());              // call addition method and print results
        System.out.println("Subtract = " + calculator.getSubtractionResult());      // call subtraction method and print results

        calculator.setFirstNumber(5.25);                                            // call setter method and send first number
        calculator.setSecondNumber(0);                                              // call setter method and send second number
        System.out.println("Multiply = " + calculator.getMultiplicationResult());   // call multiplication method and print results
        System.out.println("Divide = " + calculator.getDivisionResult());           // call division method and print results
    }
}