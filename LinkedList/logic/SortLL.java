package LinkedList.logic;

import com.sun.source.tree.BreakTree;

public class SortLL { // using merge sort
    public static Node findMiddle(Node head){
        // my MidOfLL code will stop at 3rd node if list is even number(4),
        // but we want to stop at 2nd only so fast = head.next;
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node sortLL(Node head){
        if (head == null || head.next == null) {
            return head;
        }

        Node middle = findMiddle(head);

        Node leftHead = head;
        Node rightHead = middle.next;
        middle.next = null;

        leftHead = sortLL(leftHead);
        rightHead = sortLL(rightHead);

        return Merge2SortedLists.merge(leftHead, rightHead);
    }
}
