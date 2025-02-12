package LinkedList;

public class SwapKthNodeFromEnds {
    public Node swapKthNode(Node head, int k) {
        // code here
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        if (k > size) {
            return head;
        }
        Node prev1 = null, curr1 = head;
        Node prev2 = null, curr2 = head;
        Node current = head;

        for (int i = 1; i < k; i++) {
            prev1 = current;
            curr1 = current.next;

            current = current.next;
        }
        current = head;
        for (int i = 1; i <= size - k; i++) {

            prev2 = current;
            curr2 = current.next;

            current = current.next;
        }
        if (curr1 == curr2) {
            return head;
        }
        if (prev1 != null) {
            prev1.next = curr2;
        }
        if (prev2 != null) {
            prev2.next = curr1;
        }

        Node tempNext = curr1.next;
        curr1.next = curr2.next;
        curr2.next = tempNext;

        if (k == 1) {
            head = curr2;
        }
        if (k == size) {
            head = curr1;
        }

        return head;
    }
}
