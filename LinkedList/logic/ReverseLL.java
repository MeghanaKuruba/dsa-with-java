package LinkedList.logic;

public class ReverseLL { //iterative method
    public static Node reverse(Node head){
        Node temp = head;
        Node prev = null;
        while(temp!=null){
            Node front = temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}
