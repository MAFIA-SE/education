package Loop;
import java.util.Scanner;
import java.util.Random;

public class LoopTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
//Task 1
        /*int a;
        int b;

        do {
            System.out.println("Please, enter a number: ");
            a = scanner.nextInt();
            System.out.println("Please, enter a number: ");
            b = scanner.nextInt();
            System.out.printf("%d + %d = %d\n", a, b, (a + b));

            System.out.println("Do you want to repeat the operation? (yes/no)");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("yes")){
                System.out.println("Alright, let's get back to work.");
            }else if (answer.equalsIgnoreCase("no")){
                System.out.println("Shutting down.");
                break;
            }else {
                System.out.println("Unclear word");

                System.out.println("Please, write it correctly: ");
                answer = scanner.next();
                if (answer.equalsIgnoreCase("yes")){
                    System.out.println("Alright, let's get back to work.");
                }else{
                    System.out.println("Shutting down.");
                    break;
                }
            }
        }while (true);*/
//Task 2
        /*int randomNum = random.nextInt(0, 100) + 1;
        int attempts = 0;
        int number;

        do {
            System.out.println("Please, enter a number: ");
            number = scanner.nextInt();
            if (number > randomNum){
                System.out.println("A lot, look from below");
                attempts++;
            } else if (number == randomNum) {
                System.out.println("Congratulations, you found the number.");
                attempts++;
                break;
            }else {
                System.out.println("Not enough—look from above.");
                attempts++;
            }

        }while (true);
        System.out.println("Attempts: " + attempts);*/
//Task 3
        /*int i = 1;
        int num;
        System.out.println("Please, enter a number: ");
        num = scanner.nextInt();
        while (i <= 10){

            System.out.printf("%d * %d = %d\n", num, i, (num * i));
            i++;
        }*/
//task 5 (If that’s how it’s written, then I don’t know—I’m just going by the materials.)
        /*int i = 1;
        System.out.println("Divisible by 3 and 5 without a remainder: ");
        do {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
            }
             i++;
        }while (i <= 100);*/
    }
}
