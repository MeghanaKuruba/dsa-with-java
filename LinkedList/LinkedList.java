package LinkedList;

import LinkedList.logic.*;

public class LinkedList {

    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6};
//        Node y = new Node(arr[3]);
//        System.out.println(y.data);
        Node head = ConvertArr2LL.convertArr2LL(arr);
//        System.out.println(head.data);
//        TraverseLL.traverseLL(head);
//        LengthLL length = new LengthLL(); // create an object for non-static method
//        System.out.println(length.lengthLL(head));
//        System.out.println(Search.search(head, 4));
//        Node deleteHead = DeleteHeadLL.deleteHead(head);
//        System.out.println(deleteHead.data);
//        Node deleteTail = DeleteTailLL.deleteTail(head);
//        TraverseLL.traverseLL(deleteTail);
//        Node deleteNode = DeleteAtKthElement.deleteAtKthElement(head, 8);
//        TraverseLL.traverseLL(deleteNode);
//        Node deleteValue = DeleteValue.deleteValue(head, 6);
//        Node deleteAllValues = DeleteAllValues.deleteValue(head, 6);
//        Node insertHead = InsertAtHead.insertAtHead(head, 5);
//        Node insertTail = InsertAtTail.insertAtTail(head, 9);
//        Node insert = InsertAtKthPlace.insertAtKthPlace(head, 9, 98);
//        Node insertBefore = InsertBeforeValue.insertBefore(head, 5, 3);
//        Node insertAfter = InsertAfterValue.insertAfter(head, 6,3);
//        Node reverse = ReverseLL.reverse(head); //iterative
//        Node reverse = RecursiveReverseLL.reverse(head); // using recursion
//        TraverseLL.traverseLL(reverse);
        Node mid = MidOfLL.Mid(head);
        System.out.println(mid.data);

    }
}
