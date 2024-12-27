class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        // 3중 반복문으로 모든 3개 조합 탐색
        for (int i = 0; i < number.length - 2; i++) {
            for (int j = i + 1; j < number.length - 1; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    // 세 숫자의 합이 0인지 확인
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}
