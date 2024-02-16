import javax.swing.plaf.synth.SynthOptionPaneUI;

public class doubly_linklist {
    Node head;

    class Node {
        int data;
        Node next;
        Node previous;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.previous = newNode;
        head = newNode;
    }

    void addlast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newnode;
    }

    void delfirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        head.previous = null;
    }

    void dellast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        // for single node
        if (head.next == null) {
            head = null;
            head.previous = null;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
    }

    void printlist() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node last = head;
        while (last != null) {
            System.out.println(last.data + " ");
            last = last.next;
        }
    }

    public static void main(String[] args) {
        doubly_linklist list = new doubly_linklist();
        list.addFirst(5);
        list.addFirst(6);
        list.addFirst(0);
        list.delfirst();
        list.addlast(3);
        list.dellast();
        list.printlist();
    }

}
