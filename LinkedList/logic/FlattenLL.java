package LinkedList.logic;

public class FlattenLL {
    public static Node merge(Node list1, Node list2){
        Node dummy = new Node(-1);
        Node res = dummy;

        while(list1 != null && list2 != null){
            if(list1.data < list2.data){
                res.child = list1;
                list1 = list1.child;
            }else {
                res.child = list2;
                list2 = list2.child;
            }
            res = res.child;
            res.next = null;
        }
        if (list1 != null){
            res.child = list1;
        }else {
            res.child = list2;
        }

        Node temp = res.child;
        while (temp != null) {
            temp.next = null;
            temp = temp.child;
        }

        return dummy.child;
    }

    public static Node flattenLL(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node mergeHead = FlattenLL.flattenLL(head.next);
        head = merge(head, mergeHead);
        return head;
    }
}
