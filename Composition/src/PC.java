// Vinson Mach
// 09/27/2022
// In this program, we learn about composition and do a challenge

// This class is the template for the attributes of a PC setup
public class PC
{
    private Case theCase;                                       // initialize instance theCase
    private Monitor monitor;                                    // initialize instance monitor
    private Motherboard motherboard;                            // initialize instance motherboard

    // This constructor sets values when called with parameters
    public PC(Case theCase, Monitor monitor, Motherboard motherboard)
    {
        this.theCase = theCase;                                 // set instance case = parameter case
        this.monitor = monitor;                                 // set instance monitor = parameter monitor
        this.motherboard = motherboard;                         // set instance motherboard = parameter motherboard
    }

    // This method powers up the PC
    public void powerUp()
    {
        theCase.pressPowerButton();                             // call power button method
        drawLogo();                                             // call draw logo method
    }

    // This method draws a logo
    private void drawLogo()
    {
        monitor.drawPixelAt(1200, 50, "Yellow");    // call draw art and send parameters
    }

/*    private Case getTheCase() {
        return this.theCase;
    }

    private Monitor getMonitor() {
        return this.monitor;
    }

    private Motherboard getMotherboard() {
        return this.motherboard;
    }*/
}