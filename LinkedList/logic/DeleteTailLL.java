package LinkedList.logic;

public class DeleteTailLL {
    public static Node deleteTail(Node head){
        Node temp = head;
        if(head==null || head.next==null){
            return null;
        }
        while (temp.next.next!=null){
            temp=temp.next;
        }
        temp.next =null;
        return head;
    }
}
