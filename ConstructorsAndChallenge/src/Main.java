// Vinson Mach
// 09/22/2022
// In this program, we learn about and do a challenge with constructors

public class Main
{
    public static void main(String[] args)
    {
        // initialize and call new account and send parameters
        Account bobsAccount = new Account("12345", 0.00, "Bob Brown", "myemail@bob.com", "(078) 123-4567");
        System.out.println(bobsAccount.getNumber());            // call getter method and print results
        System.out.println(bobsAccount.getBalance());           // call getter method and print results

        //bobsAccount.setNumber("12345");                       // previously used to individually set object values
        //bobsAccount.setBalance(0.00);
        //bobsAccount.setCustName("Bob Brown");
        //bobsAccount.setCustEmail("myemail@bob.com");
        //bobsAccount.setCustPhone("(087) 123-4567");

        bobsAccount.withdrawal(100.0);          // call withdraw method and send parameter
        bobsAccount.deposit(50.0);                  // call deposit method and send parameter
        bobsAccount.withdrawal(100.0);          // call withdraw method and send parameter
        bobsAccount.deposit(51.0);                  // call deposit method and send parameter
        bobsAccount.withdrawal(100.0);          // call withdraw method and send parameter

        // initialize and call new account and send parameters
        Account timsAccount = new Account("Tim", "time@email.com", "12345");
        // print account information
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustName() + "\n");

        VipPerson person1 = new VipPerson();                // initialize new constructor
        System.out.println(person1.getName());              // call getter method and print results

        // initialize and call new account and send parameters
        VipPerson person2 = new VipPerson("Bob", 25000.00);
        System.out.println(person2.getName());              // call getter method and print results

        // initialize and call new account and send parameters
        VipPerson person3 = new VipPerson("Tim", 100.00, "tim@email.com");
        System.out.println(person3.getName());              // call getter method and print results
        System.out.println(person3.getEmailAddress());      // call getter method and print results
    }
}