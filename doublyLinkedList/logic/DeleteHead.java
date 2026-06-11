package doublyLinkedList.logic;

public class DeleteHead {
    public static Node delete(Node head){
        if(head == null | head.next == null){
            return null;
        }
        head = head.next;
        head.next.back = null;

        return head;
    }
}
