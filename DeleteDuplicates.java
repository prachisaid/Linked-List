package LinkedList;

public class DeleteDuplicates {
    public static void main(String[] args) {
        LL ll = new LL();
        ll.helper(1, 0);
        ll.helper(2, 1);
        ll.helper(3, 2);
        ll.helper(3, 3);
        ll.helper(4, 4);
        ll.helper(4, 5);
        ll.helper(5, 6);

//        ll.deleteDuplicates(ll.head);
//        ll.display();

        System.out.println(Math.ceilDiv(6, 2));
    }
}
