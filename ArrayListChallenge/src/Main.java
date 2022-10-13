// Vinson Mach
// 10/12/2022
// In this program, we do a challenge with array lists

import java.util.Scanner;

public class Main
{
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");

    public static void main(String[] args)
    {
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit)
        {
            System.out.println("Enter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action)
            {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;

                case 1:
                    mobilePhone.printContacts();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5:
                    queryContact();
                    break;

                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void addNewContact()
    {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contacts newContact = Contacts.createContact(name, phone);
        if (mobilePhone.addNewContact(newContact))
        {
            System.out.println("New contact added: name = " + name + ", phone = " + phone);
        }
        else
        {
            System.out.println("Contact add, " + name + " already on file.");
        }
    }

    private static void updateContact()
    {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null)
        {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contacts newContact = Contacts.createContact(newName, newNumber);
        if (mobilePhone.updateContact(existingContactRecord, newContact))
        {
            System.out.println("Successfully update record.");
        }
        else
        {
            System.out.println("Error updating record.");
        }
    }

    private static void removeContact()
    {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null)
        {
            System.out.println("Contact not found.");
            return;
        }

        if (mobilePhone.removeContact(existingContactRecord))
        {
            System.out.println("Successfully deleted record.");
        }
        else
        {
            System.out.println("Error deleting contact");
        }
    }

    private static void queryContact()
    {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null)
        {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Name: " + existingContactRecord.getName() +
                            " phone number is " + existingContactRecord.getPhoneNumber());
        if (mobilePhone.removeContact(existingContactRecord))
        {
            System.out.println("Successfully deleted record.");
        }
        else
        {
            System.out.println("Error deleting contact");
        }
    }

    private static void startPhone()
    {
        System.out.println("Starting phone...");
    }

    private static void printActions()
    {
        System.out.println("\nAvailable actions: \npress");
        System.out.println("0 - To shutdown\n" + "1 - To print contacts\n" +
                            "2 - To add a new contact\n" + "3 - To update an existing contact\n" +
                            "4 - To remove an existing contact\n" + "5 - To query if an existing contact exists\n" +
                            "6 - To print list of available actions\n");
        System.out.println("Choose your action: ");
    }
}