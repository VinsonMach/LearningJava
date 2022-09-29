// Vinson Mach
// 09/28/2022
// In this program, we learn about encapsulation and do a challenge

// This class is the template for an enhanced player
public class EnhancedPlayer
{
    private String name;                        // initialize object name
    private int hitPoints = 100;                // initialize object hit points
    private String weapon;                      // initialize object weapon

    // This constructor sets values when called with parameters
    public EnhancedPlayer(String name, int health, String weapon)
    {
        this.name = name;                       // set player name = parameter name

        if (health > 0 && health <= 100)
        {
            this.hitPoints = health;            // set object hit points = parameter health
        }
        this.weapon = weapon;                   // set object weapon = parameter weapon
    }

    // This method subtracts player health
    public void loseHealth(int damage)
    {
        this.hitPoints -= damage;               // subtract damage from hit points
        if (this.hitPoints <= 0)
        {
            System.out.println("Player knocked out");
            // reduce number of lives remaining for the player
        }
    }

    // This method gets player health
    public int getHealth()
    {
        return hitPoints;                       // return remaining health
    }
}
