// print factorial number till nth term using recursion.....
public class recursion_factorial {
    public static int calfactorial(int n) {

        // base
        if (n == 1 || n == 0) {
            return 1;

        }
        int fact_nm1 = calfactorial(n - 1);
        int fact_n = n * fact_nm1; // recursion
        return fact_n;
    }

    public static void main(String[] args) {
        int n = 5;
        int ans = calfactorial(n);
        System.out.println(ans);
    }
}
