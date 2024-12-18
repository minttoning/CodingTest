class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0; // 결과 합을 저장할 변수
        
        // absolutes와 signs 배열의 길이는 동일하므로 하나의 반복문으로 처리 가능
        for (int i = 0; i < absolutes.length; i++) {
            // signs[i]가 true면 양수, false면 음수로 처리
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        
        return answer; // 계산된 합 반환
    }
}
