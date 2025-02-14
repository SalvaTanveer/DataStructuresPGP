package LinkedList;

import java.util.Stack;

public class FlattenDoublyLinkedList {
    public Node flatten(Node head) {
        if (head == null) {
            return head;
        }
        Node temp = head;
        Stack<Node> stk = new Stack<>();
        while (temp != null) {
            if (temp.child != null) {
                if (temp.next != null) {
                    stk.push(temp.next);
                }

                temp.next = temp.child;
                temp.child.prev = temp;
                temp.child = null;
            } else if (temp.next == null && !stk.isEmpty()) {
                Node futureNode = stk.pop();
                temp.next = futureNode;
                futureNode.prev = temp;

            }
            temp = temp.next;
        }
        return head;
    }
}
