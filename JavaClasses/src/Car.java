// Vinson Mach
// 09/21/2022
// In this program, we learn about java classes, setter and getter functions
// Classes are like blueprints/templates

// This class sets the car attribute template
public class Car
{
    private int doors;                                  // initialize number of doors a car has
    private int wheels;                                 // initialize number of wheels a car has
    private String model;                               // initialize car model
    private String engine;                              // initialize engine car has
    private String colour;                              // initialize color of car

    // This method sets the car model to the class object
    public void setModel(String model)
    {
        String validModel = model.toLowerCase();        // make model string lowercase
        if (validModel.equals("carrera") || validModel.equals("commodore"))
        {
            this.model = model;                         // set class model = parameter model
        }
        else
        {
            this.model = "Unknown";                     // set class model = unknown
        }
    }

    // This method gets the car model from the class object
    public String getModel()
    {
        return this.model;                              // return car model
    }
}
