// Vinson Mach
// 09/26/2022
// In this program, we do an inheritance challenge

// This class is the base class that will be inherited from
public class Vehicle
{
    private String name;                                    // initialize new car name object
    private String size;                                    // initialize new car size object
    private int currentVelocity;                            // initialize new car velocity
    private int currentDirection;                           // initialize new car direction

    // This constructor sets values when called with parameters
    public Vehicle(String name, String size)
    {
        this.name = name;                                   // set object name = parameter name
        this.size = size;                                   // set object size = parameter size
        this.currentVelocity = 0;                           // set object velocity = 0
        this.currentDirection = 0;                          // set object direction = 0
    }

    // This method sets vehicle direction
    public void steer(int direction)
    {
        this.currentDirection += direction;                 // perform addition to vehicle direction
        // print steering statement
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
    }

    // This method sets vehicle movement
    public void move(int velocity, int direction)
    {
        this.currentDirection = direction;                  // set object direction = parameter direction
        this.currentVelocity = velocity;                    // set object velocity = parameter velocity
        // print velocity and direction statement
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
    }

    // This method gets vehicle name
    public String getName()
    {
        return name;                                        // return vehicle name
    }

    // This method sets vehicle name
    public void setName(String name)
    {
        this.name = name;                                   // set object name = parameter name
    }

    // This method gets vehicle name
    public String getSize()
    {
        return size;                                        // return vehicle size
    }

    // This method sets vehicle size
    public void setSize(String size)
    {
        this.size = size;                                   // set object size = parameter size
    }

    // This method gets vehicle velocity
    public int getCurrentVelocity()
    {
        return currentVelocity;                             // return vehicle velocity
    }

    // This method sets vehicle velocity
    public void setCurrentVelocity(int currentVelocity)
    {
        this.currentVelocity = currentVelocity;             // set object velocity = parameter velocity
    }

    // This method gets vehicle direction
    public int getCurrentDirection()
    {
        return currentDirection;                            // return vehicle direction
    }

    // This method sets vehicle direction
    public void setCurrentDirection(int currentDirection)
    {
        this.currentDirection = currentDirection;           // set object direction = parameter direction
    }

    // This method stops the vehicle
    public void stop()
    {
        this.currentVelocity = 0;                           // set vehicle velocity = 0
    }
}
