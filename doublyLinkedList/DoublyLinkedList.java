package doublyLinkedList;


import doublyLinkedList.logic.*;

public class DoublyLinkedList {
    public static void main(String args[]){
        int[] arr = {6,4,7,2,8,9};
        Node head = ConvertToArr.convertToArr(arr);
//        System.out.println(head.data);
//        Node delete = DeleteHead.delete(head);
//        Node delete = DeleteTail.delete(head);
//        Node delete = DeleteNthNode.delete(head, 1);
//        Node delete = DeleteNthValue.delete(head, 8);
//        Node insert = InsertHead.insert(head, 5);
//        Node insert = InsertAfterTail.insert(head, 7);
//        Node insert = InsertBeforeNthNode.insert(head, 1,3);
        Node insert = InsertBeforeKthValue.insert(head, 6,1);
        Traversal.traversal(insert);
    }
}
