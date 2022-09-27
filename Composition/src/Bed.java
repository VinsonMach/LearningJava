// Vinson Mach
// 09/27/2022
// In this program, we learn about composition and do a challenge

// This class is a template for the attributes of a bed
public class Bed
{
    private String style;                       // initialize object style
    private int pillows;                        // initialize object pillows
    private int height;                         // initialize object height
    private int sheets;                         // initialize object sheets
    private int quilt;                          // initialize object quilt

    // This constructor sets values when called with parameters
    public Bed(String style, int pillows, int height, int sheets, int quilt)
    {
        this.style = style;                     // set object style = parameter style
        this.pillows = pillows;                 // set object pillows = parameter pillows
        this.height = height;                   // set object height = parameter height
        this.sheets = sheets;                   // set object sheets = parameter sheets
        this.quilt = quilt;                     // set object quilt = parameter quilt
    }

    // This method makes the bed
    public void make()
    {
        System.out.println("Bed -> Making");    // print bed making statement
    }

    // This method gets bed style
    public String getStyle()
    {
        return this.style;                       // return bed style
    }

    // This method gets bed style
    public int getPillows()
    {
        return this.pillows;                     // return bed pillows
    }

    // This method gets bed height
    public int getHeight()
    {
        return this.height;                      // return bed height
    }

    // This method gets bedsheets
    public int getSheets()
    {
        return this.sheets;                      // return bedsheets
    }

    // This method gets bed quilts
    public int getQuilt()
    {
        return this.quilt;                       // return bed quilts
    }
}