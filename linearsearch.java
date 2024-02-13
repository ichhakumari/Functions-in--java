// linear search...
public class linearsearch {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = { 4, 3, 6, 5, 8, 7 };
        int num = 8;

        for (int i = 0; i < n; i++) {

            if (arr[i] == num) {
                System.out.println("element found at index: " + i);
            }

            else if (arr[i] != num) {
                System.out.println("element not found");
            }
        }

    }
}