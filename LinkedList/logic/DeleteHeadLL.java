package LinkedList.logic;

public class DeleteHeadLL {
    public static Node deleteHead(Node head){
        Node temp = head;
        head = head.next;

        return head;
    }
}
