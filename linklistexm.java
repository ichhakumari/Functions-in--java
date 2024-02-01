// link list , add and remove item from list at begining and ending of list...
public class linklistexm {
    node head;
    private int size;

    linklistexm() { // constructor
        this.size = 0;
    }

    class node {
        String data;
        node next;

        node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add - first
    public void addfirst(String data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add- last
    public void addlast(String data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        // traverse the list
        node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // print
    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");

    }

    // delete first
    public void deletefirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;

        head = head.next;
    }

    // delete last
    public void deletelast() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;

        if (head.next == null) {
            head = null;
            return;
        }

        node secondLast = head;
        node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;

    }

    // size
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        linklistexm list = new linklistexm();
        list.addfirst("a");
        list.addfirst("is");
        list.addfirst("this");
        list.printList();

        list.addlast("list");
        list.printList();

        System.out.println(list.getSize());

        System.out.println("after deletion");

        list.deletefirst();
        list.printList();

        list.deletelast();
        list.printList();

        System.out.println(list.getSize());
    }
}
