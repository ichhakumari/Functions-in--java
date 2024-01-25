import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // way of initialize array
        // int[] marks = new int[3];
        // // int marks[]=new int[3];
        // // int marks[]={23,43,34};
        // marks[0] = 23; // maths
        // marks[1] = 43; // eng
        // marks[2] = 34; // hin
        // way to print aaray values

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // for (int i = 0; i < 3; i++) {
        // System.out.println(marks[i]);

        // 2. user input
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array");
        int size = sc.nextInt();
        int number[] = new int[size];

        // input
        System.out.println("enter numbers in array");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        // output
        System.out.println(" numbers in array are");
        for (int i = 0; i < 3; i++) {
            System.out.println(number[i]);

        }
    }
}
