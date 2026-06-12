package doublyLinkedList.logic;

public class InsertBeforeKthValue {
    public static Node insert(Node head, int val, int el){
        Node newNode = new Node(el);

        if(head==null) {
            return newNode;
        }

        Node temp = head;

        if(head.data == val){
            newNode.next = head;
            head.back = newNode;
            return newNode;
        }
        while (temp != null){
            if(temp.data == val){
                Node prev = temp.back;

                prev.next = newNode;
                newNode.next = temp;

                temp.back = newNode;
                newNode.back = prev;

                return head;
            }
            temp = temp.next;
        }
        // If value not found, return original list
        return head;
    }
}
