// Vinson Mach
// 10/02/2022
// In this program, we do a challenge where we combine all learned OOP concepts into 1 exercise

public class Main
{
    public static void main(String[] args)
    {
        // initialize instance and send parameters
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();                            // call price calculating method

        hamburger.addHamburgerExtra1("Tomato", 0.27);               // add extra topping to hamburger
        hamburger.addHamburgerExtra2("Lettuce", 0.75);              // add extra topping to hamburger
        hamburger.addHamburgerExtra3("Cheese", 1.13);               // add extra topping to hamburger
        System.out.println("Total burger price is " + hamburger.itemizeHamburger());// call price calculating method and print results

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67); // initialize instance and send parameters
        healthyBurger.addHealthyExtra1("Egg", 5.43);                // add extra topping to healthy hamburger
        healthyBurger.addHealthyExtra2("Lentils", 3.41);            // add extra topping to healthy hamburger
        System.out.println("Total healthy burger price is " + healthyBurger.itemizeHamburger());// call price calculating method and print results

        DeluxeBurger deluxeBurger = new DeluxeBurger();                        // initialize instance and send parameters
        deluxeBurger.itemizeHamburger();                                       // call price calculating method
    }
}