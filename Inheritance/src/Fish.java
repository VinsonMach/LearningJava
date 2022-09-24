// Vinson Mach
// 09/24/2022
// In this program, we learn about inheritance

// This class is the template for fish and inherits properties from Animal
public class Fish extends Animal
{
    private int gills;      // initialize instance gills
    private int eyes;       // initialize instance eyes
    private int fins;       // initialize instance fins

    // This constructor sets instance values when called with parameters
    public Fish(String name, int size, int weight, int gills, int eyes, int fins)
    {
        // call animal constructor with some values and default values
        super(name, 1, 1, size, weight);
        this.gills = gills; // set instance gills = parameter gills
        this.eyes = eyes;   // set instance eyes = parameter eyes
        this.fins = fins;   // set instance fins = parameter fins
    }

    // This empty method sets the fish's sleep state
    private void rest()
    {

    }

    // This empty method moves the fish's muscles
    private void moveMuscles()
    {

    }

    // This empty method moves the fish's back fin
    private void moveBackFin()
    {

    }

    // This method calls other methods
    private void swim(int speed)
    {
        moveMuscles();      // call moveMuscles
        moveBackFin();      // call moveBackFin
        super.move(speed);  // call move method from Animal

    }
}
