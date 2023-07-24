package LinkedList;

public class SinglyLinkedListMain {
    public static void main(String[] args) {
        ReverseRecursive ll = new ReverseRecursive();
//        ll.insertLast(12);
//        ll.insertLast(20);
        ll.insertFirst(13);
        ll.insertFirst(17);
        ll.insertFirst(20);
        ll.insertFirst(11);
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

        ll.reverse(new Node(-1, ll.head));
        ll.display();
    }
}
