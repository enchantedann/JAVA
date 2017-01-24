package linkedlist;

public class SinglyLinkedList {
    //归并排序
    public Node head;
    public Node tail;
    int size = 0;

    public void insertFromTail(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        size++;
    }

    public void deleteFromTail() {
        if (head == null) {
            return;
        }

        if (size == 1) {
            head = null;
            tail = null;
            size--;
            return;
        }

        Node p = head;
        while (p.next != tail){
            p=p.next;
        }
        tail=p;
        tail.next=null;
        size--;
    }

    public void printAllNodes() {
        Node p = head;
        while (p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
    }

}
