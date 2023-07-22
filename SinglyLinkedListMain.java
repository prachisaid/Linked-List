package LinkedList;

public class SinglyLinkedListMain {
    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.insertLast(12);
        ll.insertLast(20);
        ll.insertFirst(13);
        ll.insertFirst(17);
        ll.display();
//        ll.insert(12);
//        ll.insert(14);
//        ll.insert(16);
//        ll.insert(90);
//        ll.insert(80);
//        ll.insert(18);
//        ll.insertBetween(100, 3);
//        ll.insertBetween(200, 5);
        System.out.println(ll.delete(1));
        ll.display();
    }
}
