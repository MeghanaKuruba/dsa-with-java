package LinkedList.logic;

public class IntersectionLL {
    public static Node intersection(Node head1, Node head2){
        if (head1 == null || head2 == null){
            return null;
        }
        Node temp1 = head1;
        Node temp2 = head2;
        while(temp1!=temp2){
//            temp1 = temp1.next;
//            temp2 = temp2.next;
//
//            if(temp1==temp2){
//                return temp1;
//            }
//            if (temp1==null){
//                temp1=head2;
//            }
//            if(temp2==null){
//                temp2=head1;
//            }

            temp1 = (temp1==null) ? head2 : temp1.next;
            temp2 = (temp2==null) ? head1 : temp2.next;
        }
        return temp1;
    }
}
