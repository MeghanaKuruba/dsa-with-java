package doublyLinkedList.logic;

public class ConvertToArr {
    public static Node convertToArr(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1; i<arr.length; i++){
            Node newNode = new Node(arr[i], null, prev);
            prev.next = newNode;
            prev = newNode;
        }
        return head;
    }
}
