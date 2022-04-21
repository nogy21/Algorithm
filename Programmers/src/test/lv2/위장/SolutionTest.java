package test.lv2.위장;

import main.lv2.위장.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void solution() {
        Solution sol = new Solution();

        assertAll(
                () -> assertEquals(5,
                        sol.solution(new String[][]{{"yellowhat", "headgear"},{"bluesunglasses", "eyewear"},{"green_turban", "headgear"}})),
                () -> assertEquals(3,
                        sol.solution(new String[][]{{"crowmask", "face"},{"bluesunglasses", "face"},{"smoky_makeup", "face"}}))
        );
    }
}
