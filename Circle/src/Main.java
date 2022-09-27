// Vinson Mach
// 09/26/2022
// In this program, we get the physical properties of a circle and cylinder

public class Main
{
    public static void main(String[] args)
    {
        Circle circle = new Circle(3.75);                           // initialize new instance and call constructor with parameter
        System.out.println("Circle.radius = " + circle.getRadius());        // call radius method and print results
        System.out.println("Circle.area = " + circle.getArea());            // call area method and print results
        Cylinder cylinder = new Cylinder(5.55, 7.25);           // initialize new instance and call constructor with parameters
        System.out.println("Cylinder.radius = " + cylinder.getRadius());    // call radius method and print results
        System.out.println("Cylinder.height = " + cylinder.getHeight());    // call height method and print results
        System.out.println("Cylinder.area = " + cylinder.getArea());        // call area method and print results
        System.out.println("Cylinder.volume = " + cylinder.getVolume());    // call volume method and print results
    }
}