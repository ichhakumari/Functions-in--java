import java.util.Scanner;

public class hasing1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter soze of array then items:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        // precomputing

        int hash[] = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        // fetch
        System.out.println("enter querry no");
        int q = sc.nextInt();

        while (q-- != 0) {
            int number = sc.nextInt();
            System.out.println(hash[number]);
        }

    }
}