// // import java.util.Scanner;

// // public class Strings {
// //     public static void main(String[] args) {
// //         // Declaration
// //         // String name = "Tom jerry";
// //         // Taking Input
// //         // Scanner sc = new Scanner(System.in);
// //         // String name = sc.next();
// //         // String name = sc.nextLine(); // print full name

// //         // Concatenation (Joining 2 strings)
// //         String firstName = "Tony";
// //         String secondName = "Stark";

// //         String fullName = firstName + " " + secondName;
// //         System.out.println(fullName);

// //         // Print length of a String
// //         System.out.println(fullName.length());

// //         // Access characters of a string
// //         for (int i = 0; i < fullName.length(); i++) {
// //             System.out.println(fullName.charAt(i));
// //         }

// //     }
// // }

// // Compare 2 strings
// import java.util.*;

// public class Strings {
//     public static void main(String args[]) {
//         // String name1 = "Tony";
//         // String name2 = "Tony";

//         // if (name1.equals(name2)) {
//         // System.out.println("They are the same string");
//         // } else {
//         // System.out.println("They are different strings");
//         // }

//         // DO NOT USE == to check for string equality
//         // Gives correct answer here
//         // if (name1 == name2) {
//         // System.out.println("They are the same string");
//         // } else {
//         // System.out.println("They are different strings");
//         // }

//         // // Gives incorrect answer here
//         // if (new String("Tony") == new String("Tony")) {
//         // System.out.println("They are the same string");
//         // } else {
//         // System.out.println("They are different strings");
//         // }
//         // Substring
//         // The substring of a string is a subpart of it.

//         // String name = "TonyStark";

//         // System.out.println(name.substring(0, 4));

//         // ParseInt Method of Integer class
//         String str = "123";
//         // int number = Integer.parseInt(str);
//         // System.out.println(number);

//     }
// }
//ToString Method of String class
public class Strings {
    public static void main(String args[]) {
        int number = 123;
        String str = Integer.toString(number);
        System.out.println(str.length());

    }
}
