// Vinson Mach
// 10/11/2022
// In this program, we learn about lists and array lists then do a challenge

import java.util.ArrayList;                                                 // initialize array list library
import java.util.Scanner;                                                   // initialize scanner library

public class Main
{
    private static Scanner scanner = new Scanner(System.in);                // initialize scanner variable
    private static GroceryList groceryList = new GroceryList();             // initialize grocery list instance

    public static void main(String[] args)
    {
        boolean quit = false;                                               // initialize quit value to false
        int choice = 0;                                                     // initialize user menu choice value
        printInstructions();                                                // call print instructions method
        while (!quit)
        {
            System.out.println("Enter your choice: ");                      // print enter choice statement
            choice = scanner.nextInt();                                     // get user input
            scanner.nextLine();                                             // clear next line

            switch (choice)
            {
                case 0:
                    printInstructions();                                    // call print instruction method
                    break;

                case 1:
                    groceryList.printGroceryList();                         // call print grocery list method
                    break;

                case 2:
                    addItem();                                              // add item to grocery list
                    break;

                case 3:
                    modifyItem();                                           // modify item in grocery list
                    break;

                case 4:
                    removeItem();                                           // remove item from grocery list
                    break;

                case 5:
                    searchForItem();                                        // search for item on grocery list
                    break;

                case 6:
                    processArrayList();                                     // process array list
                    break;

                case 7:
                    quit = true;                                            // exit application
                    break;
            }
        }
    }

    // This method prints menu options
    public static void printInstructions()
    {
        System.out.println("\nPress 0 - 6 to select menu options:");        // print menu head liner
        System.out.println("\t 0 - To print choice options.");              // print options statement
        System.out.println("\t 1 - To print the list of grocery items.");   // print print list statement
        System.out.println("\t 2 - To add an item to the list.");           // print add item statement
        System.out.println("\t 3 - To modify an item in the list.");        // print modify item statement
        System.out.println("\t 4 - To remove an item in the list.");        // print remove item statement
        System.out.println("\t 5 - To search for an item in the list.");    // print search item statement
        System.out.println("\t 6 - To quit the application.");              // print quit statement
    }

    // This method adds an item to the grocery list
    public static void addItem()
    {
        System.out.println("Please enter the grocery item: ");              // print enter item statement
        groceryList.addGroceryItem(scanner.nextLine());                     // call add item method and send user input
    }

    // This method modifies an item in the grocery list
    public static void modifyItem()
    {
        System.out.println("Current item name: ");                          // print current item statement
        String itemNum = scanner.nextLine();                                // get item number
        System.out.println("Enter replacement item: ");                     // print replacement item statement
        String newItem = scanner.nextLine();                                // get replacement item
        groceryList.modifyGroceryItem(itemNum, newItem);                    // call modify method and send item number and name
    }

    // This method removes an item from the grocery list
    public static void removeItem()
    {
        System.out.println("Enter item name: ");                            // print item name statement
        String itemNum = scanner.nextLine();                                // get item number
        groceryList.removeGroceryItem(itemNum);                             // call remove item method and send item number
    }

    // This method searches for an item in the grocery list
    public static void searchForItem()
    {
        System.out.println("Item to search for: ");                         // print item search statement
        String searchItem = scanner.nextLine();                             // get item name
        if (groceryList.onFile(searchItem))
        {
            System.out.println("Found " + searchItem + " in the grocery list.");    // print item found statement
        }
        else
        {
            System.out.println(searchItem + " is not in the grocery list.");        // print item not found statement
        }
    }

    // This method processes an array list
    public static void processArrayList()
    {
        ArrayList<String> newArray = new ArrayList<String>();               // initialize new string array list
        newArray.addAll(groceryList.getGroceryList());                      // call add method and add all items in list to new list

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());  // initialize new string array list

        String[] myArray = new String[groceryList.getGroceryList().size()]; // initialize new string array list
        myArray = groceryList.getGroceryList().toArray(myArray);            // add items in array list to array list
    }
}