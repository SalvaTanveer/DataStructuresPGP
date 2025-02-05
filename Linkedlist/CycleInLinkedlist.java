package LinkedList;

public class CycleInLinkedlist {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return false;
        }
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            // if cycle exist, slow and fast will definitely meet
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
