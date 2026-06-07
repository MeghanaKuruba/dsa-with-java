package LinkedList.logic;

public class MidOfLL { // Tortise and Har Algorithm
    public static Node Mid(Node head){
        if(head==null){
            return null;
        }
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
