// Vinson Mach
// 10/02/2022
// In this program, we do a challenge where we combine all learned OOP concepts into 1 exercise

// This class has the attributes of the deluxe burger and inherits from the hamburger parent class
public class DeluxeBurger extends Hamburger
{
    // This constructor sets values with parent constructor
    public DeluxeBurger()
    {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");// call parent constructor and send parameters
        super.addHamburgerExtra1("Chips", 2.75);                            // call parent constructor and send parameters
        super.addHamburgerExtra2("Drink", 1.81);                            // call parent constructor and send parameters
    }

    // This method tries to add another topping
    @Override
    public void addHamburgerExtra1(String name, double price)
    {
        System.out.println("Cannot add additional items to deluxe burger");             // print error statement
    }

    // This method tries to add another topping
    @Override
    public void addHamburgerExtra2(String name, double price)
    {
        System.out.println("Cannot add additional items to deluxe burger");             // print error statement
    }

    // This method tries to add another topping
    @Override
    public void addHamburgerExtra3(String name, double price)
    {
        System.out.println("Cannot add additional items to deluxe burger");             // print error statement
    }

    // This method tries to add another topping
    @Override
    public void addHamburgerExtra4(String name, double price)
    {
        System.out.println("Cannot add additional items to deluxe burger");             // print error statement
    }
}