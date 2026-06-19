package doublyLinkedList.logic;

import java.util.HashMap;

public class LRUCache {
    private HashMap<Integer, Node> map;
    private int capacity;
    private Node head, tail;

    public LRUCache(int capacity){
        this.capacity = capacity;

        map = new HashMap<>();

        head = new Node(0, 0);
        tail = new Node(0, 0);

        head.next = tail;
        tail.back = head;
    }

    public void remove(Node node){
        node.back.next = node.next;
        node.next.back = node.back;
    }

    public void insert(Node node){
        head.next.back=node;
        node.next = head.next;

        node.back = head;
        head.next = node;
    }

    public int get(int key){
        if(!map.containsKey(key)) return -1;

        Node node = map.get(key);

        remove(node);
        insert(node);

        return node.data;
    }

    public void put(int key, int val){
        Node node = new Node(key, val);

        if(map.containsKey(key)){
            remove(map.get(key));
        }

        map.put(key,node);
        insert(node);

        if(map.size() > capacity){
            Node lru = tail.back;

            remove(lru);
            map.remove(lru.key);
        }
    }
}
