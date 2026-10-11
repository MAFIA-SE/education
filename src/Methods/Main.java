package Methods;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Task 1
        /*System.out.println("Enter the number 1 or 2 (hello/bye)");
        int choice = scanner.nextInt();

        if (choice == 1){
            TaskMethods.methodHello();
        } else if (choice == 2) {
            TaskMethods.methodBye();
        }else {
            System.out.println("Sorry, but there is no such choice.");
        }*/
//Task 2
        /*System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        TaskMethods.methodString(name);*/
//Task 3
        /*int[] massive = {5, 10, 15, 20, 25, 30};
        TaskMethods.methodMassive(massive);*/
//Task 1
        /*System.out.println("Enter a number: ");
        int result = scanner.nextInt();
        System.out.println(TaskMethods.checkEvenOrOdd(result));*/
//Task 2
        /*System.out.println("Enter 1st number: ");
        int a = scanner.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = scanner.nextInt();
        System.out.println("Enter 3rd number: ");
        int c = scanner.nextInt();

        System.out.println("AVG: " + TaskMethods.avg(a, b, c));*/
//Task 3
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        System.out.printf("Total num before %d\nTotal num: %d", num, TaskMethods.totalNum(num));
    }
}


