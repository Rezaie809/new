
package convertingpoundintokilogram;

import java.util.Scanner;
public class ConvertingPoundintoKiloGram {

    
    public static void main(String[] args) {
        // one Pound is 0.454 kilogram
        System.out.println("Enter a number in Pounds");
        Scanner input = new Scanner(System.in);
        double pounds = input.nextDouble();
        double kilograms = pounds * 0.454;
        System.out.println( + pounds +" pounds is " + kilograms + " Kilograms");
    }
    
}
