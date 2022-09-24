// Vinson Mach
// 09/24/2022
// In this program, we do a challenge where we calculate complex numbers

public class Main
{
    public static void main(String[] args)
    {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);            // initialize and call constructor with parameters
        ComplexNumber number = new ComplexNumber(2.5, -1.5);        // initialize and call constructor with parameters
        one.add(1,1);                                               // call addition method and send parameters
        System.out.println("one.real = " + one.getReal());                          // call getter method and print results
        System.out.println("one.imaginary = " + one.getImaginary());            // call getter method and print results
        one.subtract(number);                                                   // call subtraction method and send parameter
        System.out.println("one.real = " + one.getReal());                      // call getter method and print results
        System.out.println("one.imaginary = " + one.getImaginary());            // call getter method and print results
        number.subtract(one);                                                   // call subtraction method and send parameter
        System.out.println("number.real = " + number.getReal());                // call getter method and print results
        System.out.println("number.imaginary = " + number.getImaginary());      // call getter method and print results
    }
}