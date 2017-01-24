package linkedlist;


public class Main {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertFromTail(1);
       // list.insertFromTail(2);
       // list.insertFromTail(3);
       // list.insertFromTail(9);
        list.printAllNodes();
        list.deleteFromTail();
        System.out.println();
        list.printAllNodes();
    }
}
