// Vinson Mach
// 09/24/2022
// In this program, we learn about inheritance

// This class is the general template for animals
public class Animal
{
    private String name;        // initialize instance name
    private int brain;          // initialize instance brain
    private int body;           // initialize instance body
    private int size;           // initialize instance size
    private int weight;         // initialize instance weight

    // This constructor sets instance values when called with parameters
    public Animal(String name, int brain, int body, int size, int weight)
    {
        this.name = name;       // set instance name = parameter name
        this.brain = brain;     // set instance brain = parameter brain
        this.body = body;       // set instance body = parameter body
        this.size = size;       // set instance size = parameter size
        this.weight = weight;   // set instance weight = parameter wight
    }

    // This method prints eat statement
    public void eat()
    {
        // print eat statement
        System.out.println("Animal.eat() called.");
    }

    // This method prints move statement
    public void move(int speed)
    {
        // print move statement
        System.out.println("Animal.move() called. Animal is moving at " + speed);
    }

    // This method gets animal name
    public String getName()
    {
        return name;            // return animal name
    }

    // This method gets animal brain
    public int getBrain()
    {
        return brain;           // return animal brain
    }

    // This method gets animal body
    public int getBody()
    {
        return body;            // return animal body
    }

    // This method gets animal size
    public int getSize()
    {
        return size;            // return animal size
    }

    // This method gets animal weight
    public int getWeight()
    {
        return weight;          // return animal weight
    }
}
