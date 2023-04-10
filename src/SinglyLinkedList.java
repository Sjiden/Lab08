class Node {
    public int data;
    public Node next;

    public Node(int initialData) {
        data = initialData;
        next = null;
    }
}

public class SinglyLinkedList {
    private Node head;
    private Node tail;
    int count;

    public SinglyLinkedList() {
        head = null;
        tail = null;
        count = 0;
    }

    public void append(Node newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        ++count;
    }
    
    public int sumList() {
        int sum = 0;
        Node current = head;
        while (current != null) {
            sum += current.data;
            current = current.next;
        }
        return sum;
    }

    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}