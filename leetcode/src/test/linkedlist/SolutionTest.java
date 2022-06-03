package test.linkedlist;

import main.linkedlist.ReverseLinkedList.ListNode;
import main.linkedlist.ReverseLinkedList.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void givenLinkedList_whenIterativeReverse_thenOutputCorrectResult() {
        assertAll(
                () -> test(ListNode.of(5,4,3,2,1), ListNode.of(1,2,3,4,5))
        );
    }

    private void test(ListNode expected, ListNode given) {
        // when
        Solution sol = new Solution();
        ListNode actual = sol.reverseList(given);

        // then
        assertEquals(expected, actual);
    }
}
