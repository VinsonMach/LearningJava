// Vinson Mach
// 08/31/2022
// In this program, we learn about switch statements and do a challenge with switch statements

public class Main
{
    public static void main(String[] args)
    {
        int value = 2;                                          // pseudo switch case value
        if (value == 1)                                         // switch cases using if statements
        {
            System.out.println("Value was 1");                  // print 1 if pseudo switch value was 1
        }
        else if (value == 2)
        {
            System.out.println("Value was 2");                  // print 2 if pseudo switch value was 2
        }
        else
        {
            System.out.println("Value was not 1 or 2");         // print neither if pseudo switch value isnt 1 or 2
        }

        int switchValue = 3;                                    // actual switch case value
        switch(switchValue)                                     // switch case with int switch case value
        {
            case 1:
                System.out.println("Value was 1");              // print 1 if switch case is 1
                break;

            case 2:
                System.out.println("Value was 2");              // print 2 if switch case is 2
                break;

            case 3: case 4: case 5:
                System.out.println("Value was 3, 4, or 5");     // print 3, 4, or 5 if switch case is 3, 4, or 5
                break;

            default:
                System.out.println("Value was not 1, 2, 3, 4, or 5");   // print default statement if switch not found
                break;
        }

        char charSwitch = 'A';                                  // char switch case value
        switch (charSwitch)                                     // switch case with char switch case value
        {
            case 'A':
                System.out.println("Char was A");               // print A if switch case is A
                break;

            case 'B':
                System.out.println("Char was B");               // print B if switch case is B
                break;

            case 'C': case 'D': case 'E':
                System.out.println("Char was " + charSwitch);   // print switch if switch case was C, D, or E
                break;

            default:
                System.out.println("CHAR NOT FOUND");           // print default statement if value not found
                break;
        }

        String month = "JANUARY";                               // string switch case value
        switch (month.toLowerCase())                            // switch case with forced lower case string switch case value
        {
            case "january":
                System.out.println("Jan");                      // print jan if switch case is january
                break;

            case "JUNe":
                System.out.println("Jun");                      // print jun if switch case is june
                break;

            default:
                System.out.println("Not sure");                 // print default statement
                break;
        }
    }
}