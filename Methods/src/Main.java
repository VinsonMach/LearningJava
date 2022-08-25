// Vinson Mach
// 08/25/2022
// In this program, we learn about methods and do a challenge

public class Main
{
    public static void main(String[] args)
    {
        boolean gameOver = true;                                                      // end game boolean
        int score = 4000;                                                             // player score value
        int lvlCompleted = 5;                                                         // level completed value
        int bonus = 100;                                                              // bonus value

        int highScore = calculateScore(gameOver, score, lvlCompleted, bonus);         // calculated high score value
        System.out.println("Your final score was: " + highScore);                     // print final score statement

        // print final score a different way that consolidates lines
        System.out.println("Your final score was: " + calculateScore(true, 10000, 8, 200));

        int highScorePosition = calculateHighScorePosition(1500);                     // call position calculation and send 1500
        displayHighScorePosition("First", highScorePosition);                   // call display high score position and send position and name

        displayHighScorePosition("Second", calculateHighScorePosition(900));    // call display high score position and send position and name
        displayHighScorePosition("Third", calculateHighScorePosition(400));     // call display high score position and send position and name
        displayHighScorePosition("Fourth", calculateHighScorePosition(50));     // call display high score position and send position and name
    }

    // Score calculation method that returns calculated score
    public static int calculateScore(boolean gameOver, int score, int lvlCompleted, int bonus)
    {
        if(gameOver)
        {
            return score + (lvlCompleted * bonus);                                      // return calculated score
        }
        else
        {
            return -1;                                                                  // return -1
        }
    }

    // High score position method that displays position on the high score table
    public static void displayHighScorePosition(String name, int position)
    {
        // print high score position statement
        System.out.println(name + " managed to get into position (" + position + ") on the high score table.");
    }

    // High score position calculation method that returns position on high score table
    // can also make a position variable that has dynamic value and return it
    public static int calculateHighScorePosition(int score)
    {
        if(score >= 1000)
        {
            return 1;
        }
        else if (score >= 500)
        {
            return 2;
        }
        else if (score >= 100)
        {
            return 3;
        }
        else
        {
            return 4;
        }
    }
}