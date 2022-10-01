// Vinson Mach
// 09/30/2022
// In this program, we learn about polymorphism and do a challenge

// This class is the base car template to be inherited from later
class Car
{
    private boolean engine;                 // initialize object engine
    private int cylinders;                  // initialize object cylinders
    private String name;                    // initialize object name
    private int wheels;                     // initialize object wheels

    // This constructor sets values when called with parameters
    public Car(int cylinders, String name)
    {
        this.cylinders = cylinders;         // set object cylinder = parameter cylinder
        this.name = name;                   // set object name = parameter name
        this.wheels = 4;                    // set object wheel = 4
        this.engine = true;                 // set object engine = true
    }

    // This method gets car cylinders
    public int getCylinders()
    {
        return cylinders;                   // return car cylinder
    }

    // This method gets car name
    public String getName()
    {
        return name;                        // return car name
    }

    // This method starts car engine
    public String startEngine()
    {
        return "Car -> startEngine()";      // return start statement
    }

    // This method accelerates car
    public String accelerate()
    {
        return "Car -> accelerate()";       // return accelerate statement
    }

    // This method brakes car
    public String brake()
    {
        return "Car -> brake()";            // return brake statement
    }
}

// This class is the template for the mitsubishi brand
class Mitsubishi extends Car
{
    // This constructor sets values when called with parameters
    public Mitsubishi(int cylinders, String name)
    {
        super(cylinders, name);
    }

    // This method starts car engine
    @Override
    public String startEngine()
    {
        return "Mitsubishi -> startEngine()";// return start statement
    }

    // This method accelerates car
    @Override
    public String accelerate()
    {
        return "Mitsubishi -> accelerate()";// return accelerate statement
    }

    // This method brakes car
    @Override
    public String brake()
    {
        return "Mitsubishi -> brake()";     // return brake statement
    }
}

// This class is the template for the ford brand
class Ford extends Car
{
    // This constructor sets values when called with parameters
    public Ford(int cylinders, String name)
    {
        super(cylinders, name);
    }

    // This method starts car engine
    @Override
    public String startEngine()
    {
        return "Ford -> startEngine()";         // return start statement
    }

    // This method accelerates car
    @Override
    public String accelerate()
    {
        return "Ford -> accelerate()";          // return accelerate statement
    }

    // This method brakes car
    @Override
    public String brake()
    {
        return "Ford -> brake()";               // return brake statement
    }
}

// This class is the template for the holden brand
class Holden extends Car
{
    // This constructor sets values when called with parameters
    public Holden(int cylinders, String name)
    {
        super(cylinders, name);
    }

    // This method starts car engine
    @Override
    public String startEngine()
    {
        return getClass().getSimpleName() + " -> startEngine()";    // return start statement
    }

    // This method accelerates car
    @Override
    public String accelerate()
    {
        return getClass().getSimpleName() + " -> accelerate()";     // return accelerate statement
    }

    // This method brakes car
    @Override
    public String brake()
    {
        return getClass().getSimpleName() + " -> brake()";          // return brake statement
    }
}

// This class is the base movie template to be inherited from later
class Movie
{
    private String name;                    // initialize object name

    // This constructor sets values when called with parameters
    public Movie(String name)
    {
        this.name = name;                   // set object name = parameter name
    }

    // This method gets movie plot
    public String plot()
    {
        return "No plot here";              // return plot statement
    }

    // This method gets movie name
    public String getName()
    {
        return name;                        // return movie name
    }
}

// This class has the attributes for the Jaws movie and inherits from the movie class
class Jaws extends Movie
{
    // This constructor sets movie name with parent constructor
    public Jaws()
    {
        super("Jaws");                 // set jaws movie name
    }

    // This method sets movie plot
    public String plot()
    {
        return "A shark eats lots of people";   // return movie plot
    }
}

// This class has the attributes for the independence day movie and inherits from the movie class
class IndependenceDay extends Movie
{
    // This constructor sets movie name with parent constructor
    public IndependenceDay()
    {
        super("Independence Day");      // set independence day movie name
    }

    // This method sets movie plot
    @Override
    public String plot()
    {
        return "Aliens attempt to take over planet Earth";  // return movie plot
    }
}

// This class has the attributes for the maze runner movie and inherits from the movie class
class MazeRunner extends Movie
{
    // This constructor sets movie name with parent constructor
    public MazeRunner()
    {
        super("Maze Runner");           // set maze runner movie name
    }

    // This method sets movie plot
    @Override
    public String plot()
    {
        return "Kids try and escape a maze";    // return movie plot
    }
}

// This class has the attributes for the star wars movie and inherits from the movie class
class StarWars extends Movie
{
    // This constructor sets movie name with parent constructor
    public StarWars()
    {
        super("Star Wars");             // set star wars movie name
    }

    // This method sets movie plot
    @Override
    public String plot()
    {
        return "Imperial Forces try to take over the universe"; // return movie plot
    }
}

// This class has the attributes for the forgettable movie and inherits from the movie class
class Forgettable extends Movie
{
    // This constructor sets movie name with parent constructor
    public Forgettable()
    {
        super("Forgettable");           // set forgettable movie name
    }

    // no plot method
}

public class Main
{
    public static void main(String[] args)
    {
        for (int i = 1; i < 11; i++)
        {
            Movie movie = randomMovie();    // initialize instance movie and call random movie
            // print movie and plot statement
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" +
                                "Plot: " + movie.plot() + "\n");
        }

        Car car = new Car(8, "Base car");                   // initialize instance car and send parameters
        System.out.println(car.startEngine());                              // print results from start engine method
        System.out.println(car.accelerate());                               // print results from start accelerate method
        System.out.println(car.brake());                                    // print results from start brake method

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRW 4WD"); // initialize instance car and send parameters
        System.out.println(mitsubishi.startEngine());                                   // print results from start engine method
        System.out.println(mitsubishi.accelerate());                                    // print results from start accelerate method
        System.out.println(mitsubishi.brake());                                         // print results from start brake method

        Ford ford = new Ford(6, "Ford Falcon");             // initialize instance car and send parameters
        System.out.println(ford.startEngine());                             // print results from start engine method
        System.out.println(ford.accelerate());                              // print results from start accelerate method
        System.out.println(ford.brake());                                   // print results from start brake method

        Holden holden = new Holden(6, "Holden Commodore");  // initialize instance car and send parameters
        System.out.println(holden.startEngine());                           // print results from start engine method
        System.out.println(holden.accelerate());                            // print results from start accelerate method
        System.out.println(holden.brake());                                 // print results from start brake method
    }

    // This method randomizes movies
    public static Movie randomMovie()
    {
        int randomNumber = (int) (Math.random() * 5) + 1;                   // initialize and generate random number
        System.out.println("Random number generated was: " + randomNumber); // print rng statement
        switch (randomNumber)
        {
            case 1:
                return new Jaws();                                          // return jaws movie

            case 2:
                return new IndependenceDay();                               // return independence movie

            case 3:
                return new MazeRunner();                                    // return maze movie

            case 4:
                return new StarWars();                                      // return star wars movie

            case 5:
                return new Forgettable();                                   // return forgettable movie
        }

        return null;                                                        // return null
    }
}