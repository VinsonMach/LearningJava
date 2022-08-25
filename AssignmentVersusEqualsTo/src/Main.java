// Vinson Mach
// 08/24/2022
// In this program, we learn about assignment operators vs equals to operator

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
            System.out.println("This is an true");                                  // print statement
        }

        boolean isCar = false;
        // (!isCar) is the same as (isCar == false)
        if(!isCar)                                                                  // if isCar is not true
        {
            System.out.println("This is not supposed to happen");
        }
    }
}