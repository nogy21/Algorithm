package Programmers.src.test.lv3.추석트래픽;

import Programmers.src.main.lv3.추석트래픽.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void solution() {
        Solution sol = new Solution();

        Assertions.assertAll(
                () -> Assertions.assertEquals(1, sol.solution(new String[]{"2016-09-15 01:00:04.001 2.0s",
                        "2016-09-15 01:00:07.000 2s"})),
                () -> Assertions.assertEquals(2, sol.solution(new String[]{"2016-09-15 01:00:04.002 2.0s",
                        "2016-09-15 01:00:07.000 2s"})),
                () -> Assertions.assertEquals(7, sol.solution(new String[]{"2016-09-15 20:59:57.421 0.351s",
                        "2016-09-15 20:59:58.233 1.181s",
                        "2016-09-15 20:59:58.299 0.8s",
                        "2016-09-15 20:59:58.688 1.041s",
                        "2016-09-15 20:59:59.591 1.412s",
                        "2016-09-15 21:00:00.464 1.466s",
                        "2016-09-15 21:00:00.741 1.581s",
                        "2016-09-15 21:00:00.748 2.31s",
                        "2016-09-15 21:00:00.966 0.381s",
                        "2016-09-15 21:00:02.066 2.62s"}))
                );
    }
}
