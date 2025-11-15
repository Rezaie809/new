
package hextodec;
import java.util.Scanner;

public class HextoDec {

    
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("Enter a hexa number");
        String hexa = input.nextLine();
        
        System.out.println("The dicemal value for hexa dicemal" + hexa + " is " + hexaToDecimal(hexa.toUpperCase()));
    }
        public static int hexaToDecimal(String hexa);
        
    }
    

