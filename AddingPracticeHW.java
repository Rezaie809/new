
package addingpractice.h.w;
import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

//  unicode used HexaDisimal .
public class AddingPracticeHW {

    
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
       int number1 = (int)(Math.random() *10);
        int number2 = (int)(Math.random()*10);
       System.out.println("What is " + number1 + " + " + number2);
      double UserResult = input.nextDouble();
        int ProgrammResult = number1 + number2;
        if(UserResult==ProgrammResult) {
        System.out.println("the answer is correct");
        }
        else { System.out.println("The answer is not correct");    
    }
    
         
       
        
        
        
    }
    
}
