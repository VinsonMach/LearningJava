// Vinson Mach
// 09/26/2022
// In this program, we do an inheritance challenge

public class Main extends Object
{
    public static void main(String[] args)
    {
        Outlander outlander = new Outlander(36);    // initialize new instance and send parameter
        outlander.steer(45);                                // Call steer method and set direction
        outlander.accelerate(30);                                   // call acceleration method and send speed
        outlander.accelerate(20);                                   // call acceleration method and send speed
        outlander.accelerate(-42);                                  // call acceleration method and send speed
    }
}