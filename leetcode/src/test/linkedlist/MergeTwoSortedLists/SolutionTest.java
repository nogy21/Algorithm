package test.linkedlist.MergeTwoSortedLists;

import main.linkedlist.ListNode;
import main.linkedlist.MergeTwoSortedLists.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void testAll() {
        Assertions.assertAll(
                () -> test(ListNode.of(1, 1, 2, 3, 4, 4), ListNode.of(1, 2, 4), ListNode.of(1, 3, 4)),
                () -> test(ListNode.of(), ListNode.of(), ListNode.of()),
                () -> test(ListNode.of(0), ListNode.of(), ListNode.of(0))
        );
    }

    private void test(ListNode expect, ListNode givenNode1, ListNode givenNode2) {
        Solution sol = new Solution();
        ListNode actual = sol.mergeTwoLists(givenNode1, givenNode2);
        Assertions.assertEquals(expect, actual);
    }
}
