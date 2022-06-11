package test.linkedlist.MergekSortedLists;

import main.linkedlist.ListNode;
import main.linkedlist.MergekSortedLists.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void givenLinkedList_whenIterativeMerge_thenOutputCorrectResult() {
        assertAll(
                () -> test(ListNode.of(1,1,2,3,4,4,5,6),
                        new ListNode[]{ListNode.of(1,4,5), ListNode.of(1,3,4), ListNode.of(2,6)}),
                () -> test(ListNode.of(),
                        new ListNode[]{ListNode.of(), ListNode.of(), ListNode.of()}),
                () -> test(ListNode.of(1,2,5),
                        new ListNode[]{ListNode.of(1,2), ListNode.of(), ListNode.of(5)}),
                () -> test(ListNode.of(1,2,4,4,5),
                        new ListNode[]{ListNode.of(1,4,5), ListNode.of(2,4)}),
                () -> test(ListNode.of(1),
                        new ListNode[]{ListNode.of(1)}),
                () -> test(ListNode.of(),
                        new ListNode[]{})
        );
    }

    private void test(ListNode expect, ListNode[] given) {
        Solution sol = new Solution();

//        ListNode actual = sol.mergeKLists(given);
//        assertEquals(expect, actual);

        ListNode actual2 = sol.mergeKListsWithPQ(given);
        assertEquals(expect, actual2);

//        ListNode actual3 = sol.mergeKListsWithDivideAndConquer(given);
//        assertEquals(expect, actual3);
    }
}
