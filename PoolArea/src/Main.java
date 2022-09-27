// Vinson Mach
// 09/26/2022
// In this program, we do a challenge where we get the volume of a pool

public class Main
{
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle(5, 10);             // initialize new instance and call constructor with parameters
        System.out.println("Rectangle.width = " + rectangle.getWidth());    // call width method and print results
        System.out.println("Rectangle.length = " + rectangle.getLength());  // call length method and print results
        System.out.println("Rectangle.area = " + rectangle.getArea());      // call area method and print results
        Cuboid cuboid = new Cuboid(5,10,5);               // initialize new instance and call constructor with parameters
        System.out.println("Cuboid.width = " + cuboid.getWidth());          // call width method and print results
        System.out.println("Cuboid.length = " + cuboid.getLength());        // call length method and print results
        System.out.println("Cuboid.area = " + cuboid.getArea());            // call area method and print results
        System.out.println("Cuboid.height = " + cuboid.getHeight());        // call height method and print results
        System.out.println("Cuboid.volume = " + cuboid.getVolume());        // call volume method and print results
    }
}