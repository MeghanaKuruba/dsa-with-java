package LinkedList.logic;

public class DeleteAtKthElement {
    public static Node deleteAtKthElement(Node head, int k){
        if(head==null){
            return null;
        }
        if (k == 1){
            Node deleteHead= DeleteHeadLL.deleteHead(head);
            return deleteHead;
        }
        Node temp=head;
        Node prev=null;
        int cnt=0;
        while (temp!=null){
            cnt++;
            if(cnt==k){
                prev.next=prev.next.next;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
}
