package LinkedList.logic;

public class Search {
    public static boolean search(Node head, int val){
        Node temp = head;
        while(temp != null){
            if(temp.data == val){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
}
