package LinkedList.logic;

public class InsertAtTail {
    public static Node insertAtTail(Node head, int el){
        if(head == null){
            return null;
        }
        Node node = new Node(el,null);

        if(head.next == null){
            head.next = node;
            return head;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        return head;
    }
}
