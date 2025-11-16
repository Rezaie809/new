
package bmi;
import java.util.Scanner;

public class BMI {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       System.out.println("Enter your weight");
       double weight = input.nextDouble();
       
       System.out.println("Enter your hight");
       double hight = input.nextDouble();
       double BMI = weight/ (hight *hight);
       if(BMI <18.5) {
           System.out.println("you are underweight");
       }
       else if(BMI>=18.5&&BMI<25){
           System.out.println("you are normal");
       }
       
       else if(BMI>=25&&BMI<30) {
           System.out.println("you are owerweight");
       }
       
       else if(BMI>=30) {
           System.out.println("you are obese");
           
    
    }
    
     
            
    }
    
}
