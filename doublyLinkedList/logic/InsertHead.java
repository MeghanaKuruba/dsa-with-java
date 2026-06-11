package doublyLinkedList.logic;

public class InsertHead {
    public static Node insert(Node head, int val){
        Node newNode = new Node(val);
        if(head == null){
            return newNode;
        }
        newNode.next = head;
        head.back = newNode;
        head = newNode;

        return head;
    }
}
