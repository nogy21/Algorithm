package test.lv3.단어변환;

import main.lv3.단어변환.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void solution() {
        Solution sol = new Solution();

        assertAll(
                () -> assertEquals(4, sol.solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log", "cog"})),
                () -> assertEquals(0, sol.solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log"}))
        );
    }
}
