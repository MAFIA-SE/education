package Methods;

import java.util.Arrays;

public class TaskMethods {
    //Task 1
    public static void methodHello(){
        System.out.println("Hello");
    }

    public static void  methodBye(){
        System.out.println("Bye");
    }
    //Task 2
    public static void methodString(String name){
        System.out.println("Hello " + name);
    }
    //Task 3
    public static void methodMassive(int[] massive){
        System.out.println(Arrays.toString(massive));
    }
    //Task 1
    public static String checkEvenOrOdd(int result){
        if (result % 2 == 0){
            return "Even";
        } else{
            return "Odd";
        }
    }
    //Task 2
    public  static double avg(int a, int b, int c){
        return (a + b + c) / 3.0;
    }
    //Task 3
    public static int totalNum(int num){
        int total = 0;
        for (int i = 0; i <= num; i++) {
            total += i;
        }
        return total;
    }
}
