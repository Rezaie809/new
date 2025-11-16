
package computeoftheareawithdifrentradius;
import java.util.Scanner;

public class ComputeoftheAreawithDifrentRadius {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the radius of the circle");
        
        double radius = input.nextDouble();
        double area = radius * radius * 3.14159;
        System.out.println("The area for circle of radius " + radius + "is" + area);
        
        
        
    }
    
}
