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
    
    public void writeOutput(){
        System.out.println("Triangle name is: " + name);
        System.out.println("Triangle base is: " + base);
        System.out.println("Triangle height is: " + height);
        System.out.printf("Triangle area is %.1f\n", getArea());
    }
    
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
     * @param setName The triangle's name.
     */
    public void setName(String newName){
        name = newName;
    }
    
    /**
     * This constructor sets the triangle's base in double.
     * @param setBase The triangle's base.
     */
    public void setBase(double newBase){
        base = newBase;
    }
    
    /**
     * This constructor sets the triangle's height in double.
     * @param setHeight The triangle's height.
     */
    public void setHeight(double newHeight){
        height = newHeight;
    }
    
    /**
     * This constructor calculates the triangle's area.
     * @return getArea The triangle's area.
     */
    private double getArea(){
        return 0.5 * base * height;
    }
}//end Triangle class