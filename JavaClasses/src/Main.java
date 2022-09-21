// Vinson Mach
// 09/21/2022
// In this program, we learn about java classes, setter and getter functions
// Classes are like blueprints/templates

public class Main
{
    public static void main(String[] args)
    {
        Car porsche = new Car();                                // initialize new car object
        Car holden = new Car();                                 // initialize new car object

        porsche.setModel("Carrera");                            // set porsche car model
        System.out.println("Model is " + porsche.getModel());   // print porsche model
    }
}