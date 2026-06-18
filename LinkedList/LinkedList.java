package LinkedList;

import LinkedList.logic.*;
import LinkedList.logic.TraverseLL;
import doublyLinkedList.logic.Traversal;

import java.util.SortedMap;

public class LinkedList {

    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6};
//        int[] arr = {1,2,3,2,1};
//        int[] arr1 = {2,4,6,8};
//        Node y = new Node(arr[3]);
//        System.out.println(y.data);
//        Node head = ConvertArr2LL.convertArr2LL(arr);
//        Node head2 = ConvertArr2LL.convertArr2LL(arr1);
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
//        Node delete = DeleteDuplicatesInSortedLL.delete(head);
//        Node insertHead = InsertAtHead.insertAtHead(head, 5);
//        Node insertTail = InsertAtTail.insertAtTail(head, 9);
//        Node insert = InsertAtKthPlace.insertAtKthPlace(head, 9, 98);
//        Node insertBefore = InsertBeforeValue.insertBefore(head, 5, 3);
//        Node insertAfter = InsertAfterValue.insertAfter(head, 6,3);
//        Node reverse = ReverseLL.reverse(head); //iterative
//        Node reverse = RecursiveReverseLL.reverse(head); // using recursion
//        TraverseLL.traverseLL(reverse);
//        Node mid = MidOfLL.Mid(head);
//        System.out.println(mid.data);
//
//        Node head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//        head.next.next.next = new Node(4);
//        head.next.next.next.next = new Node(7);
//        head.next.next.next.next.next = new Node(8);
//        head.next.next.next.next.next.next = new Node(9);
//
//        // Create a cycle (4 -> 2)
////        head.next.next.next.next = head.next;
//
//        Node head2 = new Node(5);
//        head2.next = new Node(6);
//        head2.next.next = head.next.next.next.next;
//
////        System.out.println(DetectCycleLL.detect(head));
//        Node start = StartOfLoopLL.start(head);
//
//        if (start != null) {
//            System.out.println("Start of loop: " + start.data);
//        } else {
//            System.out.println("No cycle found");
//        }
//        Node delete = DeleteMidLL.delete(head);
//        Node remove = RemoveNthNodeFromEndLL.remove(head, 5);
//        TraverseLL.traverseLL(remove);
//        Node intersection = IntersectionLL.intersection(head, head2);
//        if (intersection != null) {
//            System.out.println(intersection.data);
//        } else {
//            System.out.println("No intersection found");
//        }
//        Node merge = MergeSort.merge(head, head2);
//        TraverseLL.traverseLL(merge);
//        System.out.println(PalindromeLL.palindrome(head));
//        Node reorder = ReorderLL.reorder(head);
//        TraverseLL.traverseLL(reorder);

        MergeKSortedLists obj = new MergeKSortedLists();

        // Example lists
        Node l1 = new Node(1, new Node(4, new Node(5)));
        Node l2 = new Node(1, new Node(3, new Node(4)));
        Node l3 = new Node(2, new Node(6));

        Node[] lists = {l1, l2, l3};

        Node result = obj.merge(lists);

        TraverseLL.traverseLL(result);
    }
}
