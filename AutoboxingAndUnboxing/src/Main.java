// Vinson Mach
// 11/14/2022
// In this program, we learn about autoboxing and unboxing

import java.util.ArrayList;

// This class
class IntClass
{
    private int myValue;                        // initialize new int class variable

    // This constructor sets class values with parameter
    public IntClass(int myValue)
    {
        this.myValue = myValue;                 // set variable myValue = parameter myValue
    }

    // This method gets myValue
    public int getMyValue()
    {
        return this.myValue;                    // return myValue
    }

    // This method sets myValue
    public void setMyValue(int myValue)
    {
        this.myValue = myValue;                 // set myValue = parameter myValue
    }
}

public class Main
{
    public static void main(String[] args)
    {
        String[] strArray = new String[10];                                     // initialize string array
        int[] intArray = new int[10];                                           // initialize int array

        ArrayList<String> strArrayList = new ArrayList<String>();               // initialize string arraylist
        strArrayList.add("Tim");                                                // add "Tim" to string arraylist

        //ArrayList<int> intArrayList = new ArrayList<int>();                   // try to initialize int arraylist
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();      // initialize IntClass arraylist
        intClassArrayList.add(new IntClass(54));                        // add new IntClass value to IntClass arraylist

        Integer integer = new Integer(54);                                  // initialize new Integer variable
        Double doubleValue = new Double(12.25);                             // initialize new Double variable

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();             // initialize Integer arraylist
        for (int i = 0; i <= 10; i++)
        {
            intArrayList.add(Integer.valueOf(i));                               // add value of i to Integer arraylist
        }

        for (int i = 0; i <= 10; i++)
        {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());   // print contents of arraylist
        }

        Integer myIntValue = 56;                // Integer.valueOf(56);         // initialize new Integer variable
        int myInt = myIntValue.intValue();      // myIntValue.intValue();       // initialize new int variable

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();             // initialize Double arraylist
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5)
        {
            myDoubleValues.add(Double.valueOf(dbl));                            // add valueOf dbl to Double arraylist // myDoubleValues.add(dbl); also works
        }

        for (int i = 0; i < myDoubleValues.size(); i++)
        {
            double value = myDoubleValues.get(i).doubleValue();                 // initialize double variable // double value = myDoubleValues.get(i); also works
            System.out.println(i + " --> " + value);                            // print contents of arraylist
        }
    }
}