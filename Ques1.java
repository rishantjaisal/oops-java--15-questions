package Java_OOPS_Program;
import java.util.Scanner;

class GreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int greater = Math.max(a, Math.max(b, c));

        System.out.println("Greater number = " + greater);
    }
}
