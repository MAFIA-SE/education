package Array;
import java.util.Arrays;
import  java.util.Random;
import  java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
//Task 1
        /*int[] massive = new int[5];
        massive[0] = 5;
        massive[1] = 10;
        massive[2] = 15;
        massive[3] = 20;
        massive[4] = 25;
        System.out.println(Arrays.toString(massive));*/

//Task 2
        /*int[] massive = new int[10];
        double sum = 0;
        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(0, 100) + 1;
            sum += massive[i];
        }
        System.out.println("Arithmetic average: " + (sum / massive.length));*/

//Task 3
        /*System.out.println("Enter the array size: ");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 100) + 1;
            sum += array[i];
        }
        System.out.println("Sum all element: " + sum);*/
    }
}
