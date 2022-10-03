// Vinson Mach
// 10/02/2022
// In this program, we do a challenge where we combine all learned OOP concepts into 1 exercise

// This class is the base template for the attribute of a hamburger and will be inherited from later
public class Hamburger
{
    private String name;                // initialize object name
    private String meat;                // initialize object meat
    private double price;               // initialize object price
    private String breadRollType;       // initialize object bread roll type

    private String extra1Name;          // initialize object extra topping 1 name
    private double extra1Price;         // initialize object extra topping 1 price
    private String extra2Name;          // initialize object extra topping 2 name
    private double extra2Price;         // initialize object extra topping 2 price
    private String extra3Name;          // initialize object extra topping 3 name
    private double extra3Price;         // initialize object extra topping 3 price
    private String extra4Name;          // initialize object extra topping 4 name
    private double extra4Price;         // initialize object extra topping 4 price

    // This constructor sets values when called with parameters
    public Hamburger(String name, String meat, double price, String breadRollType)
    {
        this.name = name;                   // set object name = parameter name
        this.meat = meat;                   // set object meat = parameter meat
        this.price = price;                 // set object price = parameter price
        this.breadRollType = breadRollType; // set object bread roll type = parameter bread roll type
    }

    // This method adds a topping to the burger
    public void addHamburgerExtra1 (String name, double price)
    {
        this.extra1Name = name;             // set object topping 1 name = parameter name
        this.extra1Price = price;           // set object topping 1 price = parameter price
    }

    // This method adds a topping to the burger
    public void addHamburgerExtra2 (String name, double price)
    {
        this.extra2Name = name;             // set object topping 2 name = parameter name
        this.extra2Price = price;           // set object topping 2 price = parameter price
    }

    // This method adds a topping to the burger
    public void addHamburgerExtra3 (String name, double price)
    {
        this.extra3Name = name;             // set object topping 3 name = parameter name
        this.extra3Price = price;           // set object topping 3 price = parameter price
    }

    // This method adds a topping to the burger
    public void addHamburgerExtra4 (String name, double price)
    {
        this.extra4Name = name;             // set object topping 4 name = parameter name
        this.extra4Price = price;           // set object topping 4 price = parameter price
    }

    // This method calculates the total price of the burger
    public double itemizeHamburger()
    {
        double hamburgerPrice = this.price; // initialize variable and set price of burger
        // print burger details statement
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll with " + this.meat + ", price is " + this.price);

        if (this.extra1Name != null)
        {
            hamburgerPrice += this.extra1Price;     // add topping price to total burger price
            System.out.println("Added " + this.extra1Name + " for and extra " + this.extra1Price);  // print added topping statement
        }
        if (this.extra2Name != null)
        {
            hamburgerPrice += this.extra2Price;     // add topping price to total burger price
            System.out.println("Added " + this.extra2Name + " for and extra " + this.extra2Price);  // print added topping statement
        }
        if (this.extra3Name != null)
        {
            hamburgerPrice += this.extra3Price;     // add topping price to total burger price
            System.out.println("Added " + this.extra3Name + " for and extra " + this.extra3Price);  // print added topping statement
        }
        if (this.extra4Name != null)
        {
            hamburgerPrice += this.extra4Price;     // add topping price to total burger price
            System.out.println("Added " + this.extra4Name + " for and extra " + this.extra4Price);  // print added topping statement
        }

        return hamburgerPrice;                      // return total burger price
    }
}
