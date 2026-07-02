package LinkedList.logic;

public class Add2Num {
    public static Node add(Node l1, Node l2){
        Node dummy = new Node(-1);
        Node curr = dummy;

        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int sum = carry;

            if (l1 !=null){
                sum = sum + l1.data;
                l1 = l1.next;
            }
            if (l2 != null){
                sum = sum + l2.data;
                l2 = l2.next;
            }
            carry = sum/10;

            Node newNode = new Node(sum % 10);
            curr.next = newNode;
            curr = newNode;
        }
        return dummy.next;
    }
}
