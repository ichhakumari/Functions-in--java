// print sum of first n natural number using recursion...
public class recursion2 {
    public static void printSum(int i, int n, int sum) {
        // base
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i; // worl
        printSum(i + 1, n, sum); // recursion
    }

    public static void main(String[] args) {
        printSum(1, 5, 0);
    }
}
