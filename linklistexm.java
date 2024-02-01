public class linklistexm {
    node head;

    class node {
        String data;
        node next;

        node(String data) {
            this.data = data;
            this.next = null;
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

    public static void main(String[] args) {
        linklistexm list = new linklistexm();
        list.addfirst("a");
        list.addfirst("is");
        list.addfirst("this");
        list.printList();

        list.addlast("list");
        list.printList();
    }
}
