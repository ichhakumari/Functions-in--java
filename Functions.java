import java.util.Scanner;

public class Functions {
    // public static int sum(int a, int b) {
    // int sum = a + b;
    // return sum;
    // }

    // public static int mul(int a, int b) {
    // int mul = a * b;
    // return mul;
    // }

    public static void printFactorial(int n) {
        // loop
        if (n < 0) {
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;

        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }

        System.out.println(factorial);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        int n = sc.nextInt();
        // System.out.println("sum: " + sum(a, b));
        // System.out.println("mul:" + mul(a, b));

        printFactorial(n);
    }
}
