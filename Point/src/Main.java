// Vinson Mach
// 09/23/2022
// In this program, we do a challenge where we represent a point in a 2D space

public class Main
{
    public static void main(String[] args)
    {
        Point first = new Point(6, 5);                                  // initialize and call new point with parameters
        Point second = new Point(3, 1);                                 // initialize and call new point with parameters
        System.out.println("Distance(0,0) = " + first.distance());          // call distance method and print results
        System.out.println("Distance(second) = " + first.distance(second)); // call distance method and print results
        System.out.println("Distance(2,2) = " + first.distance(2, 2));// call distance method and print results
        Point point = new Point();                                          // initialize new point
        System.out.println("Distance() = " + point.distance());             // call distance method and print results
    }
}