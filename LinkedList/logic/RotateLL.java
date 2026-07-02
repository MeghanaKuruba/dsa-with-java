package LinkedList.logic;

import com.sun.source.tree.BreakTree;

public class RotateLL {
    public static Node findNthNode(Node temp, int n){
        int cnt = 1;
        while(temp != null){
            if(cnt == n) return temp;

            temp = temp.next;
            cnt++;
        }
        return temp;
    }

    public static Node rotate(Node head, int k){
        if(head == null || k==0){
            return head;
        }

        Node tail = head;
        int len = 1;

        while(tail.next != null){
            if(k % len == 0){
                return head;
            }

            tail = tail.next;
            len++;
        }
        k = k % len;

        Node newNode = findNthNode(head, k);
        head = newNode.next;
        newNode.next = null;

        return head;
    }
}
