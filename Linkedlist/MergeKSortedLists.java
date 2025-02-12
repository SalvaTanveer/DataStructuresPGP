package LinkedList;

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        if (n == 0) {
            return null;
        }
        if (n == 1) {
            return lists[0];
        }
        // for every two lists apply the logic of merge two sorted linkedlists
        ListNode ans = null, h1 = lists[0], h2 = null;
        int cnt = 1;
        while (cnt < n) {
            h2 = lists[cnt];
            ans = merge(h1, h2);
            h1 = ans;
            cnt++;
        }
        return ans;
    }

    // merge two sorted linkedlists
    public ListNode merge(ListNode h1, ListNode h2) {
        if (h1 == null) {
            return h2;
        }
        if (h2 == null) {
            return h1;
        }
        ListNode t = null, ans = null;
        if (h1.val <= h2.val) {
            ans = h1;
            t = h1;
            h1 = h1.next;
        } else {
            ans = h2;
            t = h2;
            h2 = h2.next;
        }
        while (h1 != null && h2 != null) {
            if (h1.val <= h2.val) {
                t.next = h1;
                t = h1;
                h1 = h1.next;
            } else {
                t.next = h2;
                t = h2;
                h2 = h2.next;
            }
        }
        while (h1 != null) {
            t.next = h1;
            t = h1;
            h1 = h1.next;
        }
        while (h2 != null) {
            t.next = h2;
            t = h2;
            h2 = h2.next;
        }
        return ans;
    }
}
