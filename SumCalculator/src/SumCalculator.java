// Vinson Mach
// 09/21/2022
// In this program, we do a challenge where we make a calculator class and do simple calculations with it

// This class does simple calculations and returns the result
public class SumCalculator
{
    private double firstNumber;                 // initialize first number
    private double secondNumber;                // initialize second number

    // This method gets and returns the first number
    public double getFirstNumber()
    {
        return firstNumber;                     // return first number
    }

    // This method gets and returns the second number
    public double getSecondNumber()
    {
        return secondNumber;                    // return second number
    }

    // This method sets the first number
    public void setFirstNumber(double firstNumber)
    {
        this.firstNumber = firstNumber;         // set class first number = parameter first number
    }

    // This method sets the second number
    public void setSecondNumber(double secondNumber)
    {
        this.secondNumber = secondNumber;       // set class second number = parameter second number
    }

    // This method performs addition and returns the result
    public double getAdditionResult()
    {
        return firstNumber + secondNumber;      // return the sum of first and second number
    }

    // This method performs subtraction and returns the result
    public double getSubtractionResult()
    {
        return firstNumber - secondNumber;      // return the difference of the first and second number
    }

    // This method performs multiplication and returns the result
    public double getMultiplicationResult()
    {
        return firstNumber * secondNumber;      // return the product of the first and second number
    }

    // This method performs division and returns the result
    public double getDivisionResult()
    {
        if (secondNumber == 0)
        {
            return 0;                           // return 0 if second number = 0
        }
        else
        {
            return firstNumber / secondNumber;  // return quotient of the first and second number
        }
    }
}