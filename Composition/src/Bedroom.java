// Vinson Mach
// 09/27/2022
// In this program, we learn about composition and do a challenge

// This class is a template for the attributes of a bedroom
public class Bedroom
{
    private String name;                                    // initialize new object name
    private Wall wall1;                                     // initialize new instance wall 1
    private Wall wall2;                                     // initialize new instance wall 2
    private Wall wall3;                                     // initialize new instance wall 3
    private Wall wall4;                                     // initialize new instance wall 4
    private Ceiling ceiling;                                // initialize new instance ceiling
    private Bed bed;                                        // initialize new instance bed
    private Lamp lamp;                                      // initialize new instance lamp

    // This constructor sets values when called with parameters
    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp)
    {
        this.name = name;                                   // set object name = parameter name
        this.wall1 = wall1;                                 // set instance wall1 = parameter wall1
        this.wall2 = wall2;                                 // set instance wall2 = parameter wall2
        this.wall3 = wall3;                                 // set instance wall3 = parameter wall3
        this.wall4 = wall4;                                 // set instance wall4 = parameter wall4
        this.ceiling = ceiling;                             // set instance ceiling = parameter ceiling
        this.bed = bed;                                     // set instance bed = parameter bed
        this.lamp = lamp;                                   // set instance lamp = parameter lamp
    }

    // This method gets lamp
    public Lamp getLamp()
    {
        return this.lamp;                                   // return lamp
    }

    // This method makes the bed
    public void makeBed()
    {
        System.out.println("Bedroom --> Making bed");       // print bed making statement
        bed.make();                                         // call make method
    }
}