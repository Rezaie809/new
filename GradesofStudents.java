
package gradesofstudents;
import java.util.Scanner;

public class GradesofStudents {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        double number = input.nextDouble();
        if(number>=90 && number<=100) {    
           System.out.println("Grade"+"A");
           
        } 
        else if(number>=80 && number<90) {    
            System.out.println("Grade" +"B");
            }
        else if(number>=70 && number<80) {
            System.out.println("Grade" +"C");
        }
      else if(number>=60 && number<70) {
            System.out.println("Grade" +"D");
        }
        else if(number<60) {
        System.out.println("you cannot pass the class");
        }
        else {System.out.println("Invalid number!");
                }
                
        }   
    }
    
    
}
