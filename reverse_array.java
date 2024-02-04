//reverse array using recursion..
import java.util.*;
import java.io.*;

public class reverse_array {
    public static void main(String[] args) {
        // declare and initialize an integer array A[]
        int A[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
        for (int i = 0; i < 9; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        // calling the user defined method reverseArray()
        // and store the result value inside an integer array say ‘B[]’
        int B[] = reverseArray(A, 0, A.length - 1);

        // display the array after reversing elements.
        System.out.println("The elements in reverse array are");
        for (int j : B)
            System.out.print(j + " ");
    }

    static int[] reverseArray(int[] a, int i, int j) {
        // check if 1st index is less than last index
        if (i < j) {
            // swap elements a[i],a[j]
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            // reverse the array by calling the reverseArray() method recursively.
            reverseArray(a, i + 1, j - 1);
        }
        return a;
    }
}
