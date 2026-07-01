package LinkedList.logic;

public class InsertAtKthPlace {
    public static Node insertAtKthPlace(Node head, int k, int el){
        if (head == null) {
                return new Node(el);
        }
        if(k==1){
//            Node insert =InsertAtHead.insertAtHead(head, el);
//            return insert;
            return new Node(el, head);
        }
        int cnt = 0;
        Node temp=head;
        while (temp!=null){
            cnt++;
            if(cnt==k-1){
                Node newNode = new Node(el, temp.next);
                temp.next=newNode;
            }
            temp=temp.next;
        }
        return head;
    }
}
