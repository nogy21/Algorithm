package array.ContainerWithMostWater;

public class Solution {
    /**
     * brute force, 시간초과
     */
    public int maxAreaWithBruteForce(int[] height) {
        int len = height.length;
        int max = 0;
        for (int i = len - 1; i > 0; i--) {
            if (i != len - 1 && height[i] < height[i+1]) {
                continue;
            }
            for (int j = 0; j < i; j++) {
                if (j != 0 && height[j] <height[j-1]) {
                    continue;
                }
                int s = Math.min(height[i], height[j]) * (i - j);
                max = Math.max(max, s);
            }
        }
        return max;
    }

    /**
     * Two pointer
     */
    public int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int first = 0;
        int last = height.length - 1;

        while (first < last) {
            int area = Math.min(height[first], height[last]) * (last - first);
            maxArea = Math.max(maxArea, area);

            if (height[first] <= height[last]) {
                first++;
            } else {
                last--;
            }
        }
        return maxArea;
    }
}
