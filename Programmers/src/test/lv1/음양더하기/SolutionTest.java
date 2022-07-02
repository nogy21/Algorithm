package Programmers.src.test.lv1.음양더하기;

import Programmers.src.main.lv1.음양.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 입출력 예
 *  absolutes	      signs	      result
 *  [4,7,12]	[true,false,true] 	 9
 *  [1,2,3]	    [false,false,true] 	 0
 *
 * 입출력 예 #1
 *  signs가 [true,false,true] 이므로, 실제 수들의 값은 각각 4, -7, 12입니다.
 *  따라서 세 수의 합인 9를 return 해야 합니다.
 * 입출력 예 #2
 *  signs가 [false,false,true] 이므로, 실제 수들의 값은 각각 -1, -2, 3입니다.
 *  따라서 세 수의 합인 0을 return 해야 합니다.
 */
public class SolutionTest {
    @Test
    public void given() {
        Assertions.assertAll(
                () -> test(9, new int[]{4, 7, 12}, new boolean[]{true, false, true})
        );
    }

    private void test(int expect, int[] absolutes, boolean[] signs) {
        Solution sol = new Solution();
        int actual = sol.solution(absolutes, signs);
        Assertions.assertEquals(expect, actual);
    }
}
