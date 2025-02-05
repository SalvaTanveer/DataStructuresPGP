package LinkedList;

public class ReverseLinkedlist {
    public ListNode reverseList(ListNode head) {
        // if node is null of has only one node
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        ListNode prev = null;
        while (temp != null) {
            // storing the next node
            ListNode nextNode = temp.next;
            // pointing the current node to previous node
            temp.next = prev;
            // making the current node as previous
            prev = temp;
            // making the next node as current node
            temp = nextNode;
        }
        head = prev;
        return head;
    }
}
