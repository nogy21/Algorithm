package test.linkedlist.RemoveNthNodeFromEndOfList;

import main.linkedlist.ListNode;
import main.linkedlist.RemoveNthNodeFromEndOfList.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void givenLinkedListAndInteger_thenRemoveNthNode() {
        Assertions.assertAll(
                () -> test(ListNode.of(1,2,3,5),
                        ListNode.of(1,2,3,4,5), 2),
                () -> test(ListNode.of(),
                        ListNode.of(1), 1),
                () -> test(ListNode.of(1),
                        ListNode.of(1,2), 1)
        );
    }

    private void test(ListNode expect, ListNode given, int n) {
        Solution sol = new Solution();
        ListNode actual = sol.removeNthFromEnd(given, n);
        Assertions.assertEquals(expect, actual);
    }
}
