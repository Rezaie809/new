
package chinesezodiach.w;
import java.util.Scanner;

public class ChineseZodiacHW {
    
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println(" Enter a year");
      int year = input.nextInt();
      switch (year % 12) {
          case 0: System.out.println("The year is monkey year"); break;
          case 1: System.out.println(" The year is rooster year"); break;
          case 2: System.out.println(" The year is dog year"); break;
          case 3: System.out.println(" The year is pig year"); break;
          case 4 : System.out.println(" The year is rat year"); break;
          case 5 : System.out.println(" The year is ox year"); break;
          case 6: System.out.println(" The year is tiger year"); break;
          case 7: System.out.println(" The year is rabbit year"); break;
          case 8: System.out.println("The year is dragon year"); break;
          case 9: System.out.println("The year is snake year"); break;
          case 10: System.out.println(" The year is horse year"); break;
          case 11: System.out.println("The year is sheep year"); break;
          default : System.out.println("please enter a number of an year");
      }
      
      
      
      
      
      
      
      
    }
    
}
