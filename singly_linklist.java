public class singly_linklist {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    void addfirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void addlast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    void delfirst() {
        if (head == null) {
            System.out.println("the list is empty");
            return;
        }
        head = head.next;
    }

    void dellast() {
        if (head == null) {
            System.out.println("the list is empty");
            return;
        } // for single Node
        if (head.next == null) {
            head = null;
            return;
        }
        Node currNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            currNode = currNode.next;
        }
        currNode.next = null;
    }

    void printlist() {
        if (head == null) {
            System.out.println("the list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        singly_linklist list = new singly_linklist();
        list.addfirst("list");
        list.addfirst("a");
        list.addfirst("is");
        list.addfirst("this");
        list.printlist();
    }
}
