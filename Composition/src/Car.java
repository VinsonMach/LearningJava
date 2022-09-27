// Vinson Mach
// 09/27/2022
// In this program, we learn about composition and do a challenge

public class Car extends Vehicle
{
    private int doors;
    private int engineCapacity;

    public Car(String name, int doors, int engineCapacity)
    {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
