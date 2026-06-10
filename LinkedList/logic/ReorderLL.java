package LinkedList.logic;

public class ReorderLL {
    // logic:
    // 1st node, 2nd node ...
    // 1st->2nd->...
    // 1->2->3->4->5->null
    // 1->5->2->4->3->null

    public static Node reorder(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next!= null){
            slow=slow.next;
            fast=fast.next.next;
        }

        Node second = ReverseLL.reverse(slow.next);
        slow.next = null;

        Node first = head;
        while(second != null){
            Node temp1 = first.next;
            Node temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first=temp1;
            second=temp2;
        }
        return head;
    }
}
