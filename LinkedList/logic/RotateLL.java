package LinkedList.logic;

public class RotateLL {
    public static Node findNthNode(Node temp, int n){
        int cnt = 1;
        while(temp != null){
            if(cnt == n) return temp;

            temp = temp.next;
            cnt++;
        }
        return null;
    }

    public static Node rotate(Node head, int k){
        if (head == null || head.next == null) return head;

        int len = 1;
        Node tail = head;
        while (tail.next != null){
            tail = tail.next;
            len++;
        }

        if(k % len == 0) return head;

        k = k % len;

        Node newNode = findNthNode(head, len-k);
        tail.next = head;
        head = newNode.next;
        newNode.next = null;

        return head;
    }
}
