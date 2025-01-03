class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0; // 초기 값은 0으로 설정합니다.
        
        // 배열의 길이는 같으므로 하나의 루프를 사용하여 처리합니다.
        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i]; // 각 요소를 곱한 값을 누적합에 추가합니다.
        }
        
        return answer; // 최종 계산된 내적을 반환합니다.
    }
}
