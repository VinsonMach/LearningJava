// Vinson Mach
// 09/26/2022
// In this program, we do an inheritance challenge

// This class inherits from the base class and will be inherited from by a child class
public class Car extends Vehicle
{
    private int wheels;                     // initialize new car wheel object
    private int doors;                      // initialize new car door object
    private int gears;                      // initialize new car gears object
    private boolean isManual;               // initialize new car transmission object
    private int currentGear;                // initialize new car gear object

    // This constructor sets values when called with parameters
    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual)
    {
        super(name, size);                  // call vehicle constructor and send parameters
        this.wheels = wheels;               // set object wheel = parameter wheel
        this.doors = doors;                 // set object doors = parameter doors
        this.gears = gears;                 // set object gears = parameter gears
        this.isManual = isManual;           // set object transmission = parameter transmission
        this.currentGear = 1;               // set object wheel = 1
    }

    // This method changes vehicle gears
    public void changeGear(int currentGear)
    {
        this.currentGear = currentGear;     // set object gear = parameter gear
        // print gear changed statement
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    // This method changes vehicle velocity
    public void changeVelocity(int speed, int direction)
    {
        move(speed, direction);             // call vehicle move method and send parameters
        // print velocity and direction statement
        System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
    }

    // This overridden method calls method from other class
    @Override
    public void stop()
    {
        super.stop();                       // call stop method from other method
    }
}
