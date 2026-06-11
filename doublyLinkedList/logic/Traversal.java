package doublyLinkedList.logic;

public class Traversal {
    public static void traversal(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
}
