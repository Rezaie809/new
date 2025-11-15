
package even.oddnumbers;
import java.util.Scanner;
public class EvenOddNumbers {

   
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = input.nextInt();
       System.out.println(( number % 2 ==0)? " number is even": "number is odd");
      
       
    }
    
}
