// LEARN BITMANUPULATION IN JAVA...

import java.util.Scanner;

public class Bits {
    public static void main(String[] args) {
        // GET bit
        // BITMASK THEN AND OPERATION
        // int n = 5; // 0101
        // int pos = 2; // pos 2=1

        // int bitMask = 1 << pos; // 1- 0001 leftshift by 2 = 0100

        // if ((bitMask & n) == 0) { // 0101 and 0100 = 0100 means non zero number
        // System.out.println("bit was zero");
        // } else {
        // System.out.println(" bit was one");
        // }
        // }

        // SET bit
        // BITMASK THEN OR OPERATION

        // int n = 5; // 0101 or = 7(0111)
        // int pos = 1; // pos1 = 0

        // int bitMask = 1 << pos; // 0001 = 0010

        // int newnumber = bitMask | n;
        // System.out.println(newnumber);

        // CLEAR BIT
        // BITMASK THEN AND WITH NOT

        // int n = 5; // 1(0101)
        // int pos = 2; // pos 2= 1 we have to change this 1 into zero means 5 to 1

        // int bitMask = 1 << pos; // 0001 = 0100

        // int notbitmask = ~(bitMask); // 1011

        // int newnumber = notbitmask & n; // 1011 and 0101 = 0001 -(1)
        // System.out.println(newnumber); // print 1

        // UPDATE bits
        // for 1=set operation nd for 0 = clear operation
        int n = 5; // 0101
        int pos = 1; // 0

        Scanner sc = new Scanner(System.in);
        System.out.println("enter operation");
        int oper = sc.nextInt();

        int bitMask = 1 << pos; // 1 (0001)- 0010

        if (oper == 1) {
            // set operation =7(0111)
            int newnumber = bitMask | n; // 0010 or 0101 = 0111
            System.out.println(newnumber); // 7
        } else {
            // clear operation
            int notbitmask = ~(bitMask); // not 0010 = 1101

            int newnumber = notbitmask & n; // 1101 and 0101 =0101
            System.out.println(newnumber); // print 5
        }

    }
}
