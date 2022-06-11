package main.linkedlist.MergekSortedLists;

import main.linkedlist.ListNode;

import java.util.PriorityQueue;

/**
 * 23. Merge k Sorted Lists
 * : You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 *  Merge all the linked-lists into one sorted linked-list and return it.
 */
public class Solution {
    /**
     * recursive
     */
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        int len = lists.length;
        while (len != 1) {
            for (int i = 0; i < len / 2; i++) {
                lists[i] = mergeTwoLists(lists[i * 2], lists[i * 2 + 1]);
            }
            if (len % 2 == 1) {
                lists[len / 2] = lists[len - 1];
            }
            len = (len + 1) / 2;
        }
        return lists[0];
    }

    private ListNode mergeTwoLists(ListNode node1, ListNode node2) {
        if (node1 == null) return node2;
        if (node2 == null) return node1;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (node1 != null || node2 != null) {
            if (node2 == null || node1 != null && node1.val < node2.val) {
                curr.next = node1;
                node1 = node1.next;
            } else {
                curr.next = node2;
                node2 = node2.next;
            }
            curr = curr.next;
        }
        return dummy.next;
    }

    /**
     * minimum priority queue
     */
    public ListNode mergeKListsWithPQ(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;

        PriorityQueue<ListNode> minPQ = new PriorityQueue<>((o1, o2) -> {
            return o1.val - o2.val;
        });

        for (ListNode node : lists) {
            if (node != null) {
                minPQ.offer(node);
            }
        }

        while (minPQ.size() > 0) {
            ListNode curr = minPQ.poll();
            prev.next = curr;
            prev = prev.next;

            if (curr.next != null) {
                minPQ.offer(curr.next);
            }
        }
        return dummy.next;
    }

    /**
     * Divide and Conquer
     */
    public ListNode mergeKListsWithDivideAndConquer(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        return divideAndConquer(lists, 0, lists.length - 1);
    }

    private ListNode divideAndConquer(ListNode[] lists, int lo, int hi) {
        if (lo > hi) {
            return null;
        }
        if (lo == hi) {
            return lists[lo];
        }
        int mid = lo + (hi - lo) / 2;
        ListNode left = divideAndConquer(lists, lo, mid);
        ListNode right = divideAndConquer(lists, mid + 1, hi);
        return mergeLists(left, right);
    }

    private ListNode mergeLists(ListNode n1, ListNode n2) {
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n1 != null && n2 != null) {
            if (n1.val < n2.val) {
                prev.next = n1;
                n1 = n1.next;
            } else {
                prev.next = n2;
                n2 = n2.next;
            }
            prev = prev.next;
        }
        prev.next = (n1 != null) ? n1 : n2;
        return dummy.next;
    }
}
