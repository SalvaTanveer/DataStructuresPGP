package LinkedList;

//using two pinters to find the middle of linked list
// works for both even and odd length
public class MiddleOfLinkedlist {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        ListNode slow = temp, fast = temp;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
