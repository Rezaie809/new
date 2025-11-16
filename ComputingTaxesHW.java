
package computingtaxesh.w;
import java.util.Scanner;

public class ComputingTaxesHW {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Status;
       double Salary;
        System.out.println("Enter your Status");
        Status = input.nextLine();
         System.out.println("Enter your salary");
        Salary = input.nextDouble();
        double x = Salary*10/100;
        double y = Salary*15/100;
        double z = Salary*25/100;
        double a = Salary*28/100;
        double b = Salary*33/100;
        double c = Salary*35/100;
        if("single".equals(Status) && Salary>0 && Salary<=8350) {
            System.out.println("your tax is" + x);
     }
        else if("Married Filing Jointly".equals(Status)&& Salary>0 && Salary<=16700){
            System.out.println("your tax is" + x);
        }
       else if("Married Filing Separately".equals(Status) && Salary>0 && Salary<=8350) {
            System.out.println("your tax is" + x);
        } 
         else if("Head of Household".equals(Status) && Salary>0 && Salary<=11950) {
            System.out.println("your tax is" + x);
        }
       else if("single".equals(Status) && Salary>8351 && Salary<=33950) {
            System.out.println("your tax is" + y);
        } 
    else if("Married Filing Jointly".equals(Status) && Salary>16701 && Salary<=67900) {
            System.out.println("your tax is" + y);
        }
    else if("Married Filing Separately".equals(Status) && Salary>8351 && Salary<=33950) {
            System.out.println("your tax is" + y);
        }
    else if("Head of Household".equals(Status) && Salary>11951 && Salary<=45500) {
            System.out.println("your tax is" + y);
         }   
    else if("single".equals(Status) && Salary>33951 && Salary<=82250) {
            System.out.println("your tax is" + z);
        }
    else if("Married Filing Jointly".equals(Status) && Salary>67901 && Salary<=137050) {
            System.out.println("your tax is" + z);
        }
    else if("Married Filing Separately".equals(Status) && Salary>33951 && Salary<=68525) {
            System.out.println("your tax is" + z);
        }
    else if("Head of Household".equals(Status) && Salary>45501 && Salary<=117450) {
            System.out.println("your tax is" + z);
        }
    else if("single".equals(Status) && Salary>82251 && Salary<=171550) {
            System.out.println("your tax is" + a);
        }
    else if("Married Filing Jointly".equals(Status) && Salary>137051 && Salary<=208850) {
            System.out.println("your tax is" + a);
        }
    else if("Married Filing Separately".equals(Status) && Salary>68526 && Salary<=104425) {
            System.out.println("your tax is" + a);
        }
    else if("Head of Household".equals(Status) && Salary>117451 && Salary<=190200) {
            System.out.println("your tax is" + a);
        }
    else if("single".equals(Status) && Salary>171551 && Salary<=372950) {
            System.out.println("your tax is" + b);
        }
    else if("Married Filing Jointly".equals(Status) && Salary>208851 && Salary<=372950) {
            System.out.println("your tax is" + b);
        }
    else if("Married Filing Separately".equals(Status) && Salary>104426 && Salary<=186475) {
            System.out.println("your tax is" + b);
        }
    else if("Head of Household".equals(Status) && Salary>190201 && Salary<=372950) {
            System.out.println("your tax is" + b);
        }
    else if("single".equals(Status) && Salary>372951 ) {
            System.out.println("your tax is" + c);
        }
     else if("Married Filing Jointly".equals(Status) && Salary>372951 ) {
            System.out.println("your tax is" + c);
        }
     else if("Marreid Filing Separately".equals(Status) && Salary>186476 ) {
            System.out.println("your tax is" + c);
        }
     else if("Head of Household".equals(Status) && Salary>372951 ) {
            System.out.println("your tax is" + c);
        }
     else {System.out.println("invalid Salarey or Gender!");
     
     }
    }
}

    
    
    
    
    

        
    
    

