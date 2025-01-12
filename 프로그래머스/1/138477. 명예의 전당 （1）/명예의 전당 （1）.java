import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer> hallOfFame = new PriorityQueue<>();
        int[] answer = new int[score.length];
        
        for (int i = 0; i < score.length; i++) {
            hallOfFame.add(score[i]);
            
            if (hallOfFame.size() > k) {
                hallOfFame.poll(); // 가장 작은 요소 제거
            }
            
            answer[i] = hallOfFame.peek(); // 현재 가장 작은 점수
        }
        
        return answer;
    }
}
