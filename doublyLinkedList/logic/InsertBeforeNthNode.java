package doublyLinkedList.logic;

public class InsertBeforeNthNode {
    public static Node insert(Node head, int val, int k){

        Node newNode = new Node(val);
        Node temp = head;
        int cnt = 1;

        while (temp != null){

            if(cnt == k) {

                Node prev = temp.back;

                // Insert at head
                if (prev == null) {
                    newNode.next = temp;
                    temp.back = newNode;
                    return newNode;
                }

                // Insert before kth node
                prev.next = newNode;
                newNode.back = prev;

                newNode.next = temp;
                temp.back = newNode;

                return head;
            }

            temp = temp.next;
            cnt++;
        }

        return head;
    }
}