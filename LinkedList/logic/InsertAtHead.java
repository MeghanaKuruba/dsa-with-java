package LinkedList.logic;

public class InsertAtHead {
    public static Node insertAtHead(Node head, int el){
        if(head==null){
            return null;
        }
        Node temp = new Node(el,head);
        return temp;
    }
}
