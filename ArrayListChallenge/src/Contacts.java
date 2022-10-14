// Vinson Mach
// 10/12/2022
// In this program, we do a challenge with array lists

// This class is a template for the contact information of a person
public class Contacts
{
    private String name;                                // initialize person name
    private String phoneNumber;                         // initialize person phone number

    // This constructor sets persons name and phone number
    public Contacts(String name, String phoneNumber)
    {
        this.name = name;                               // set object name = parameter name
        this.phoneNumber = phoneNumber;                 // set object number = parameter number
    }

    // This method gets the persons name
    public String getName()
    {
        return this.name;                               // return persons name
    }

    // This method gets the persons phone number
    public String getPhoneNumber()
    {
        return this.phoneNumber;                        // return persons phone number
    }

    // This method creates a new contact
    public static Contacts createContact (String name, String phoneNumber)
    {
        return new Contacts(name, phoneNumber);         // return new contact
    }
}