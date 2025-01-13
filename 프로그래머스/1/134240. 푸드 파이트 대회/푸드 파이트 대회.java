class Solution {
    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();
        
        // 음식의 개수를 반으로 나누어 왼쪽과 오른쪽에 배치
        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2; // 각 음식의 반 개수
            for (int j = 0; j < count; j++) {
                left.append(i);  // 왼쪽에 음식 추가
                right.append(i); // 오른쪽에 음식 추가
            }
        }
        
        // 물은 가운데 배치
        String answer = left.toString() + "0" + right.reverse().toString();
        return answer;
    }
}
