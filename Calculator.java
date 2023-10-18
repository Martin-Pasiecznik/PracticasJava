
import java.util.Scanner;

public class Calculator{

 public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Write a number");
    double num1 = reader.nextDouble();
    System.out.println("Choose the operation: +,-,*,/,^2 ");
    String operation = reader.next();
    double result=0;
    result = num1 * num1;

    if (!operation.equals("^2")){
            System.out.println("Write second number: ");
            double num2 = reader.nextDouble();

        if (operation.equals("+")) result = num1 + num2;
        else if (operation.equals("-")) result = num1 - num2;
        else if (operation.equals("*")) result = num1 * num2;
        else result = num1 / num2;
    }
    
    

    System.out.println("Result: " + result);


 }
}
