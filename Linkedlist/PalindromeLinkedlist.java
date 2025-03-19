package LinkedList;

// Checking if the linkedlist is palindrome or not using two pointers(slow, fast)

public class PalindromeLinkedlist {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode slow = head, fast = head;
        // finding the middle node of linkedlist
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // reversing the node from middle+1 to the last node
        ListNode newHead = reverse(slow.next);

        slow = head;
        fast = newHead;
        // cheking if both the halves are equal
        while (fast != null) {
            if (slow.val != fast.val) {
                // if the valus are not equal then it is not palindrome, reversing the second
                // half to bring it back to its origianl form
                ListNode temp = reverse(newHead);
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        // reversing the second half to bring it back to its origianl form
        ListNode temp = reverse(newHead);
        return true;
    }

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // reverse the remaining part
        ListNode newHead = reverse(head.next);

        // store the next node
        ListNode front = head.next;
        // pointing the next node to head(to the previous node)
        front.next = head;
        // removing the previous connection(it was pointing to the next element)
        head.next = null;

        return newHead;
    }
}
