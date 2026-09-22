package Loop;
import java.util.Scanner;

public class LoopTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Task 1
        /*System.out.println("Enter a number: ");
        int a = scanner.nextInt();

        while (a > 0){
            System.out.println(a);
            a--;
        }*/
//Task 3
       /* System.out.println("Enter a number: ");
        int a = scanner.nextInt();
        int b = 0;

        while (a > b){

            if (b % 2 == 0 && b != 0){
                System.out.println(b);
            }
            b++;
        }*/
//Task 2
           /* System.out.println("Enter a number: ");
            int a = scanner.nextInt();
            System.out.println("Enter a number: ");
            int b = scanner.nextInt();
            do {
                a++;
                if(a <= b && a != b){
                    System.out.printf("%d x %d = %.1f\n", a, a, Math.pow(a, 2));
                }
            }while (a != b);*/
//Task 4
        /*System.out.println("Entre a number: ");
        int a = scanner.nextInt();
        System.out.println("Enter a number: ");
        int b = scanner.nextInt();

        do {
            System.out.println(a);
            a++;
        }while (a <= b);*/
//Task 5
        /*System.out.println("Multiplication table: ");
        for(int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d\n", 5, i, (5 * i));
        }*/
//Task 6
        /*System.out.println("Enter a number: ");
        int a = scanner.nextInt();
        int b = 0;
        System.out.println("Your number: " + a);
        for (int i = 1; i < a; i++){
            if(i % 2 == 0){
                System.out.println(i);
                b+=i;
            }
        }
        System.out.println("Sum of the numbers: " + b);*/
//Task 6.1
        /*System.out.println("Enter a number: ");
        int a = scanner.nextInt();
        int b = 0;
        System.out.println("Your number: " + a);
        for (int i = 0; i < a; i++){
            if(i % 2 != 0){
                System.out.println(i);
                b+=i;
            }
        }
        System.out.println("Sum of the numbers: " + b);*/
//Task 7
        int a = 1;
        double b = 0;
        int c = 0;
        while (a != 0){
            System.out.println("Enter a number: ");
            a = scanner.nextInt();
            b+= a;
            if (a > 0){
                c++;
            }
        }
        System.out.printf("Number of entered values: %d\nSum: %.0f\nArithmetic mean value: %.1f", c, b, (b / c));
    }
}
