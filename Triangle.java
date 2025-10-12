import java.util.Scanner;

/**
 * Triangle asks: 
 * 1) Create a Scanner to get user input. 
 * 2) Write a program with appropriate getters, setters, instance vars, and methods.
 * 3) Include a no-arg constructor for unknown triangle with set base and height as 0.
 * 4) Include a String with names and doubles for base, and height for all three triangles.
 * 5) Close Scanner.
 * 
 * @author Daniela Kolacheva, dkolacheva@student.sdccd.edu
 * @version v1.0
 * @since 10/19/2025
 */

public class Triangle {
    private String name;
    private double base;
    private double height;

    public Triangle(){ //no-arg constructor
        name = "Unknown";
        base = 0.0;
        height = 0.0;
    }

    /**
     * This constructor sets name, base, and height in the String argument.
     * @param inName The triangle's name.
     * @param inBase The triangle's base.
     * @param inHeight The triangle's height.
     */
    public Triangle(String inName, double inBase, double inHeight){
        name = inName;
        base = inBase;
        this.height = inHeight;
    }
    
    /**
     * This constructor writes name, base, height, and area in the writeOutput field.
     * @param name The triangle's name is.
     * @param base The triangle's base is.
     * @param height The triangle's height is.
     * @param area The triangle's area is.
     */
    public void writeOutput(){
        System.out.println("Triangle name is: " + name);
        System.out.println("Triangle base is: " + base);
        System.out.println("Triangle height is: " + height);
        System.out.printf("Triangle area is %.1f\n", getArea());
    }
    
    /**
     * This constructor reads name, base, and height in the readInput field.
     * @param name What is the triangle's name.
     * @param base What is the triangle's base.
     * @param height What is the triangle's height.
     */
    public void readInput(){    
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is the triangle's name: ");
        name = keyboard.nextLine();
        
        System.out.print("What is the triangle's base: ");
        base = keyboard.nextDouble();
        
        System.out.print("What is the triangle's height: ");
        height = keyboard.nextDouble();
        
        keyboard.close();
    }
    
    /**
     * This constructor sets the triangle's name.
     * @return setName The triangle's name.
     */
    public void setName(String newName){
        name = newName;
    }
    
    /**
     * This constructor sets the triangle's base in double.
     * @return setBase The triangle's base.
     */
    public double setBase(double newBase){
        base = newBase;
        return base;
    }
    
    /**
     * This constructor sets the triangle's height in double.
     * @return setHeight The triangle's height.
     */
    public double setHeight(double newHeight){
        height = newHeight;
        return height;
    }
    
    /**
     * This constructor calculates the triangle's area.
     * @return getArea The triangle's area.
     */
    private double getArea(){
        return 0.5 * base * height;
    }
    
    /**
     * This constructor demonstrates the triangle's String arg.
     */
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
        Triangle triangle2 = new Triangle(); // set name to Tri2, base to 7.3, and height to 8.3
        triangle2.setName("Tri2");
        triangle2.setBase(7.3);
        triangle2.setHeight(8.3);
        triangle2.writeOutput();
        
        System.out.println("\nThird Triangle");
        System.out.println("--------------");
        Triangle triangle3 = new Triangle(); // set name to Tri3, base to 8.5, and height to 10.3
        triangle3.setName("\nTri3");
        triangle3.setBase(8.5);
        triangle3.setHeight(10.3);
        triangle3.readInput();
        System.out.println();
        triangle3.writeOutput();
    }  //end main
}//end Triangle class