package LinkedList;

public class LengthOfLoop {
    public int countNodesinLoop(Node head) {
        // Add your code here.
        if (head == null || head.next == null || head.next.next == null) {
            return 0;
        }
        Node slow = head, fast = head;
        // check if a cycle exist in linkedlist
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        // if fast is null then no cycle exist and return zero
        if (fast == null || fast.next == null) {
            return 0;
        }
        // count the number of nodes until slow and fast pointer meet
        int cnt = 1;
        while (slow != fast) {
            fast = fast.next;
            ++cnt;
        }
        return cnt;
    }
}
