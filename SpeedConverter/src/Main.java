// Vinson Mach
// 08/26/2022
// In this program, we do a challenge where we convert kmh to mph

public class Main
{
    public static void main(String[] args)
    {
        double miles = SpeedConverter.toMilesPerHour(10.5);  // mile variable that gets converted to kmh
        System.out.println("Miles = " + miles);                            // print kmh

        SpeedConverter.printConversion(10.5);               // print converted value
    }
}