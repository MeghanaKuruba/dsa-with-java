package LinkedList.logic;

public class ReverseKGroup {
    public static Node getKthNode(Node temp, int k){
        while(temp != null && k>1){
            temp = temp.next;
            k--;
        }
        return temp;
    }

    public static Node reverseKGroup(Node head, int k){
        Node temp = head;
        Node prev = null;

        while (temp != null) {
            Node kthNode = getKthNode(temp, k);
            if(kthNode == null){
                if(prev != null) prev.next = temp;
                break;
            }

            Node nextNode = kthNode.next;
            kthNode.next = null;
            ReverseLL.reverse(temp);
            if(temp == head){
                head = kthNode;
            }else {
                prev.next = kthNode;
            }

            prev = temp;
            temp = nextNode;
        }
        return head;
    }
}
