// Vinson Mach
// 10/12/2022
// In this program, we do a challenge with array lists

import java.util.Scanner;                                                           // import scanner library

public class Main
{
    private static Scanner scanner = new Scanner(System.in);                        // initialize new scanner object
    private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");  // initialize new mobile phone object

    public static void main(String[] args)
    {
        boolean quit = false;                                                       // initialize quit value
        startPhone();                                                               // call start phone method
        printActions();                                                             // call print menu action method
        while (!quit)
        {
            System.out.println("Enter action: (6 to show available actions)");      // print enter action statement
            int action = scanner.nextInt();                                         // initialize and get user input
            scanner.nextLine();                                                     // clear next line

            switch (action)
            {
                case 0:
                    System.out.println("\nShutting down...");                       // print quit statement
                    quit = true;                                                    // set quit value = true
                    break;

                case 1:
                    mobilePhone.printContacts();                                    // call print contact method
                    break;

                case 2:
                    addNewContact();                                                // call add contact method
                    break;

                case 3:
                    updateContact();                                                // call update contact method
                    break;

                case 4:
                    removeContact();                                                // call remove contact method
                    break;

                case 5:
                    queryContact();                                                 // call query contact method
                    break;

                case 6:
                    printActions();                                                 // call print actions method
                    break;
            }
        }
    }

    // This method adds new contact to list
    private static void addNewContact()
    {
        System.out.println("Enter new contact name: ");                             // print enter contact statement
        String name = scanner.nextLine();                                           // get user input
        System.out.println("Enter phone number: ");                                 // print enter number statement
        String phone = scanner.nextLine();                                          // get user input
        Contacts newContact = Contacts.createContact(name, phone);                  // call create contact method and send name and phone
        if (mobilePhone.addNewContact(newContact))
        {
            System.out.println("New contact added: name = " + name + ", phone = " + phone); // print contact added statement
        }
        else
        {
            System.out.println("Contact add, " + name + " already on file.");       // print contact on file statement
        }
    }

    // This method updates contact on list
    private static void updateContact()
    {
        System.out.println("Enter existing contact name: ");                        // print enter contact statement
        String name = scanner.nextLine();                                           // get user input
        Contacts existingContactRecord = mobilePhone.queryContact(name);            // call query contact method and send name
        if (existingContactRecord == null)
        {
            System.out.println("Contact not found.");                               // print not found statement
            return;
        }

        System.out.println("Enter new contact name: ");                             // print enter contact statement
        String newName = scanner.nextLine();                                        // get user input
        System.out.println("Enter new contact phone number: ");                     // print enter number statement
        String newNumber = scanner.nextLine();                                      // get user input
        Contacts newContact = Contacts.createContact(newName, newNumber);           // call create contact method and send name and phone
        if (mobilePhone.updateContact(existingContactRecord, newContact))
        {
            System.out.println("Successfully update record.");                      // print successful update statement
        }
        else
        {
            System.out.println("Error updating record.");                           // print error update statement
        }
    }

    // This method removes contact from list
    private static void removeContact()
    {
        System.out.println("Enter existing contact name: ");                        // print enter contact statement
        String name = scanner.nextLine();                                           // get user input
        Contacts existingContactRecord = mobilePhone.queryContact(name);            // call query contact method and send name
        if (existingContactRecord == null)
        {
            System.out.println("Contact not found.");                               // print not found statement
            return;
        }

        if (mobilePhone.removeContact(existingContactRecord))
        {
            System.out.println("Successfully deleted record.");                     // print deleted statement
        }
        else
        {
            System.out.println("Error deleting contact");                           // print error delete statement
        }
    }

    // This method queries contact in list
    private static void queryContact()
    {
        System.out.println("Enter existing contact name: ");                        // print enter contact statement
        String name = scanner.nextLine();                                           // get user input
        Contacts existingContactRecord = mobilePhone.queryContact(name);            // call existing contact method and send name
        if (existingContactRecord == null)
        {
            System.out.println("Contact not found.");                               // print not found statement
            return;
        }

        System.out.println("Name: " + existingContactRecord.getName() +
                            " phone number is " + existingContactRecord.getPhoneNumber());  // print name and number statement
    }

    // This method starts the mobile phone
    private static void startPhone()
    {
        System.out.println("Starting phone...");                                    // print start phone statement
    }

    // This method prints menu actions
    private static void printActions()
    {
        System.out.println("\nAvailable actions: \npress");                         // print available action statements
        System.out.println("0 - To shutdown\n" + "1 - To print contacts\n" +
                            "2 - To add a new contact\n" + "3 - To update an existing contact\n" +
                            "4 - To remove an existing contact\n" + "5 - To query if an existing contact exists\n" +
                            "6 - To print list of available actions\n");            // print actions statements
        System.out.println("Choose your action: ");                                 // print choose action statement
    }
}