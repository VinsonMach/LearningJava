// Vinson Mach
// 09/24/2022
// In this program, we do a challenge where we calculate complex numbers

// This class calculates complex numbers
public class ComplexNumber
{
    private double real;                        // initialize instance real
    private double imaginary;                   // initialize instance imaginary

    // This constructor sets instance values when called with parameters
    public ComplexNumber(double real, double imaginary)
    {
        this.real = real;                       // set instance real = parameter real
        this.imaginary = imaginary;             // set instance imaginary = parameter imaginary
    }

    // This method gets the real number
    public double getReal()
    {
        return this.real;                       // return real number
    }

    // This method gets the imaginary number
    public double getImaginary()
    {
        return this.imaginary;                  // return imaginary number
    }

    // This method performs addition with real and imaginary numbers
    public void add(double real, double imaginary)
    {
        this.real += real;                      // add real numbers
        this.imaginary += imaginary;            // add imaginary numbers
    }

    // This method performs addition with real and imaginary numbers from another complex number
    public void add(ComplexNumber cm)
    {
        this.real += cm.real;                   // add real numbers
        this.imaginary += cm.imaginary;         // add imaginary numbers
    }

    // This method performs subtraction with real and imaginary numbers
    public void subtract(double real, double imaginary)
    {
        this.real -= real;                      // subtract real numbers
        this.imaginary -= imaginary;            // subtract imaginary numbers
    }

    // This method performs subtraction with real and imaginary numbers from another complex number
    public void subtract(ComplexNumber cm)
    {
        this.real -= cm.real;                   // subtract real numbers
        this.imaginary -= cm.imaginary;         // subtract imaginary numbers
    }
}
