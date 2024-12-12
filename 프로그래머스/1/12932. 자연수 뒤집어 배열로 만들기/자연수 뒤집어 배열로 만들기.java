class Solution {
    public int[] solution(long n) {
        // 1. 숫자를 문자열로 변환
        String str = Long.toString(n);
        
        // 2. 문자열 길이를 기준으로 배열 생성
        int[] answer = new int[str.length()];
        
        // 3. 문자열을 뒤에서부터 순회하며 숫자를 배열에 저장
        for (int i = 0; i < str.length(); i++) {
            answer[i] = str.charAt(str.length() - 1 - i) - '0';
        }
        
        // 4. 결과 반환
        return answer;
    }
}
