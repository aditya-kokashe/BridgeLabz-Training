//LeetCode 706 – Design HashMap

public class MyHashMap {
    //Main method
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);

        System.out.println(map.get(1));   
        System.out.println(map.get(2));   
        System.out.println(map.get(3));   

        map.put(2, 99);                   
        System.out.println(map.get(2));   

        map.remove(3);
        System.out.println(map.get(3));   
    }

    static class HashMap {
        //Node
        static class Node {
            int key, value;
            Node next;
            Node(int k, int v) {
                key = k;
                value = v;
            }
        }
        private final int SIZE = 1000;
        private Node[] buckets;
        public HashMap() {
            buckets = new Node[SIZE];
        }
        public void put(int key, int value) {
            int index = key % SIZE;
            Node head = buckets[index];
            if (head == null) {
                buckets[index] = new Node(key, value);
                return;
            }
            Node curr = head;
            while (true) {
                if (curr.key == key) {
                    curr.value = value;
                    return;
                }
                if (curr.next == null) break;
                curr = curr.next;
            }
            curr.next = new Node(key, value);
        }
        public int get(int key) {
            int index = key % SIZE;
            Node curr = buckets[index];
            while (curr != null) {
                if (curr.key == key) return curr.value;
                curr = curr.next;
            }
            return -1;
        }
        public void remove(int key) {
            int index = key % SIZE;
            Node curr = buckets[index];
            Node prev = null;
            while (curr != null) {
                if (curr.key == key) {
                    if (prev == null)
                        buckets[index] = curr.next;
                    else
                        prev.next = curr.next;
                    return;
                }
                prev = curr;
                curr = curr.next;
            }
        }
    }
}
