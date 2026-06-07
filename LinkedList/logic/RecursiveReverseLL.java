package LinkedList.logic;

public class RecursiveReverseLL {

    public static Node reverse(Node head){
        if (head == null || head.next == null){
            return head;
        }

        Node newHead = reverse(head.next);
        Node front = head.next;
        front.next=head;
        head.next=null;

        return newHead;
    }
}
