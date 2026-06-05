package LinkedList.logic;

import java.util.logging.SocketHandler;

public class DeleteValue {
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
                return head;
            }
            temp=temp.next;
        }
        if(!found){
            throw new RuntimeException(value+" is not present in list");
        }
        return head;
    }
}
