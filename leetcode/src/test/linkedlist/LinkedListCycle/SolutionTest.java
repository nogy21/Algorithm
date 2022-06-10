package test.linkedlist.LinkedListCycle;

import main.linkedlist.LinkedListCycle.Solution;
import main.linkedlist.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testAll() {
        Assertions.assertAll(
                () -> {
                    ListNode head = ListNode.of(3);
                    ListNode next = ListNode.of(2, 0);
                    ListNode last = ListNode.of(-4);
                    head.next = next;
                    next.next = last;
                    last.next = next;
                    test(true, head);
                },
                () -> {
                    ListNode head = ListNode.of(1);
                    ListNode last = ListNode.of(2);
                    head.next = last;
                    last.next = head;
                    test(true, head);
                },
                () -> {
                    ListNode head = ListNode.of(1);
                    test(true, head);
                }
        );
    }

    private void test(boolean expect, ListNode givenNode) {
        Solution sol = new Solution();
        boolean actual = sol.hasCycle(givenNode);
        Assertions.assertEquals(expect, actual);
    }
}
