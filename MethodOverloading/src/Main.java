// Vinson Mach
// 08/29/2022
// In this program, we learn about method overloading and do a challenge overloading methods
// Method overloading is a feature that allows us to have more than one method with the same
// name, so long as we use different parameters

public class Main
{
    public static void main(String[] args)
    {
        // calls score calculation method and sends player name and score
        int newScore = calculateScore("ME", 500);
        System.out.println("New score: " + newScore);                                   // prints new score
        calculateScore(75);                                                             // prints score with no name
        calculateScore();                                                               // print no name and no score

        double feet = 3.0;                                                              // foot variable to be converted
        double inch = 10.0;                                                             // inch variable to be converted
        calcFeetAndInchesToCentimeters(feet, inch);                                     // call conversion method and send feet and inch
        calcFeetAndInchesToCentimeters(157);                                            // call conversion method and send inch
    }

    // This method prints player name and score, then returns new score
    public static int calculateScore(String playerName, int score)
    {
        System.out.println("Player " + playerName + " scored " + score + " points");    // print player name and score
        return score * 1000;                                                            // return new score
    }

    // This method prints score, then returns new score
    public static int calculateScore(int score)
    {
        System.out.println("Unnamed Player scored: " + score + " points");              // print score
        return score * 1000;                                                            // return new score
    }

    // This method prints no score and no name
    public static int calculateScore()
    {
        System.out.println("No player name, no player score");                          // print no name and score statement
        return 0;                                                                       // return 0
    }

    // This method calculates centimeters from feet and inches and returns centimeters
    public static double calcFeetAndInchesToCentimeters(double feet, double inches)
    {
        // if either feet or inches are < 0 or inches > 12
        if ((feet < 0.0) || (inches < 0.0) || (inches > 12.0))
        {
            return -1;                                                                  // return -1
        }

        double centimeters = ((feet * 12.0) + inches) * 2.54;                           // calculate centimeters from feet and inches
        // print feet and inch to centimeters
        System.out.println(feet + " feet and " + inches + " inches = " + centimeters + " centimeters");
        return centimeters;                                                             // return converted value
    }

    // This method converts inches to feet and remaining inches and sends calculated values to other method
    public static double calcFeetAndInchesToCentimeters(double inches)
    {
        if (inches < 0.0)                                                               // if inches is negative value
        {
            return -1;                                                                  // return -1
        }

        double feet = (int) inches / 12;                                                // converts inch to feet
        double remainingInches = (int) inches % 12;                                     // calculates remaining inches
        // print inch to feet and remaining inches statement
        System.out.println(inches + " inches = " + feet + " feet and " + remainingInches + " inches.");
        // call method, send feet and inch, return converted value
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}