package Conditional_Operators;
import java.util.Scanner;

public class ConditionalOperatorsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 number:");
        int a = scanner.nextInt();
        System.out.println("Enter 2 number:");
        int b = scanner.nextInt();

        if (a > b){
            double num = Math.sqrt(a);
            System.out.println("Result: " + num);
        } else if (a < b) {
            double num2 = Math.pow(a, b);
            System.out.println("Result: " + num2);
        }else {
            System.out.println("The numbers are equal");
        }
    }
}
