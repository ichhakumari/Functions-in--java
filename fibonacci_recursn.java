public class fibonacci_recursn {
    public static void printfib(int a, int b, int n) {
        // base
        if (n == 0) {
            return;
        }
        // work
        int c = a + b;
        System.out.println(c);
        printfib(b, c, n - 1); // recursion

    }

    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        printfib(a, b, n - 2);
    }
}
