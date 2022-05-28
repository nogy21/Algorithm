package main.array.ProductOfArrayExceptSelf;

public class Solution {
    /**
     * 238. Product of Array Except Self - Medium
     * : Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
     *  The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
     *  You must write an algorithm that runs in O(n) time and without using the division operation.
     *
     * 아이디어
     * : 해당 인덱스의 값을 제외한 다른 인덱스들의 값을 모두 곱한 값이 각 요소에 할당되어야 함.
     *  문제 설명에서 prefix, suffix 힌트가 나옴. -> 누적합 개념을 응용해서 왼쪽부터 차례대로 곱한 배열과 오른쪽부터 차례대로 곱한 배열을 이용.
     *  해당 인덱스를 중심으로 우측부터 시작한 배열과 좌측부터 시작한 배열의 값을 곱하면 해당 인덱스를 제외한 값들의 곱을 구할 수 있음.
     *  arr[i] = left[i-1] * right[i+1]
     */
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] answer = new int[len];
        int[] left = new int[len];
        int[] right = new int[len];
        left[0] = nums[0];

        for (int i = 1; i < len; i++) {
            left[i] = left[i - 1] * nums[i];
        }

        right[len - 1] = nums[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i];
        }
        answer[0] = right[1];
        answer[len - 1] = left[len - 2];

        for (int i = 1; i < len - 1; i++) {
            answer[i] = left[i - 1] * right[i + 1];
        }

        return answer;
    }
}