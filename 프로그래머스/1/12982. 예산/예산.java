import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        // 부서별 신청 금액을 오름차순으로 정렬
        Arrays.sort(d);
        
        int answer = 0;
        int sum = 0;
        
        // 작은 금액부터 지원
        for (int cost : d) {
            sum += cost;
            if (sum <= budget) {
                answer++; // 지원 가능한 부서 수 증가
            } else {
                break; // 예산을 초과하면 종료
            }
        }
        
        return answer; // 최대 지원 가능한 부서 수
    }
}
