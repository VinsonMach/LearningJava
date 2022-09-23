// Vinson Mach
// 09/22/2022
// In this program, we do a challenge where we calculate the area of a wall with height and width

public class Main
{
    public static void main(String[] args)
    {
        Wall wall = new Wall(5, 4);             // call wall constructor and send wall parameters
        System.out.println("Area = " + wall.getArea());     // call getter method and print results
        wall.setHeight(-1.5);                               // call setter method and send invalid parameter
        System.out.println("Width = " + wall.getWidth());   // call getter method and print results
        System.out.println("Height = " + wall.getHeight()); // call getter method and print results
        System.out.println("Area = " + wall.getArea());     // call getter method and print results
    }
}