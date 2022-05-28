package main.array.MissingNumber;

public class Solution {
    /**
     * Missing Number
     * : Given an array nums containing n distinct numbers in the range [0, n],
     *  return the only number in the range that is missing from the array.
     *
     * 아이디어
     * : 시간복잡도 고려, 별도의 자료구조 사용 없이 반복문의 인덱스를 활용해서 풀이.
     */
    public int missingNumber(int[] nums) {
        int answer = 0;
        for(int i = 1; i < nums.length + 1; i++) {
            answer += i; // n까지 모두 더한다
            answer -= nums[i - 1]; // 배열의 요소를 빼다보면, 남은 값이 정답
        }
        return answer;
    }
}