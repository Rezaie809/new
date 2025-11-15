
package lottery.h.w;
import java.util.Scanner;

public class LotteryHW {

    
    public static void main(String[] args) {
      
        int lottery = (int)(Math.random() *100);
        Scanner input = new Scanner(System.in);
         System.out.println("Enter a 2 digit number");
        int x = input.nextInt();
       int lotteryDigit1 = lottery / 10;
       int lotteryDigit2 = lottery % 10;
       
       int x1 = x / 10;
       int x2 = x % 10;
       System.out.println("The lottery number is" + lottery);
       
       if (x==lottery){
           System.out.println("Exact math, you win 10,000$");
           }
           else if ( x1==lotteryDigit2 && x2==lotteryDigit2){
               System.out.println("Inverse math, you win 3,000$");
                   }
           else if (x1==lotteryDigit2 || x2==lotteryDigit2 || x1==lotteryDigit1 || x2==lotteryDigit1){
               System.out.println("Just one digit math, you win 1,000$");
          }
           else{ System.out.println("Sorry! not much");
           
           }
       
       
        
        
    }
}