// print n to 1 using recursion backtrack..

public class backtrack_recursion {
    public static void printNum(int i, int n) {
        if (i > n) {
            return;
        }
        printNum(i + 1, n);
        System.out.println(i);

        // without backtrack
        // if (i == 0) {
        // return;
        // }
        // System.out.println(i);
        // printNum(i - 1, n);
    }

    public static void main(String[] args) {
        int n = 3;
        int i = 1;
        printNum(i, n);
    }
}
