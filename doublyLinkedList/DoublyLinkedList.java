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
//        Node insert = InsertBeforeKthValue.insert(head, 6,1);
//        Traversal.traversal(insert);

        LRUCache cache = new LRUCache(2);

        System.out.println("Put(1,1)");
        cache.put(1, 1);
        System.out.println("Put(2,2)");
        cache.put(2, 2);
        System.out.println("Get(2): " + cache.get(2)); // should return 1
        System.out.println("Put(3,3)");
        cache.put(3, 3); // removes key 1
        System.out.println("Get(1): " + cache.get(1)); // should return -1
        System.out.println("Put(4,4)");
        cache.put(4, 4); // removes key 2
        System.out.println("Get(2): " + cache.get(2)); // should return -1
        System.out.println("Get(3): " + cache.get(3)); // should return 3
        System.out.println("Get(4): " + cache.get(4)); // should return 4

    }
}
