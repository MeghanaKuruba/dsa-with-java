package LinkedList.logic;

public class DeleteAllValues {
    public static Node deleteValue(Node head, int value){
        if(head==null){
            return null;
        }
        boolean found = false;
        if (head.data == value){
//            Node deleteHead= DeleteHeadLL.deleteHead(head);
//            return deleteHead;
            found = true;
            return head.next;
        }

        Node temp=head;
        while (temp != null && temp.next !=null){
            if(temp.next.data == value){
                temp.next = temp.next.next;
                found=true;
            }
            temp=temp.next;
        }
        if(!found){
            throw new RuntimeException(value+" is not present in list");
        }
        return head;
    }
}
