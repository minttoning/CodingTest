class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        // p의 길이 구하기
        int pLength = p.length();
        // p를 정수로 변환
        long pValue = Long.parseLong(p);

        // t에서 길이가 pLength인 부분 문자열 추출
        for (int i = 0; i <= t.length() - pLength; i++) {
            // 부분 문자열 추출
            String subString = t.substring(i, i + pLength);
            // 부분 문자열을 정수로 변환
            long subValue = Long.parseLong(subString);
            // 조건에 맞으면 카운트 증가
            if (subValue <= pValue) {
                answer++;
            }
        }

        return answer;
    }
}
