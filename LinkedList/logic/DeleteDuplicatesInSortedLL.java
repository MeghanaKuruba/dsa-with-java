package LinkedList.logic;

public class DeleteDuplicatesInSortedLL {
    public static Node delete(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.data != temp.next.data){
                temp=temp.next;
            }else {
                temp.next=temp.next.next;
            }
        }
        return head;
    }
}
