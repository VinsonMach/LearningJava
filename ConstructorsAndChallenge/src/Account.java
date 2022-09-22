// Vinson Mach
// 09/22/2022
// In this program, we learn about and do a challenge with constructors

// Using InteliJ, we can auto generate getters and setters by doing to the Code tab, click generate
// select getters and setters, select the methods wanted and the methods selected will be generated

// This class serves as a template for a customer's bank account
public class Account
{
    private String number;                                                  // initialize customer account number
    private double balance;                                                 // initialize customer account balance
    private String custName;                                                // initialize customer name
    private String custEmail;                                               // initialize customer email
    private String custPhone;                                               // initialize customer phone

    // This is the default constructor
    public Account()
    {
        // The default constructor is called with default values, this line needs to be the first line
        this("56789", 2.50, "Default Name", "Default Address", "Default Phone");
        System.out.println("Empty constructor called.");                    // print empty constructor statement
    }

    // This constructor sets object values when the constructor is called with parameters
    public Account(String number, double balance, String custName, String custEmail, String custPhone)
    {
        System.out.println("Account constructor with parameters called.");  // print constructors statement
        this.number = number;                                               // set class number = parameter number
        this.balance = balance;                                             // set class balance = parameter balance
        this.custName = custName;                                           // set class custName = parameter custName
        this.custEmail = custEmail;                                         // set class custEmail = parameter custEmail
        this.custPhone = custPhone;                                         // set class custPhone = parameter custPhone
    }

    // This constructor sets object values when the constructor is called with parameters and default values for missing parameters
    public Account(String custName, String custEmail, String custPhone)
    {
        this("99999", 100.55, custName, custEmail, custPhone);// set default values for
        //this.custName = custName;                                           // set class custName = parameter custName
        //this.custEmail = custEmail;                                         // set class custEmail = parameter custEmail
        //this.custPhone = custPhone;                                         // set class custPhone = parameter custPhone
    }

    // This method performs addition to a person's account balance and prints the results
    public void deposit(double depositAmount)
    {
        this.balance += depositAmount;                                      // performs addition to the customer's balance
        // print new balance statement
        System.out.println("Deposit of $" + depositAmount + " made. New balance is: $" + this.balance);
    }

    // This method performs subtraction to a person's account balance and prints the results
    public void withdrawal(double withdrawalAmount)
    {
        if (this.balance - withdrawalAmount < 0)
        {
            // print error statement
            System.out.println("Only $" + this.balance + " available. Withdrawal not processed.");
        }
        else
        {
            this.balance -= withdrawalAmount;                               // performs subtraction to the customer's balance
            // print new balance statement
            System.out.println("Withdrawal of $" + withdrawalAmount + " processed. Remaining balance: $" + this.balance);
        }
    }

    // This method returns the account number
    public String getNumber()
    {
        return number;                                                      // return account number
    }

    // This method sets the account number
    public void setNumber(String number)
    {
        this.number = number;                                               // set class number = parameter number
    }

    // This method returns the account balance
    public double getBalance()
    {
        return balance;                                                     // return account balance
    }

    // This method sets the account balance
    public void setBalance(double balance)
    {
        this.balance = balance;                                             // set class balance = parameter balance
    }

    // This method returns the customer's name
    public String getCustName()
    {
        return custName;                                                    // return customer name
    }

    // This method sets the customer's name
    public void setCustName(String custName)
    {
        this.custName = custName;                                           // set class custName = parameter custName
    }

    // This method returns the customer's email
    public String getCustEmail()
    {
        return custEmail;                                                   // return customer email
    }

    // This method sets the customer's email
    public void setCustEmail(String custEmail)
    {
        this.custEmail = custEmail;                                         // set class custEmail = parameter custEmail
    }

    // This method returns the customer's phone
    public String getCustPhone()
    {
        return custPhone;                                                   // return customer phone
    }

    // This method sets the customer's phone
    public void setCustPhone(String custPhone)
    {
        this.custPhone = custPhone;                                         // set class custPhone = parameter custPhone
    }
}