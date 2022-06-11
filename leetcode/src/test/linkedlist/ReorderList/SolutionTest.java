package test.linkedlist.ReorderList;

import main.linkedlist.ListNode;
import main.linkedlist.ReorderList.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Example 1:
 * Input: head = [1,2,3,4]
 * Output: [1,4,2,3]
 *
 * Example 2:
 * Input: head = [1,2,3,4,5]
 * Output: [1,5,2,4,3]
 */
public class SolutionTest {
    @Test
    public void givenLinkedList_thenReorder() {
        Assertions.assertAll(
//                () -> test(ListNode.of(1,4,2,3), ListNode.of(1,2,3,4)),
//                () -> test(ListNode.of(1,5,2,4,3), ListNode.of(1,2,3,4,5)),
                () -> test(ListNode.of(1,6,2,5,3,4), ListNode.of(1,2,3,4,5,6))
//                () -> test(ListNode.of(1,9,2,8,3,7,4,6,5), ListNode.of(1,2,3,4,5,6,7,8,9))
        );
    }

    private void test(ListNode expect, ListNode given) {
        Solution sol = new Solution();
        sol.reorderList2(given);
        Assertions.assertEquals(expect, given);
    }
}
