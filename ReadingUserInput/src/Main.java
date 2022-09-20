// Vinson Mach
// 09/20/2022
// In this program, we learn about reading user inputs with Scanner library

import java.util.Scanner;                                           // library that allows us to take user input

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);                   // initialize scanner

        System.out.println("Enter your year of birth: ");           // ask user for their birth year
        boolean hasNextInt = scanner.hasNextInt();                  // integer validation boolean

        if (hasNextInt)
        {
            int yearOfBirth = scanner.nextInt();                    // take user's birth year
            scanner.nextLine();                                     // handle next line character --> enter key
            System.out.println("Enter your name: ");                // ask user for their name
            String name = scanner.nextLine();                       // take user's name
            int age = 2022 - yearOfBirth;                           // calculate approximate age

            if (age >= 0 && age <= 100)
            {
                // print user's name and age statement
                System.out.println("Your name is " + name + ", and you are " + age + " years old");
            }
            else
            {
                System.out.println("Error: Invalid Birth Year");    // print error statement
            }
        }
        else
        {
            System.out.println("Error: Unable to parse year of birth"); // print error statement
        }

        scanner.close();                                            // close scanner to free memory
    }
}