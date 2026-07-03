package LinkedList.logic;

import java.util.HashMap;

public class CopyListWithRandomPointersUsingHashMap {
    public static Node copy(Node head){
        if(head == null) return null;

        Node curr = head;

        HashMap<Node, Node> map = new HashMap<>();
        while(curr != null){
            map.put(curr, new Node(curr.data));
            curr = curr.next;
        }

        curr = head;

        while (curr != null){
            Node copyNode = map.get(curr); // get(ket) gives value, curr is key, so copyNode's actual value will be new Node(curr.next)

            copyNode.next = map.get(curr.next);
            copyNode.random = map.get(curr.random);

            curr = curr.next;
        }
        return map.get(head);
    }
}
