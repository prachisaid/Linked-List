package LinkedList;

public class LL {
    Node head;
    public void helper(int val, int index){
        head = insertRec1(val, index, head);
    }

    private Node insertRec1(int val, int index, Node node){
        if(index == 0){
            Node ans = new Node(val);
            ans.next = node;
            return ans;
        }

        node.next = insertRec1(val, --index, node.next);
        return node;
    }

    public void deleteDuplicates(Node head) {
        if(head == null){
            return;
        }

        Node ptr1 = head, ptr2 = ptr1.next;

        while(ptr2 != null){
            if(ptr1.val == ptr2.val){
                ptr1.next = ptr2.next;
                ptr2 = ptr2.next;
            }
            else{
                ptr1 = ptr1.next;
            }
        }
    }

    public Node deleteDuplicatesII(Node head) {
        if(head == null){
            return null;
        }

        Node node = head;
        Node temp = null;

        while(node.next != null){
            if(node.val == node.next.val){
                temp = node.next.next;
                node = temp;
            }
            else{
                node = node.next;
                temp = node;
            }
        }

        return head;
    }

    public boolean hasCycle(Node head) {
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return true;
            }
        }

        return false;
    }

    public int countNodesInLoop(Node head)
    {
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                Node temp = slow;
                int count = 1;

                while(temp.next != fast){
                    temp = temp.next;
                    count++;
                }

                return count;
            }
        }

        return 0;
    }

    public Node detectCycle(Node head) {
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                Node temp = head;
                int count = 0;

                while(temp != slow){
                    temp = temp.next;
                    slow = slow.next;
                    count++;
                }

                return slow;

            }
        }
        return null;
    }

    public Node middleNode(Node head) {
        Node temp = head;
        int cnt = 0;

        while(temp != null){
            temp = temp.next;
            cnt++;
        }

        if(cnt % 2 == 0){
            cnt = cnt / 2 + 1;
        }
        else{
            cnt = (int)Math.ceil(cnt/2.0);
        }

        temp = head;
        for(int i = 1; i < cnt; i++){
            temp = temp.next;
        }

        return temp;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }

}
class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
        this.next = null;
    }

    Node(int val, Node next){
        this.val = val;
        this.next = next;
    }
}
