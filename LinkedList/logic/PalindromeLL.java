package LinkedList.logic;

public class PalindromeLL {
    public static boolean palindrome(Node head){
        if (head == null || head.next == null){
            return true;
        }
        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
         Node newNode = ReverseLL.reverse(slow.next);

        Node first = head;
        Node second = newNode;

        while (second != null){
            if(first.data != second.data){
                ReverseLL.reverse(newNode);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        ReverseLL.reverse(newNode);
        return true;
    }
}
