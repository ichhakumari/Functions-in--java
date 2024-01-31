import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {

        // Declare an ArrayList of different Types

        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<String> list = new ArrayList<String>();
        // ArrayList<Boolean> list = new ArrayList<Boolean>();

        // Add Element
        list.add(3);
        list.add(9);
        list.add(5);
        list.add(2);

        System.out.println(list);

        // Get Element
        int element = list.get(2); // at index 2
        System.out.println(element);

        // Add Element at a specific Index
        list.add(1, 7); // add 7 at index 1
        System.out.println(list);

        // Set Element at a specific Index
        list.set(1, 0); // replace 7 into 1
        System.out.println(list);

        // Delete Element from an Index
        list.remove(0); // delete elemt at index 0
        System.out.println(list);

        // Size of the List
        int size = list.size();
        System.out.println(size);

        // Loop/Iterate on the List
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Sort the List
        Collections.sort(list);
        System.out.println(list);
    }
}
