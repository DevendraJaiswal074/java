package LinkedList;
public class LL {
    Node head;

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addfirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addend(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = currNode;
    }

    public void deletefirst(String data) {
        if (head == null) {
            System.out.println("empity");
            return;
        }

        head = head.next;
    }

    public void deletelast(String data){
        if(head == null){
            System.out.println("empty");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node secondNode = head;
        Node lastNode = head.next;
        while (lastNode.next!=null) {
            lastNode = lastNode.next;
            secondNode = secondNode.next;
        }

        secondNode.next = null;

    }

    public void printll() {
        if (head == null) {
            System.out.println("ll is empity");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LL obj = new LL();
        obj.addfirst("d");
        obj.printll();

    }
}