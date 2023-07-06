import java.util.Scanner;

public class greatestOfThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number ");
        int a = scanner.nextInt();
        System.out.println("Enter second number ");
        int b = scanner.nextInt();
        System.out.println("Enter third number ");
        int c = scanner.nextInt();

        scanner.close();

        if (a > b && a > c) {
            System.out.println("The greatest number is " + a);
        } else if (b > a && b > c) {
            System.out.println("The greatest number is " + b);
        } else {
            System.out.println("The greatest number is " + c);
        }
    }
}
