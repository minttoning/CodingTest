class Solution {
    boolean solution(String s) {
        // 문자열을 모두 소문자로 변환하여 대소문자 구분 제거
        s = s.toLowerCase();

        // 'p'와 'y'의 개수를 세는 변수 초기화
        int pCount = 0;
        int yCount = 0;

        // 문자열을 순회하며 'p'와 'y'의 개수를 카운트
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == 'p') {
                pCount++;
            } else if (currentChar == 'y') {
                yCount++;
            }
        }

        // 'p'와 'y'의 개수를 비교하여 결과 반환
        return pCount == yCount;
    }
}
