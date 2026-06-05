package LinkedList.logic;

public class TraverseLL {
    public static void traverseLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
