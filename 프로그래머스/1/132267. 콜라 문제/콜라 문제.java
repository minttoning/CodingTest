class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a) {
            int newColas = (n / a) * b;  // 새로 받는 콜라의 개수
            answer += newColas;          // 총 받은 콜라의 수에 추가
            n = (n % a) + newColas;      // 남은 빈 병 + 새로 받은 콜라 병을 마시고 난 빈 병
        }
        return answer;
    }
}
