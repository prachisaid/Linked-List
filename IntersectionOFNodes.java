package LinkedList;

public class IntersectionOFNodes extends SinglyLinkedList{
    public Node getIntersectionNode(Node headA, Node headB) {
        Node l1 = headA;
        Node l2 = headB;

        while(l1 != null){

            while(l2 != null){
                if(l2 == l1){
                    return l2;
                }

                l2 = l2.next;
            }

            l1 = l1.next;
        }

        return null;
    }
}
