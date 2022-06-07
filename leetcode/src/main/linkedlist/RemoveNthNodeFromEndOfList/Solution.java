package linkedlist.RemoveNthNodeFromEndOfList;

/**
 * 19. Remove Nth Node From End of List
 * : Given the head of a linked list, remove the nth node from the end of the list and return its head.
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) return null;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy, fast = dummy;

        for (int i = 0; i < n + 1; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}
