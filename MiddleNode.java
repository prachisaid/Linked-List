package LinkedList;

public class MiddleNode {
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
}
