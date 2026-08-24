package Conditional_Operators;
import java.util.Scanner;

public class ConditionalOperatorsTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Task 1
      /*  System.out.println("Enter any number, you can enter before and after 0: ");
        int num = scanner.nextInt();
    if (num >= 0){
        System.out.println("Positive number: " + num);
    }else{
        System.out.println("Negative number: " + num);
    }*/
//Task 2
        /*System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        System.out.println("Enter third number: ");
        int c = scanner.nextInt();

        if (a >= b && a >= c){
            System.out.println("The greatest number: " + a);
        } else if (b >= a && b >= c){
            System.out.println("The greatest number: " + b);
        }else {
            System.out.println("The greatest number: " + c);
        }*/
//Task 3
        System.out.println("Enter the number of points: ");
        int points = scanner.nextInt();

        System.out.println((points >=50)? "You passed": "You didn't pass");


    }
}
