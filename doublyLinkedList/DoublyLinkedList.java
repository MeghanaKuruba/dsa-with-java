package doublyLinkedList;


import doublyLinkedList.logic.*;

public class DoublyLinkedList {
    public static void main(String args[]){
//        int[] arr = {6,4,7,2,8,9};
//        Node head = ConvertToArr.convertToArr(arr);
//        System.out.println(head.data);
//        Node delete = DeleteHead.delete(head);
//        Node delete = DeleteTail.delete(head);
//        Node delete = DeleteNthNode.delete(head, 1);
//        Node delete = DeleteNthValue.delete(head, 8);
//        Node insert = InsertHead.insert(head, 5);
//        Node insert = InsertAfterTail.insert(head, 7);
//        Node insert = InsertBeforeNthNode.insert(head, 1,3);
//        Node insert = InsertBeforeKthValue.insert(head, 6,1);
//        Traversal.traversal(insert);

//        LRUCache cache = new LRUCache(2);
//
//        System.out.println("Put(1,1)");
//        cache.put(1, 1);
//        System.out.println("Put(2,2)");
//        cache.put(2, 2);
//        System.out.println("Get(2): " + cache.get(2)); // should return 1
//        System.out.println("Put(3,3)");
//        cache.put(3, 3); // removes key 1
//        System.out.println("Get(1): " + cache.get(1)); // should return -1
//        System.out.println("Put(4,4)");
//        cache.put(4, 4); // removes key 2
//        System.out.println("Get(2): " + cache.get(2)); // should return -1
//        System.out.println("Get(3): " + cache.get(3)); // should return 3
//        System.out.println("Get(4): " + cache.get(4)); // should return 4

        // Creating multilevel list:
        //
        // 1 - 2 - 3 - 4 - 5 - 6
        //         |
        //         7 - 8 - 9 - 10
        //             |
        //             11 - 12

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);
        Node n10 = new Node(10);
        Node n11 = new Node(11);
        Node n12 = new Node(12);

        // Level 1
        n1.next = n2;
        n2.back = n1;

        n2.next = n3;
        n3.back = n2;

        n3.next = n4;
        n4.back = n3;

        n4.next = n5;
        n5.back = n4;

        n5.next = n6;
        n6.back = n5;

        // Level 2
        n3.child = n7;

        n7.next = n8;
        n8.back = n7;

        n8.next = n9;
        n9.back = n8;

        n9.next = n10;
        n10.back = n9;

        // Level 3
        n8.child = n11;

        n11.next = n12;
        n12.back = n11;

        // Head
        Node head = n1;

        Node flatten = FlattenDLL.flattenDLL(head);

        Traversal.traversal(flatten);

    }
}
