package linkedlist;

/**
 * Created by zhangyuxin on 17/1/24.
 */
public class Node {
    public int val;
    public Node next;
    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
    Node(int val) {
        this.val = val;
    }
}
