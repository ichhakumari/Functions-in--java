//print number using recursion... a) print 5 to 1 numbers
public class recursion1 {
    // public static void printNumber(int n) {
    // if (n == 0) { // base condition
    // return;
    // }
    // System.out.println(n); // print

    // printNumber(n - 1); // recursion call
    // }

    // public static void main(String[] args) {
    // int n = 5;
    // printNumber(n); // n=5
    // }

    // b) print 1 to 5...

    public static void printNumber(int n) {
        if (n == 6) { // base condition
            return;
        }
        System.out.println(n); // print

        printNumber(n + 1); // recursion call
    }

    public static void main(String[] args) {
        int n = 1;
        printNumber(n); // n=5
    }
}
