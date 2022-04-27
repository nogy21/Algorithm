package main.lv1.신고결과받기;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * 2022 KAKAO BLIND RECRUITMENT (lv1 신고 결과 받기)
 * - 각 유저는 한 번에 한 명의 유저를 신고할 수 있습니다.
 * - 신고 횟수에 제한은 없습니다. 서로 다른 유저를 계속해서 신고할 수 있습니다.
 * - 한 유저를 여러 번 신고할 수도 있지만, 동일한 유저에 대한 신고 횟수는 1회로 처리됩니다.
 * - k번 이상 신고된 유저는 게시판 이용이 정지되며, 해당 유저를 신고한 모든 유저에게 정지 사실을 메일로 발송합니다.
 * - 유저가 신고한 모든 내용을 취합하여 마지막에 한꺼번에 게시판 이용 정지를 시키면서 정지 메일을 발송합니다.
 *
 * 아이디어
 * : 동일한 유저에 대한 신고 횟수는 1회이므로 Set 사용,
 * 1. 중복 제거
 * 2. 신고한 유저 목록 정리 & 신고된 유저 리스트 저장
 * 3. 정지된 유저를 신고한 유저 리스트 정리
 */
public class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        // 중복 제거
        HashSet<String> reportSet = new HashSet<>();
        for (String r : report) {
            reportSet.add(r);
        }

        // 신고받은유저, 신고한 유저 목록 정리
        HashMap<String, ArrayList<String>> reportMap = findReporterList(reportSet);

        // 정지된 유저 판단, 신고한 유저에게 알림
        HashMap<String, Integer> reporterMap = new HashMap<>();
        for (ArrayList<String> reporterList : reportMap.values()) {
            if (reporterList.size() >= k) {
                for (String reporter : reporterList) {
                    reporterMap.put(reporter, reporterMap.getOrDefault(reporter, 0) + 1);
                }
            }
        }
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = reporterMap.getOrDefault(id_list[i], 0);
        }
        return answer;
    }

    private HashMap<String, ArrayList<String>> findReporterList(HashSet<String> reportSet) {
        // 신고한 유저 목록(맵)에 신고 받은 자를 key, 신고한 사람 리스트를 value 로 저장
        HashMap<String, ArrayList<String>> reportMap = new HashMap<>();
        for (String report : reportSet) {
            String reporter = report.substring(0, report.indexOf(" "));
            String notifiedId = report.substring(report.indexOf(" ") + 1);
            // System.out.println(reporter + " " + notifiedId);

            // 신고받은 사람이 이미 신고 받은 적이 있으면 신고자 리스트를 불러옴. 없으면 새로 리스트 생성
            ArrayList<String> reporterList = reportMap.getOrDefault(notifiedId, null);
            if (reporterList == null) {
                reporterList = new ArrayList<>();
            }

            reporterList.add(reporter);
            reportMap.put(notifiedId, reporterList);
        }
        return reportMap;
    }
}
