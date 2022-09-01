// Vinson Mach
// 08/31/2022
// In this program, we do a challenge where we print the day of the week with switch cases and if statements

public class Main
{
    public static void main(String[] args)
    {
        printDayOfTheWeek(0);                               // call print method and send day int
        printDayOfTheWeek(1);                               // call print method and send day int
        printDayOfTheWeek(2);                               // call print method and send day int
        printDayOfTheWeek(3);                               // call print method and send day int
        printDayOfTheWeek(4);                               // call print method and send day int
        printDayOfTheWeek(5);                               // call print method and send day int
        printDayOfTheWeek(6);                               // call print method and send day int
        printDayOfTheWeek(7);                               // call print method and send invalid day int
    }

    // This method prints what day it is depending on int value passed
    private static void printDayOfTheWeek (int day)
    {
        switch (day)
        {
            case 0:
                System.out.println("Sunday");               // print sunday if value is 0
                break;

            case 1:
                System.out.println("Monday");               // print monday if value is 1
                break;

            case 2:
                System.out.println("Tuesday");              // print tuesday if value is 2
                break;

            case 3:
                System.out.println("Wednesday");            // print wednesday if value is 3
                break;

            case 4:
                System.out.println("Thursday");             // print thursday if value is 4
                break;

            case 5:
                System.out.println("Friday");               // print friday if value is 5
                break;

            case 6:
                System.out.println("Saturday");             // print saturday if value is 6
                break;

            default:
                System.out.println("Invalid day");          // print invalid if value is out of bounds
                break;
        }

        if (day == 0)
        {
            System.out.println("Sunday");                   // print sunday if value is 0
        }
        else if (day == 1)
        {
            System.out.println("Monday");                   // print monday if value is 1
        }
        else if (day == 2)
        {
            System.out.println("Tuesday");                  // print tuesday if value is 2
        }
        else if (day == 3)
        {
            System.out.println("Wednesday");                // print wednesday if value is 3
        }
        else if (day == 4)
        {
            System.out.println("Thursday");                 // print thursday if value is 4
        }
        else if (day == 5)
        {
            System.out.println("Friday");                   // print friday if value is 5
        }
        else if (day == 6)
        {
            System.out.println("Saturday");                 // print saturday if value is 6
        }
        else
        {
            System.out.println("Invalid day");              // print invalid if value is out of bounds
        }
    }
}