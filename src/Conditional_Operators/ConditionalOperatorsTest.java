package Conditional_Operators;
import java.util.Scanner;

public class ConditionalOperatorsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isStudent = false;

        if(!isStudent){
            System.out.println("Discount approved!");
        }else {
            System.out.println("Discount not approved!");
        }

        boolean isBlocked = true;
        if(!isBlocked){
            System.out.println("Welcome!");
        }else {
            System.out.println("You blocked");
        }
    }
}
