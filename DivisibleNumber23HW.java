
package divisiblenumber2.pkg3.h.w;
import java.util.Scanner;

public class DivisibleNumber23HW {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = (int) input.nextInt();
        if( number%2==0 && number%3==0){
            System.out.println( + number + " is divisible by 2 and 3");
        }
        else if ( number%2==0 || number%3==0 ) {
            System.out.println(+ number + " is divisible by 2 or 3");
       }
        else if ( number%2==0 ^ number%3==0 ){
           
      System.out.println( + number + " is divisible by 2 or 3, but noth both");
        }
       
        }
        }
    

