package LinkedList.logic;

public class InsertBeforeValue {

    public static Node insertBefore(Node head, int val, int el){
        if(head == null){
            System.out.println("Val not found");
            return null;
        }
        if(head.data==val){
            Node newNode=new Node(el, head);
            return newNode;
        }
        Node temp = head;
        boolean flag = false;
        while(temp.next != null){
            if(temp.next.data==val){
                Node newNode = new Node(el);
                newNode.next = temp.next;
                temp.next = newNode;
                flag=true;
                break;
            }
            temp=temp.next;
        }
        if(!flag){
            System.out.println("Val not found");
        }
        return head;
    }
}
