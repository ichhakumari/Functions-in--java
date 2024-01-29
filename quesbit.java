// Write a program to toggle a bit a position = “pos” in a number “n”.

import java.util.Scanner;

public class quesbit {

    public static void main(String[] args) {
        // int n = 5; // 0101

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();
        int bitmask = 1 << pos;
        int newnumber = bitmask ^ n;
        System.out.println(newnumber);
    }
}