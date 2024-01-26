//string are immutable , for making changes in strings we use, string builder(mutable).
public class Stringsbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Ichha");
        System.out.println(sb);

        // char at index 4
        System.out.println(sb.charAt(4));

        // replace/ set character in string .o/p..ichha--ichhu
        // sb.setCharAt(4, 'u');
        // System.out.println(sb);

        // insert a char at index 4...o/p..ichha--ichhaa
        // sb.insert(4, 'a');
        // System.out.println(sb);

        // // delete char
        // sb.delete(4, 5);
        // System.out.println(sb);

        // append - for adding char at end of string
        // sb.append("k");
        // sb.append("u"); // str= str + "u" --in string to add
        // sb.append("m");
        // System.out.println(sb);

        // reverse string
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i; // 5-1-0 = 4

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);

        }
        System.out.println(sb);

    }
}
