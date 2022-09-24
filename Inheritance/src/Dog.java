// Vinson Mach
// 09/24/2022
// In this program, we learn about inheritance

// The keyword super calls the constructor from the class that this class is extending from

// This class is the template for dogs and inherits properties from Animal
public class Dog extends Animal
{
    private int eyes;       // initialize instance eyes
    private int legs;       // initialize instance legs
    private int tail;       // initialize instance tail
    private int teeth;      // initialize instance teeth
    private String coat;    // initialize instance coat

    // This constructor sets instance values when called with parameters
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat)
    {
        // call animal constructor with some values and default values, dog will always have a body and brain
        super(name, 1, 1, size, weight);
        this.eyes = eyes;       // set instance eyes = parameter eyes
        this.legs = legs;       // set instance legs = parameter legs
        this.tail = tail;       // set instance tail = parameter tail
        this.teeth = teeth;     // set instance teeth = parameter teeth
        this.coat = coat;       // set instance coat = parameter coat
    }

    // This method prints chew statement
    private void chew()
    {
        // print chew statement
        System.out.println("Dog.chew() called");
    }

    // This method is overridden from the Animal class and call other methods
    @Override
    public void eat()
    {
        // print eat statement
        System.out.println("Dog.eat() called");
        chew();                 // call chew method
        super.eat();            // call eat method from animal
    }

    // This method call other methods and prints walk statement
    public void walk()
    {
        // print walk statement
        System.out.println("Dog.walk() called");
        move(5);            // call move method with walk speed
    }

    // This method calls other methods and prints run statement
    public void run()
    {
        // print run statement
        System.out.println("Dog.run() called");
        move(10);           // call run method with run speed
    }

    // This method prints move legs statement
    private void moveLegs(int speed)
    {
        // print move leg statement
        System.out.println("Dog.moveLegs() called");
    }

    // This method is overridden from the Animal class and calls other methods
    @Override
    public void move(int speed)
    {
        // print move statement
        System.out.println("Dog.move() called");
        moveLegs(speed);            // call moveLeg method with leg speed
        super.move(speed);          // call move method from Animal class with movement speed
    }
}