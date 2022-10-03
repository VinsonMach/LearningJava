// Vinson Mach
// 10/02/2022
// In this program, we do a challenge where we combine all learned OOP concepts into 1 exercise

// This class has the attributes of the healthy burger and inherits from the hamburger parent class
public class HealthyBurger extends Hamburger
{
    private String healthyExtra1Name;       // initialize object healthy topping 1 name
    private double healthyExtra1Price;      // initialize object healthy topping 1 price

    private String healthyExtra2Name;       // initialize object healthy topping 2 name
    private double healthyExtra2Price;      // initialize object healthy topping 2 price

    // This constructor sets values with parent constructor
    public HealthyBurger(String meat, double price)
    {
        super("Healthy", meat, price, "Brown Rye"); // call parent constructor and send parameters
    }

    // This method adds a healthy topping to the burger
    public void addHealthyExtra1(String name, double price)
    {
        this.healthyExtra1Name = name;             // set object healthy topping 1 name = parameter name
        this.healthyExtra1Price = price;           // set object healthy topping 1 price = parameter price
    }

    // This method adds a healthy topping to the burger
    public void addHealthyExtra2(String name, double price)
    {
        this.healthyExtra2Name = name;             // set object healthy topping 2 name = parameter name
        this.healthyExtra2Price = price;           // set object healthy topping 2 price = parameter price
    }

    // This method calculates total price of burger with method overridden from parent class
    @Override
    public double itemizeHamburger()
    {
        double hamburgerPrice = super.itemizeHamburger();   // initialize variable and set price of burger
        if (this.healthyExtra1Name != null)
        {
            hamburgerPrice += this.healthyExtra1Price;      // add healthy topping price to total burger price
            // print added healthy topping statement
            System.out.println("Added " + this.healthyExtra1Name + " for and extra " + this.healthyExtra1Price);
        }
        if (this.healthyExtra2Name != null)
        {
            hamburgerPrice += this.healthyExtra2Price;      // add healthy topping price to total burger price
            // print added healthy topping statement
            System.out.println("Added " + this.healthyExtra2Name + " for and extra " + this.healthyExtra2Price);
        }
        return hamburgerPrice;                              // return total burger price
    }
}