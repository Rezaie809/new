
package faranheit_to_Selsius;
import java.util.Scanner;
public class faranheit_to_Selsius {

    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter a Faranheit degree");
    double Faranheit = input.nextDouble();
double Celsius = (5.0/9) * (Faranheit-32);

 System.out.println("the result is" + Celsius + "Celsius");
    }
    
}
