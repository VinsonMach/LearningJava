// Vinson Mach
// 10/11/2022
// In this program, we learn about lists and array lists then do a challenge

import java.util.ArrayList;                                                 // initialize array list library

// This class is the template for a grocery list
public class GroceryList
{
    private ArrayList<String> groceryList = new ArrayList<String>();        // initialize new string array list

    // This method adds items to the grocery list
    public void addGroceryItem (String item)
    {
        groceryList.add(item);                                              // call array list function and add item
    }

    // This constructor gets the grocery list
    public ArrayList<String> getGroceryList()
    {
        return groceryList;                                                 // return grocery list
    }

    // This method prints the contents of the gorcery list
    public void printGroceryList()
    {
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");  // print list size statement
        for (int i = 0; i < groceryList.size(); i++)
        {
            System.out.println((i + 1) + ". " + groceryList.get(i));        // print items in list
        }
    }

    // This method modifies items in the grocery list
    public void modifyGroceryItem (String currentItem, String newItem)
    {
        int position = findItem(currentItem);                               // initialize item position
        if (position >= 0)
        {
            modifyGroceryItem(position, newItem);                           // call modify method and send position and name
        }
    }

    // This method modifies items in the grocery list
    private void modifyGroceryItem (int position, String newItem)
    {
        groceryList.set(position, newItem);                                 // call set function and send position and name
        System.out.println("Grocery Item " + (position + 1) + " has been modified.");   // print modify statement
    }

    // This method removes items in the grocery list
    public void removeGroceryItem (String item)
    {
        int position = findItem(item);                                      // initialize item position
        if (position >= 0)
        {
            removeGroceryItem(position);                                    // call remove method and send position
        }
    }

    // This method removes items in the grocery list
    private void removeGroceryItem (int position)
    {
        groceryList.remove(position);                                       // call remove method and send position
    }

    // This method finds items in the grocery list
    private int findItem (String searchItem)
    {
        return groceryList.indexOf(searchItem);                             // call index function and send item name
    }

    // This method checks if items are on the grocery list
    public boolean onFile (String searchItem)
    {
        int position = findItem(searchItem);                                // initialize item position
        if (position >= 0)
        {
            return true;                                                    // return true
        }

        return false;                                                       // return false
    }
}