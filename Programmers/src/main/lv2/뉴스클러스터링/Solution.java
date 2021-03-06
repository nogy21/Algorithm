package Programmers.src.main.lv2.뉴스클러스터링;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * 2018 KAKAO BLIND RECRUITMENT lv2
 * 뉴스 클러스터링 (https://programmers.co.kr/learn/courses/30/lessons/17677)
 * : 여러 언론사에서 쏟아지는 뉴스, 특히 속보성 뉴스를 보면 비슷비슷한 제목의 기사가 많아 정작 필요한 기사를 찾기가 어렵다.
 *  Daum 뉴스의 개발 업무를 맡게 된 신입사원 튜브는 사용자들이 편리하게 다양한 뉴스를 찾아볼 수 있도록 문제점을 개선하는 업무를 맡게 되었다.
 *  유사한 기사를 묶는 기준을 정하기 위해서 논문과 자료를 조사하던 튜브는 "자카드 유사도"라는 방법을 찾아냈다.
 *  자카드 유사도는 집합 간의 유사도를 검사하는 여러 방법 중의 하나로 알려져 있다.
 *  두 집합 A, B 사이의 자카드 유사도 J(A, B)는 두 집합의 교집합 크기를 두 집합의 합집합 크기로 나눈 값으로 정의된다.
 *  예를 들어 집합 A = {1, 2, 3}, 집합 B = {2, 3, 4}라고 할 때, 교집합 A ∩ B = {2, 3}, 합집합 A ∪ B = {1, 2, 3, 4}이 되므로,
 *  집합 A, B 사이의 자카드 유사도 J(A, B) = 2/4 = 0.5가 된다. 집합 A와 집합 B가 모두 공집합일 경우에는 나눗셈이 정의되지 않으니 따로 J(A, B) = 1로 정의한다.
 *  자카드 유사도는 원소의 중복을 허용하는 다중집합에 대해서 확장할 수 있다. 다중집합 A는 원소 "1"을 3개 가지고 있고, 다중집합 B는 원소 "1"을 5개 가지고 있다고 하자.
 *  이 다중집합의 교집합 A ∩ B는 원소 "1"을 min(3, 5)인 3개, 합집합 A ∪ B는 원소 "1"을 max(3, 5)인 5개 가지게 된다.
 *  다중집합 A = {1, 1, 2, 2, 3}, 다중집합 B = {1, 2, 2, 4, 5}라고 하면,
 *  교집합 A ∩ B = {1, 2, 2}, 합집합 A ∪ B = {1, 1, 2, 2, 3, 4, 5}가 되므로, 자카드 유사도 J(A, B) = 3/7, 약 0.42가 된다.
 *  이를 이용하여 문자열 사이의 유사도를 계산하는데 이용할 수 있다.
 *  문자열 "FRANCE"와 "FRENCH"가 주어졌을 때, 이를 두 글자씩 끊어서 다중집합을 만들 수 있다.
 *  각각 {FR, RA, AN, NC, CE}, {FR, RE, EN, NC, CH}가 되며, 교집합은 {FR, NC}, 합집합은 {FR, RA, AN, NC, CE, RE, EN, CH}가 되므로,
 *  두 문자열 사이의 자카드 유사도 J("FRANCE", "FRENCH") = 2/8 = 0.25가 된다.
 *
 * 입력 형식
 * : 입력으로는 str1과 str2의 두 문자열이 들어온다. 각 문자열의 길이는 2 이상, 1,000 이하이다.
 *  입력으로 들어온 문자열은 두 글자씩 끊어서 다중집합의 원소로 만든다. 이때 영문자로 된 글자 쌍만 유효하고,
 *  기타 공백이나 숫자, 특수 문자가 들어있는 경우는 그 글자 쌍을 버린다. 예를 들어 "ab+"가 입력으로 들어오면, "ab"만 다중집합의 원소로 삼고, "b+"는 버린다.
 *  다중집합 원소 사이를 비교할 때, 대문자와 소문자의 차이는 무시한다. "AB"와 "Ab", "ab"는 같은 원소로 취급한다.
 *
 * 출력 형식
 * : 입력으로 들어온 두 문자열의 자카드 유사도를 출력한다. 유사도 값은 0에서 1 사이의 실수이므로, 이를 다루기 쉽도록 65536을 곱한 후에 소수점 아래를 버리고 정수부만 출력한다.
 *
 * 아이디어
 * 1. 알파벳 이외의 문자 제거 & 소문자 변환
 * 2. 문자열 두개씩 들어가는 다중집합(ngram) 생성
 * 3. 두 번째 ngram은 생성하지 않고, 첫 번째 ngram과 비교하며 합집합과 교집합 분리
 */
public class Solution {
    static final int JACCARD = 65536;

    public int solution(String str1, String str2) {
        // 문자열 정제 & ngram
        ArrayList<String> ngram1 = refine(str1);
        ArrayList<String> ngram2 = refine(str2);

        // 합집합, 교집합 크기 반환
        int[] lengths = findSetLengths(ngram1, ngram2);

        if (lengths[0] == 0) return JACCARD;
        int answer = (int) ((double)lengths[1] / lengths[0] * JACCARD);
        return answer;
    }

    private ArrayList<String> refine(String str) {
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < str.length() - 1; i++) {
            char temp1 = str.charAt(i);
            char temp2 = str.charAt(i + 1);
            if (isAlphabet(temp1) && isAlphabet(temp2)) {
                arr.add("" + Character.toString(temp1).toLowerCase() +
                        Character.toString(temp2).toLowerCase());
            }
        }
        return arr;
    }

    private boolean isAlphabet(char ch) {
        return ch >= Integer.valueOf('A') && ch <= Integer.valueOf('Z') ||
                ch >= Integer.valueOf('a') && ch <= Integer.valueOf('z');
    }

    private int[] findSetLengths(ArrayList<String> ngram1, ArrayList<String> ngram2) {
        int[] arr = new int[2];
        ArrayList<String> union = new ArrayList<>();
        ArrayList<String> intersection = new ArrayList<>();

        for (String str1 : ngram1) {
            if (ngram2.remove(str1)) {
                intersection.add(str1);
            }
            union.add(str1);
        }

        for (String str2 : ngram2) {
            union.add(str2);
        }

        arr[0] = union.size();
        arr[1] = intersection.size();

        return arr;
    }
}
