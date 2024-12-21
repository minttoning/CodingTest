import java.util.*;

class Solution {
    public int[] solution(String s) {
        // 결과를 저장할 배열
        int[] answer = new int[s.length()];
        // 문자의 최근 등장 위치를 저장할 맵
        Map<Character, Integer> lastSeen = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // 현재 문자가 이전에 등장했는지 확인
            if (lastSeen.containsKey(currentChar)) {
                // 현재 위치와 마지막 등장 위치의 차이를 저장
                answer[i] = i - lastSeen.get(currentChar);
            } else {
                // 이전에 등장한 적이 없으면 -1 저장
                answer[i] = -1;
            }

            // 현재 문자의 위치를 업데이트
            lastSeen.put(currentChar, i);
        }

        return answer;
    }
}
