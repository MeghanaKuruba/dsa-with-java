package LinkedList.logic;

public class InsertAfterValue {
    public static Node insertAfter(Node head, int val, int el){
        if(head==null){
            System.out.println("No val found");
            return null;
        }
        if(head.data==val){
            head.next = new Node(el,head.next);
            return head;
        }
        Node temp=head;
        boolean flag=false;
        while (temp != null){
            if(temp.data==val){
                Node newNode = new Node(el);
                newNode.next=temp.next;
                temp.next=newNode;
                flag=true;
                break;
            }
            temp=temp.next;
        }
        if(!flag){
            System.out.println("val not found");
        }
        return head;
    }
}
