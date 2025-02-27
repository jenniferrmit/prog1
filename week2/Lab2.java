import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {



        Scanner MyInput = new Scanner(System.in);
        double num1 , num2 ; // Declare integers

        System.out.println("Enter first number: ");
        num1 = MyInput.nextDouble();
        System.out.println("Enter second number: ");
        num2 = MyInput.nextDouble();






        double sum, diff, prod, quot; // Declare doubles

        sum = num1 + num2; // Addition
        diff = num1 - num2; // Subtraction
        prod = num1 * num2; // Multiplication
        quot = num1 / num2; // division


        // Output results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);
        System.out.println("Quotient: " + quot);
  

    }
}
