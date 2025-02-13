package LinkedList;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = null, temp = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            int ele = sum % 10;
            carry = sum / 10;
            ListNode n = new ListNode(ele);
            if (ans == null) {
                ans = n;
                temp = n;
            } else {
                temp.next = n;
                temp = n;
            }

        }

        if (carry > 0) {
            ListNode n = new ListNode(carry);
            temp.next = n;
            temp = n;
        }
        return ans;
    }
}
