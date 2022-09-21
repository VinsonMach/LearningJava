// Vinson Mach
// 09/21/2022
// In this program, we do a challenge with classes to get the full name and age of a person

public class Main
{
    public static void main(String[] args)
    {
        Person person = new Person();                               // initialize new person class

        person.setFirstName("");                                    // call setter method and send empty string
        person.setLastName("");                                     // call setter method and send empty string
        person.setAge(10);                                          // call setter method and send age

        System.out.println("Full Name = " + person.getFullName());  // call getter method and print results
        System.out.println("Teen = " + person.isTeen());            // call checker method and print results
        person.setFirstName("John");                                // call setter method and send John
        person.setAge(18);                                          // call setter method and send age

        System.out.println("\nFull Name = " + person.getFullName());// call getter method and print results
        System.out.println("Teen = " + person.isTeen());            // call checker method and print results
        person.setLastName("Smith");                                // call setter method and send Smith
        System.out.println("\nFull Name = " + person.getFullName());// call getter method and print results
    }
}