package LinkedList;

public class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return head;
        }
        Node temp = head;
        // generate new nodes
        while (temp != null) {
            Node n = new Node(temp.data);
            Node nextNode = temp.next;
            temp.next = n;
            n.next = nextNode;
            temp = nextNode;
        }

        // set random pointers
        temp = head;
        while (temp != null) {
            if (temp.random != null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }

        // segregate new and old pointers
        Node ans = head.next;
        Node t1 = head;
        Node t2 = head.next;
        while (t1 != null) {
            Node tp1 = t1.next.next;
            Node tp2 = null;
            if (t2.next != null) {
                tp2 = t2.next.next;
            }

            t1.next = tp1;
            t2.next = tp2;
            t1 = tp1;
            t2 = tp2;
        }
        return ans;
    }
}
