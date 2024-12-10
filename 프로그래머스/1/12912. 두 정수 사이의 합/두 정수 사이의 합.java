class Solution {
    public long solution(int a, int b) {
        int start = Math.min(a,b);
        int end = Math.max(a,b);
        // int start = a < b ? a : b;
        // int end = a > b ? a : b;
        long answer = 0;
        for(int i = start; i<= end; i++){
            answer += i;
        }
        return answer;
    }
}