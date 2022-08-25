// Vinson Mach
// 08/24/2022
// In this program, we learn about the ternary operator
// The ternary operator is a shortcut to assigning 1 of 2 values to a variable
// depending on a given condition. It is also a shortcut of the if-then-else statement

public class Main
{
    public static void main(String[] args)
    {
        boolean isAlien = false;                                                    // boolean test variable
        if(isAlien == false)
        {
            System.out.println("It is not an alien!");                              // print statement if isAlien = false
            System.out.println("And I am scared of aliens");                        // print statement
        }

        int topScore = 91;                                                          // top score integer
        if(topScore < 100)
        {
            System.out.println("You got the high score!");                          // print statement if topScore < 100
        }

        int secondScore = 95;                                                       // second score integer
        if((topScore > secondScore) && (topScore < 100))
        {
            // print statement if topScore > secondScore AND topScore < 100
            System.out.println("Greater than second top score and less than 100");
        }

        if((topScore > 90) || (secondScore <= 90))
        {
            // print statement if topScore > 90 OR secondScore <= 90
            System.out.println("Either or both conditions are true");
        }

        int newValue = 50;                                                          // assignment operator
        if(newValue == 50)                                                          // equals to operator
        {
            System.out.println("This is true");                                     // print statement
        }

        boolean isCar = false;
        // (!isCar) is the same as (isCar == false)
        if(!isCar)                                                                  // if isCar is not true
        {
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        // we're testing if isCar is true, if it is we set wasCar to true, otherwise false
        boolean wasCar = isCar ? true : false;
        if(wasCar)
        {
            System.out.println("wasCar is true");
        }

        // int ageOfClient = 20;
        // boolean is18OrOver = ageOfClient == 20 ? true : false
        // Operand 1: We check if ageOfClient == 20 is true. It needs to return true or false
        // Operand 2: is18OrOver is assigned true if the condition above is true
        // Operand 3: is18OrOver is assigned false is the above condition was false
    }
}