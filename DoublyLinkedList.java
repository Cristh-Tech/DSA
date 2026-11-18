
public class DoublyLinkedList {

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }

	
    }

    public static void main(String[] args) {
        
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

	
        first.next = second;
        second.next = third;
        third.next = null;   

        
        first.prev = null;   
        second.prev = first;
        third.prev = second;

        System.out.println();

        System.out.print("Forward: ");
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
        
        System.out.print("\nBackward: ");
        temp = third;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }

        System.out.println();

    }
}
