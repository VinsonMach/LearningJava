// Vinson Mach
// 09/28/2022
// In this program, we learn about encapsulation and do a challenge

// This class is the template for a player
public class Player
{
    public String name;                             // initialize object name
    public int health;                              // initialize object health
    public String weapon;                           // initialize object weapon

    // This method subtracts health from player health
    public void loseHealth(int damage)
    {
        this.health -= damage;                      // subtract player damage
        if (this.health <= 0)
        {
            System.out.println("Player knocked out");
            // reduce number of lives remaining for the player
        }
    }

    // This method gets remaining health
    public int healthRemaining()
    {
        return this.health;                         // return player health
    }
}