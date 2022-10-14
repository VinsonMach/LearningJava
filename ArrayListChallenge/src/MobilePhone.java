// Vinson Mach
// 10/12/2022
// In this program, we do a challenge with array lists

import java.util.ArrayList;

// This class is the template for the contact list on a mobile phone
public class MobilePhone
{
    private String myNumber;                                        // initialize phone number
    private ArrayList<Contacts> myContacts;                         // initialize contact list

    // This constructor sets values when called with parameters
    public MobilePhone(String myNumber)
    {
        this.myNumber = myNumber;                                   // set object number = parameter number
        this.myContacts = new ArrayList<Contacts>();                // set object contacts = parameter contacts
    }

    // This method adds new contact to list
    public boolean addNewContact (Contacts contact)
    {
        if (findContact(contact.getName()) >= 0)
        {
            System.out.println("Contact is already on file.");      // print on file statement
            return false;
        }

        myContacts.add(contact);                                    // call add function and send contact
        return true;                                                // return true
    }

    // This method updates contact in list
    public boolean updateContact (Contacts oldContact, Contacts newContact)
    {
        int foundPosition = findContact(oldContact);                // initialize contact position in list
        if (foundPosition < 0)
        {
            System.out.println(oldContact.getName() + ", was not found.");  // print not found statement
            return false;                                           // return false
        }
        else if (findContact(newContact.getName()) != -1)
        {
            System.out.println("Contact with name " + newContact.getName() +
                    " already exists. Update was not successful."); // print existing contact statement
            return false;                                           // return false
        }

        this.myContacts.set(foundPosition, newContact);             // set new contact name and position
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());   // print updated statement
        return true;                                                // return true
    }

    // This method removes contact from list
    public boolean removeContact (Contacts contacts)
    {
        int foundPosition = findContact(contacts);                  // initialize contact position in list
        if (foundPosition < 0)
        {
            System.out.println(contacts.getName() + ", was not found.");    // print not found statement
            return false;                                           // return false
        }

        this.myContacts.remove(foundPosition);                      // remove contact in list
        System.out.println(contacts.getName() + ", was deleted.");  // print deleted statement
        return true;                                                // return true
    }

    // This method finds contact in list
    private int findContact (Contacts contact)
    {
        return this.myContacts.indexOf(contact);                    // index contact list and return results
    }

    // This method finds contact in list
    private int findContact (String contactName)
    {
        for (int i = 0; i < this.myContacts.size(); i++)
        {
            Contacts contacts = this.myContacts.get(i);             // set contact = contact at position i in list
            if (contacts.getName().equals(contactName))
            {
                return i;                                           // return contact position
            }
        }

        return -1;                                                  // return -1
    }

    // This method queries contact in list
    public String queryContact (Contacts contacts)
    {
        if (findContact(contacts) >= 0)
        {
            return contacts.getName();                              // return contact name
        }

        return null;                                                // return null
    }

    // This method queries contact in list
    public Contacts queryContact (String name)
    {
        int position = findContact(name);                           // initialize contact name
        if (position >= 0)
        {
            return this.myContacts.get(position);                   // return contact position
        }

        return null;                                                // return null
    }

    // This method the contact list
    public void printContacts()
    {
        System.out.println("Contact List: ");                       // print contact list statement
        for (int i = 0; i < this.myContacts.size(); i++)
        {
            System.out.println((i + 1) + ". " + this.myContacts.get(i).getName() +
                                " --> " + this.myContacts.get(i).getPhoneNumber()); // print all contacts in list
        }
    }
}