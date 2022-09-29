// Vinson Mach
// 09/28/2022
// In this program, we learn about encapsulation and do a challenge

// Encapsulation limits the accessibility that

public class Main
{
    public static void main(String[] args)
    {
        Player player = new Player();                                               // initialize instance player
        player.name = "Tim";                                                        // set object name
        player.health = 20;                                                         // set object health
        player.weapon = "Sword";                                                    // set object weapon

        int damage = 10;                                                            // initialize attack damage
        player.loseHealth(damage);                                                  // call attack method
        //System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;                                                                // set attack damage
        player.health = 200;                                                        // set player health
        player.loseHealth(damage);                                                  // call attack method
        //System.out.println("Remaining health = " + player.healthRemaining());

        // initialize instance enhancedPlayer
        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Tim", 50, "Sword");
        //System.out.println("Initial health = " + enhancedPlayer.getHealth());

        Printer printer = new Printer(50, false);                   // initialize instance printer
        System.out.println("Initial page count = " + printer.getPagesPrinted());    // print initial page count statement
        int pagesPrinted = printer.printPages(4);                                   // initialize pages printed and call print method
        // print print count statement
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);                                       // initialize pages printed and call print method
        // print print count statement
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
    }
}