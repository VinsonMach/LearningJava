// Vinson Mach
// 09/24/2022
// In this program, we learn about inheritance

public class Main
{
    public static void main(String[] args)
    {
        // initialize new object and call constructor with parameters
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        // initialize new object and call constructor with parameters
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "Long Silky");

        dog.eat();          // call method
        dog.walk();         // call method
        dog.run();          // call method
    }
}