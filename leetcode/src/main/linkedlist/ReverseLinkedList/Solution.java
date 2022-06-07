package main.linkedlist.ReverseLinkedList;

import main.linkedlist.ListNode;

public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public ListNode reverseList2(ListNode head) {
        ListNode prevHead = null;
        while(head != null){
            ListNode recordNext = head.next;
            head.next = prevHead;
            prevHead = head;
            System.out.println(prevHead);
            head = recordNext;
        }
        return prevHead;
    }
}
