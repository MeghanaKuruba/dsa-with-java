package LinkedList.logic;

import java.util.PriorityQueue;

public class MergeKSortedLists {
    public static Node merge(Node[] lists){
        if(lists == null || lists.length == 0){
            return null;
        }
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.data - b.data);

        for(int i = 0; i < lists.length; i++){
            if(lists[i] != null){
                pq.offer(lists[i]); // adding head of each node
            }
        }

        Node dummy = new Node(0);
        Node temp = dummy;

        while(!pq.isEmpty()){
            Node newNode = pq.poll();
            temp.next = newNode;
            temp = newNode;

            if(newNode.next != null){
                pq.offer(newNode.next);
            }
        }
        return dummy.next;
    }
}
