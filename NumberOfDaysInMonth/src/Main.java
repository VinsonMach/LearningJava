// Vinson Mach
// 08/31/2022
// In this program, we do a challenge where we check if a year is a leap year and how many days a month has

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(13, 2020));       // call checker method and send invalid values
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(8, 2020));        // call checker method and send valid values
    }
}