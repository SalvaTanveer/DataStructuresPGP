package LinkedList;

/*  Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}*/

public class ReverseLinkedlist {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        ListNode prev = null;
        while (temp != null) {
            ListNode nextNode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextNode;
        }
        head = prev;
        return head;
    }
}
