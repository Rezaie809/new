
package exercise537;
import java.util.Scanner;

public class Exercise537 {

    
    public static void main(String[] args) {
        // Dicimal to Binary
            Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal integer: ");
        int decimal = input.nextInt();

        if (decimal == 0) {
            System.out.println("Binary: 0");
            return;
        }

        String binary = "";

        int number = decimal;
        while (number > 0) {
            int remainder = number % 2;
            binary = remainder + binary; 
            number = number / 2;
        }

        System.out.println("Binary: " + binary);
        input.close();

    }
    
}
