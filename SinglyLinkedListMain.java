package LinkedList;

public class SinglyLinkedListMain {
    public static void main(String[] args) {
        BinaryToDecimal ll = new BinaryToDecimal();
//        ll.insertLast(12);
//        ll.insertLast(20);
//        ll.insertFirst(7);
//        ll.insertFirst(6);
        ll.insertFirst(5);
        ll.insertFirst(4);
        ll.insertFirst(3);
        ll.insertFirst(2);
        ll.insertFirst(1);
        Node node = ll.get(2);
//        ll.insertFirst(14);
//        ll.display();
//        ll.insert(4);
//        ll.insert(2);
//        ll.insert(1);
//        ll.insert(3);
//        ll.insertBetween(100, 3);
//        ll.insertBetween(200, 5);
//        System.out.println(ll.delete(1));
//        ll.helper(12, 0);
//        ll.helper(13, 1);
//        ll.helper(14, 1);
//        ll.helper(2, 3);
//        ll.display();

//        ll.getDecimalValue(ll.head);
        System.out.println(ll.getDecimalValue(ll.head));
        ll.display();
    }
}
