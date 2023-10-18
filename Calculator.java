
import java.util.Scanner;

public class Calculator{

 public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Write a number");
    double num1 = reader.nextDouble();
    System.out.println("Choose the operation: +,-,*,/ ");
    String operation = reader.next();
    System.out.println("Write second number: ");
    double num2 = reader.nextDouble();

    double result=0;
    if (operation.equals("+")) result = num1 + num2;
        else if (operation.equals("-")) result = num1 - num2;
        else if (operation.equals("*")) result = num1 * num2;
        else result = num1 / num2;

    System.out.println("Result: " + result);


 }
}