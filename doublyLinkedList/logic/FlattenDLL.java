package doublyLinkedList.logic;

public class FlattenDLL {
    public static Node flattenDLL(Node head){
        if(head == null) return head;

        Node curr = head;

        while(curr != null){
            if(curr.child != null){
                Node nextNode = curr.next;

                curr.next = curr.child;
                curr.child.back = curr;
                curr.child = null;

                Node temp = curr;
                while (temp.next != null){
                    temp = temp.next;
                }

                if(nextNode != null){
                    temp.next = nextNode;
                    nextNode.back = temp;
                }
            }
            curr = curr.next;
        }
        return head;
    }
}
