// Vinson Mach
// 09/27/2022
// In this program, we learn about composition and do a challenge

// Inheritance has a "is a" relationship with its objects --> Car is a vehicle
// Inheritance: To design a class based on what it is

// Composition has a "has a" relationship with its objects --> Car has a steering wheel
// Composition: To design a class based on what it does

public class Main
{
    public static void main(String[] args)
    {
        // initialize instance and call constructors with parameters
        Dimensions dimensions = new Dimensions(20, 20, 5);
        // initialize instance and call constructors with parameters
        Case theCase = new Case("220B", "Dell", "240", dimensions);
        // initialize instance and call constructors with parameters
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
        // initialize instance and call constructors with parameters
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
        // initialize instance and call constructors with parameters
        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        thePC.powerUp();                            // call power up method

        Wall wall1 = new Wall("West");      // initialize instance and call constructors with parameters
        Wall wall2 = new Wall("East");      // initialize instance and call constructors with parameters
        Wall wall3 = new Wall("South");     // initialize instance and call constructors with parameters
        Wall wall4 = new Wall("North");     // initialize instance and call constructors with parameters

        // initialize instance and call constructors with parameters
        Ceiling ceiling = new Ceiling(12, 55);
        // initialize instance and call constructors with parameters
        Bed bed = new Bed("Modern", 4, 3, 2, 1);
        // initialize instance and call constructors with parameters
        Lamp lamp = new Lamp("Classic", false, 75);
        // initialize instance and call constructors with parameters
        Bedroom bedroom = new Bedroom("Tims", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        bedroom.makeBed();                          // call make bed method
        bedroom.getLamp().turnOn();                 // call get lamp and turn on methods


//        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
//        thePC.getMotherboard().loadProgram("Windows 1.0");
//        thePC.getTheCase().pressPowerButton();
    }
}