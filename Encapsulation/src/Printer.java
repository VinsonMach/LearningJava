// Vinson Mach
// 09/28/2022
// In this program, we learn about encapsulation and do a challenge

// This class is a template for a printer
public class Printer
{
    private int tonerLevel;                         // initialize object toner level
    private int pagesPrinted;                       // initialize object pages printed
    private boolean duplex;                         // initialize object duplex

    // This constructor sets values when called with parameters
    public Printer(int tonerLevel, boolean duplex)
    {
        if (tonerLevel >= 1 && tonerLevel <= 100)
        {
            this.tonerLevel = tonerLevel;           // set object toner level = parameter toner level
        }
        else
        {
            this.tonerLevel = -1;                   // set invalid value
        }
        this.duplex = duplex;                       // set object duplex = parameter duplex
        this.pagesPrinted = 0;                      // set object printed pages = 0
    }

    // This method adds toner to printer
    public int addToner(int tonerAmount)
    {
        if (tonerAmount > 0 && tonerAmount <= 100)
        {
            if (this.tonerLevel + tonerAmount > 100)
            {
                return -1;                          // return invalid toner level
            }
            this.tonerLevel += tonerAmount;         // add toner to total toner
            return this.tonerLevel;                 // return toner level
        }
        else
        {
            return -1;                              // return invalid
        }
    }

    // This method prints pages
    public int printPages(int pages)
    {
        int pagesToPrint = pages;                   // initialize pages to print
        if (this.duplex)
        {
            pagesToPrint = ((pages / 2) + (pages % 2));     // set duplex printing
            System.out.println("Printing in duplex mode");  // print duplex print mode statement
        }
        this.pagesPrinted += pagesToPrint;          // add pages to print to pages printed
        return pagesToPrint;                        // return pages to print
    }

    // This method gets pages printed
    public int getPagesPrinted()
    {
        return this.pagesPrinted;                   // return pages printed
    }
}