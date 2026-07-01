package LinkedList.logic;

public class MergeSort {

    //using dummyNode
    public static Node merge(Node head1, Node head2){
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;
        Node t1 = head1;
        Node t2 = head2;

        while(t1 != null && t2 != null){
            if(t1.data < t2.data){
                temp.next = t1;
                t1=t1.next;
            }else {
                temp.next=t2;
                t2=t2.next;
            }
            temp =temp.next;
        }
        if (t1 != null){
            temp.next=t1;
        }
        if (t2 != null){
            temp.next=t2;
        }
        return dummyNode.next;

        //recursive
//        if(head1==null || head2==null){
//            return head1==null? head2 : head1;
//        }
//        if(head1.data<=head2.data){
//            head1.next=merge(head1.next,head2);
//            return head1;
//        }else{
//            head2.next=merge(head1,head2.next);
//            return head2;
//        }
    }
}
