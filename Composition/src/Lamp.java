// Vinson Mach
// 09/27/2022
// In this program, we learn about composition and do a challenge

// This class is a template for the attributes of a lamp
public class Lamp
{
    private String style;                           // initialize object style
    private boolean battery;                        // initialize object battery
    private int globRating;                         // initialize object rating

    // This constructor sets values when called with parameters
    public Lamp(String style, boolean battery, int globRating)
    {
        this.style = style;                         // set object style = parameter style
        this.battery = battery;                     // set object battery = parameter battery
        this.globRating = globRating;               // set object rating = parameter rating
    }

    // This method turns on the lamp
    public void turnOn()
    {
        System.out.println("Lamp --> Turning On");  // print turn on statement
    }

    // This method gets lamp style
    public String getStyle()
    {
        return this.style;                           // return lamp style
    }

    // This method gets lamp battery
    public boolean isBattery()
    {
        return this.battery;                          // return lamp battery
    }

    // This method gets lamp rating
    public int getGlobRating()
    {
        return this.globRating;                       // return lamp rating
    }
}