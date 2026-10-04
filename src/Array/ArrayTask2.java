package Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

//Task 1
    /*int[] massive = new int[10];
    int num = 1;
    int massiveNum = 0;
        for (int i = 0; i < massive.length; i++) {
            massive[i] = num;
            System.out.println("Multiplication table: ");
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d * %d = %d\n", massive[massiveNum], j, massive[massiveNum] * j);
            }
            massiveNum++;
            num++;
        }*/
//Task 2
        /*int[] massive = new int[15];
        int even = 0;
        int odd = 0;
        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(0, 100) + 1;
            if (massive[i] % 2 == 0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.printf("Even numbers: %d\nOdd numbers: %d", even, odd);*/
//Task 3
        /*int[] massive = new int[random.nextInt(5, 20) + 1];
        for (int i = 0; i < massive.length; i++) {
            if ((massive.length - 1) != i){
                System.out.println("Enter a number: ");
                massive[i] = scanner.nextInt();
            }else {
                System.out.println("Enter the last element of the array!");
                massive[i] = scanner.nextInt();
            }
        }*/
//Task 4
        /*String[] words = {"Java", "Python", "C++", "Go", "JavaScript", "Java"};
        for (int i = 1; i < words.length; i++) {
            if (words[0].equals(words[i])) {
                System.out.printf("%s == %s\n", words[0], words[i]);
            }else {
                System.out.printf("%s != %s\n", words[0], words[i]);
            }
        }*/
//Task 5
        /*int[] numbers =  new int[50];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 2 * i + 1;
            System.out.printf("%s ", numbers[i]);
        }
        System.out.println(" ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.printf("%s ", numbers[i]);
        }*/
//Task 6
        /*int[] numbers = new int[10];
        int max = 0;
        int secondMax = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1, 100) + 1;
        }
        for (int number : numbers) {
            if (number > max) {
                secondMax = max;
                max = number;
            } else if (number > secondMax && number != max) {
                secondMax = number;
            }
        }
        System.out.printf("1) %s\n2)%s\n", max, secondMax);*/
//Task 7
        /*int[] massive = new int[10];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(1, 100) + 1;
        }
        int min = massive[0];
        int secondMin = 0;

        for (int i = 0; i < massive.length; i++) {
            if (massive[i] < min){
                secondMin = min;
                min = massive[i];
            } else if (massive[i] < secondMin && massive[i] < min) {
                secondMin = massive[i];
            }
        }
        System.out.printf("1)%s\n2)%s\n",min, secondMin);*/

    }
}
