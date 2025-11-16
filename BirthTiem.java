
package birthtiem;

import java.util.Scanner;
public class BirthTiem {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
    System.out.println("Enter the year of your birth");
    
     double Birth_year = input.nextDouble();
    
    System.out.println("Enter the current year");
    double Courrent_year = input.nextDouble();
    int x = (int) (Courrent_year - Birth_year);
    System.out.println("you are"  +  x +  "years old");
    }
    
    
}
