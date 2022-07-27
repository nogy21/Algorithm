package main.dp.WordBreak;

import java.util.*;

/**
 * 139. Word Break (https://leetcode.com/problems/word-break/)
 * : Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.
 *  Note that the same word in the dictionary may be reused multiple times in the segmentation.
 *
 * 아이디어
 * : wordDict 내 단어의 길이를 추출한 후, 길이에 따라 조합 가능한 map 생성 후 확인.
 */
public class Solution {
    public boolean wordBreakWithDP(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        Set<String> set = new HashSet<>(wordDict);

        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = i - 1; j >= 0; j--) {
                dp[i] = dp[j] && set.contains(s.substring(j, i));
                if(dp[i]) break;
            }
        }
        return dp[s.length()];
    }

    Boolean[] mem;
    public boolean wordBreakWithDFS(String s, List<String> wordDict) {
        mem = new Boolean[s.length()];
        return dfs(0, s, new HashSet<>(wordDict));
    }
    private boolean dfs(int p, String s, Set<String> dict){
        int n = s.length();
        if(p == n) return true;
        if(mem[p] != null) return mem[p];

        for(int i = p + 1; i <= n; i++) {
            if(dict.contains(s.substring(p, i)) && dfs(i, s, dict)) {
                return mem[p] = true;
            }
        }
        return mem[p] = false;
    }
}
