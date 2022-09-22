// Vinson Mach
// 09/22/2022
// In this program, we learn about and do a challenge with constructors

// This class handles the information of a vip
public class VipPerson
{
    private String name;                                // initialize vip name
    private double creditLimit;                         // initialize vip credit limit
    private String emailAddress;                        // initialize vip email

    // This is the default constructor
    public VipPerson()
    {
        // assign default values
        this("Default name", 50000.00, "default@email.com");
    }

    // This constructor sets object values when the constructor is called with parameters and default values for missing parameters
    public VipPerson(String name, double creditLimit)
    {
        // assign object values and default values
        this(name, creditLimit, "unknown@email.com");
    }

    // This constructor sets object values when the constructor is called with parameters
    public VipPerson(String name, double creditLimit, String emailAddress)
    {
        this.name = name;                               // set class name = parameter name
        this.creditLimit = creditLimit;                 // set class credit limit = parameter credit limit
        this.emailAddress = emailAddress;               // set class email = parameter email
    }

    // This method gets the vip's name
    public String getName()
    {
        return name;                                    // return vip name
    }

    // This method gets the vip's credit limit
    public double getCreditLimit()
    {
        return creditLimit;                             // return vip credit limit
    }

    // This method gets the vip's email
    public String getEmailAddress()
    {
        return emailAddress;                            // return vips email
    }
}