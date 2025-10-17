
/**
 * TriangleDriver asks: 
 * 1) Write a program to get First, Second, and Third triangles.
 * 2) Set the name, base, and height.
 * 
 * @author Daniela Kolacheva, dkolacheva@student.sdccd.edu
 * @version v1.0
 * @since 10/19/2025
 */

public class TriangleDriver
{
    public static void main(String[] args) {
        System.out.println("First Triangle");
        System.out.println("--------------");
        Triangle triangle1 = new Triangle(); // set name to Tri1, base to 5.0, and height to 6.0
        triangle1.writeOutput();
        triangle1.setName("Tri1");
        triangle1.setBase(5.0);
        triangle1.setHeight(6.0);
        System.out.println();
        triangle1.writeOutput();
        
        System.out.println("\nSecond Triangle");
        System.out.println("--------------");
        Triangle triangle2 = new Triangle("Tri2", 7.3, 8.3); // set name to Tri2, base to 7.3, and height to 8.3
        triangle2.writeOutput();
        
        System.out.println("\nThird Triangle");
        System.out.println("--------------");
        Triangle triangle3 = new Triangle("Tri3", 8.5, 10.3); // set name to Tri3, base to 8.5, and height to 10.3
        triangle3.readInput();
        System.out.println();
        triangle3.writeOutput();
    }  //end main
}