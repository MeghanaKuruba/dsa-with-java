package doublyLinkedList.logic;

public class DeleteTail {
    public static Node delete(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next.back = null;
        temp.next = null;

        return head;
    }
}
