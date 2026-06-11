package doublyLinkedList.logic;

public class DeleteNthValue {
    public static Node delete(Node head, int val){
        if (head == null){
            return null;
        }
        Node temp = head;
        while(temp != null){
            Node front = temp.next;
            Node prev = temp.back;
            if(temp.data == val){
                if (prev == null && front == null){
                    return null;
                } else if (prev == null) {
                    return DeleteHead.delete(head);
                } else if (front == null) {
                    return DeleteTail.delete(head);
                }else {
                    front.back = prev;
                    prev.next = front;
                }
                temp.next = null;
                temp.back = null;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
}
