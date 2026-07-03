package LinkedList.logic;

public class CopyLinkedListWithRandomPointerUsingNodeInsertionMethod {
    public static void insertCopyInBetween(Node head){
        Node temp = head;

        while(temp != null){
            Node copyNode = new Node (temp.data);

            copyNode.next = temp.next;
            temp.next = copyNode;
            temp = temp.next.next;
        }
    }

    public static void connectRandomPointers(Node head){
        Node temp = head;

        while (temp != null){
            Node copyNode = temp.next;

            if (temp.random != null){
                copyNode.random = temp.random.next;
            }else {
                copyNode.random = null;
            }
            temp = temp.next.next;
        }
    }

    public static Node getDeepCopyList(Node head){
        Node temp = head;
        Node dummy = new Node(-1);
        Node res = dummy;

        while (temp != null){
            Node copyNode = temp.next;
            res.next = copyNode;
            res = res.next;

            temp.next = copyNode.next;
            temp = temp.next;
        }
        return dummy.next;
    }

    public static Node copy(Node head){
        if (head == null) return null;

        insertCopyInBetween(head);
        connectRandomPointers(head);
        return getDeepCopyList(head);
    }
}
