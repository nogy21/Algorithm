package main.linkedlist.ReorderList;

import main.linkedlist.ListNode;

/**
 * 143. Reorder List
 * : You are given the head of a singly linked-list. The list can be represented as:
 *      L0 → L1 → … → Ln - 1 → Ln
 *  Reorder the list to be on the following form:
 *      L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
 *  You may not modify the values in the list's nodes. Only nodes themselves may be changed.
 *
 * 아이디어
 * : 1.중간을 찾아 2.절반을 나눠 뒤쪽 노드를 역순으로 정렬한 뒤 3.두 리스트를 합친다
 */
public class Solution {
    public void reorderList(ListNode head) {
        if (head == null) return;

        // find the middle of the list
        ListNode p1 = head, p2 = head;
        while (p2.next != null && p2.next.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }

        // reverse the half after middle, eg: 1->2->3->4->5->6  =>  1->2->3->6->5->4
        ListNode preMiddle = p1; // 3,4,5,6
        ListNode preCurrent = p1.next; // 4,5,6
        while (preCurrent.next != null) {
            ListNode current = preCurrent.next;
            preCurrent.next = current.next;
            current.next = preMiddle.next;
            preMiddle.next = current;
//            System.out.println("current = " + current);
//            System.out.println("preCurrent.next = " + preCurrent.next);
//            System.out.println("current.next = " + current.next);
//            System.out.println("preMiddle.next = " + preMiddle.next);
//            System.out.println("********");
        }

        // Start reorder one by one
        // head: 1->2->3->6->5->4 => 1->6->2->3->5->4 => 1->6->2->5->3->4
        p1 = head;
        p2 = preMiddle.next;
//        System.out.println("p1 = " + p1); // 1,2,3,6,5,4
//        System.out.println("p2 = " + p2); // 6,5,4
//        System.out.println("preMiddle = " + preMiddle); // 3,6,5,4
        while (p1 != preMiddle) {
            preMiddle.next = p2.next;
            p2.next = p1.next;
            p1.next = p2;
            p1 = p2.next;
            p2 = preMiddle.next;
//            System.out.println("p1 = " + p1);
//            System.out.println("p2 = " + p2);
//            System.out.println("head = " + head);
        }

        // if the size of list is odd, we need to set the right tail to null
        // to avoid cycling linked list
        if (p2 == null) p1.next = null;
    }

    /**
     * 메소드 분리
     */
    public void reorderList2(ListNode head) {
        if (head == null || head.next == null) return;

        // step 1. cut the list to two halves
        ListNode midNode = findMid(head);
        ListNode nextToMid = midNode.next;
        midNode.next = null;

        // step 2. reverse the 2nd half
        ListNode p2 = reverse(nextToMid);

        // step 3. merge the two halves
        ListNode p1 = head;
        merge(p1, p2);
    }

    private ListNode findMid(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    private void merge(ListNode p1, ListNode p2) {
        // p1 == head
        while (p1 != null && p2 != null) {
            ListNode temp = p1.next;
            p1.next = p2;
            p1 = p2;
            p2 = temp;
        }
    }
}
