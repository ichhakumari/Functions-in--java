// link list using collection framework...

import java.util.LinkedList;

class linklistexm1 {
    public static void main(String[] args) {
        // create link list
        LinkedList<String> list = new LinkedList<String>();

        // add
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        // last
        list.addLast("list");

        System.out.println(list);
        // size
        System.out.println(list.size());

        // printing
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println();
        System.out.println(" after deletion");

        // delete

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        System.out.println(list.size());
    }
}