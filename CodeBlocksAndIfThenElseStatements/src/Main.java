// Vinson Mach
// 08/25/2022
// In this program, we learn about codeblocks scope and if-then-else statements

public class Main
{
    public static void main(String[] args)
    {
        boolean gameOver = true;
        int score = 4000;
        int lvlCompleted = 5;
        int bonus = 100;

        if(score < 5000 && score > 1000)
        {
            System.out.println("Your score was less than 5000, but more than 1000");
        }
        else if (score < 1000)
        {
            System.out.println("Your score was less than 1000");
        }
        else
        {
            System.out.println("Got here");
        }

        if(gameOver)
        {
            int finalScore = score + (lvlCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);
        }

        // Print out a second score on the screen with the following
        // score set to 10000
        // lvlCompleted set to 8
        // bonus set to 200
        // make sure the first printout above still displays as well

        boolean newGameOver = true;
        int newScore = 10000;
        int newLvlCompleted = 8;
        int newBonus = 200;

        if(newGameOver)
        {
            int finalScore = newScore + (newLvlCompleted * newBonus);
            System.out.println("Your final score was: " + finalScore);
        }
    }
}