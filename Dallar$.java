
package dallar.$;
import java.util.Scanner;
public class Dallar$ {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter an amount");
       double amount = input.nextDouble();
       int remainingAmount = (int)Math.round(amount*100);
       int dollars = remainingAmount/100;
     remainingAmount%=100;
     int quarters = remainingAmount/25;
     remainingAmount%=25;
     int dimes = remainingAmount/10;
     remainingAmount%=10;
     int nickels = remainingAmount/5;
     remainingAmount%=5;
     int pennies = remainingAmount;
       System.out.println("The amount is" + dollars + "$ : " + quarters + "quarters : " + dimes + "dimes : "
               + "" + nickels + "nickels : " + pennies + "pennies");
    }
    
}
