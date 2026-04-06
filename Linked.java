class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public void DeleteAtEnd(){
        
        if(head.next==null){
            return;
        }
        Node temp =head;
        while(temp.next.next!=null){
            temp =temp.next;
        }
        temp.next= null;
    }
}

public class Linked {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtStart(5);
        list.insertAtEnd(10);
        list.insertAtEnd(15);

        list.display();
        list.DeleteAtEnd();
        list.display();
    }
}