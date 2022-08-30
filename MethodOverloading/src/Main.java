// Vinson Mach
// 08/29/2022
// In this program, we learn about method overloading and do a challenge overloading methods

public class Main
{
    public static void main(String[] args)
    {
        int newScore = calculateScore("ME", 500);
        System.out.println("New score: " + newScore);
        calculateScore(75);
        calculateScore();

        double feet = 3.0;
        double inch = 10.0;
        calcFeetAndInchesToCentimeters(feet, inch);
        calcFeetAndInchesToCentimeters(157);
    }

    public static int calculateScore(String playerName, int score)
    {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score)
    {
        System.out.println("Unnamed Player scored: " + score + " points");
        return score * 1000;
    }

    public static int calculateScore()
    {
        System.out.println("No player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches)
    {
        if ((feet < 0.0) || (inches < 0.0) || (inches > 12.0))
        {
            return -1;
        }

        double centimeters = ((feet * 12.0) + inches) * 2.54;
        System.out.println(feet + " feet and " + inches + " inches = " + centimeters + " centimeters");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches)
    {
        if (inches < 0.0)
        {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches = " + feet + " feet and " + remainingInches + " inches.");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}