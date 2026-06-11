package doublyLinkedList.logic;

public class DeleteNthNode {
    public static Node delete(Node head, int k){
        if (head == null){
            return null;
        }
        Node temp = head;
        int cnt = 1;
        while(temp != null){
            Node front = temp.next;
            Node prev = temp.back;
            if(cnt == k){
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
            cnt++;
        }
        return head;
    }
}
