package LinkedList.logic;

public class RemoveNthNodeFromEndLL { // remove nth node from end
    public static Node remove(Node head, int n){
        Node fast=head;
        Node slow=head;
        for(int i=0; i<n; i++){
            fast=fast.next;
        }
        if(fast==null){
            Node newNode=head.next;
            return newNode;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}
