package test.dp.WordBreak;

import main.dp.WordBreak.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SolutionTest {
    @Test
    public void givenStringWithDict_thenCheckStringCanBeSegmentedIntoWordsInDict() {
        Assertions.assertAll(
                () -> test(true, "leetcode", List.of("leet", "code")),
                () -> test(true, "applepenapple", List.of("apple", "pen")),
                () -> test(false, "catsandog", List.of("cats", "dog","sand","and","cat"))
        );
    }

    private void test(boolean expect, String s, List<String> wordDict) {
        Solution sol = new Solution();
        boolean actual = sol.wordBreakWithDP(s, wordDict);
        Assertions.assertEquals(expect, actual);
    }
}
