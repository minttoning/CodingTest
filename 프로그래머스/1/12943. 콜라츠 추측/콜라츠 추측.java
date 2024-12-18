class Solution {
    public int solution(int num) {
        int answer = 0;
        long number = num; // long 타입으로 변경하여 오버플로우 방지

        // num이 1이 될 때까지 또는 작업 횟수가 500을 초과할 때까지 반복
        while (number != 1) {
            if (answer >= 500) {
                return -1; // 작업 횟수가 500번을 초과하면 -1 반환
            }

            // 짝수라면 2로 나누기, 홀수라면 3을 곱하고 1 더하기
            number = (number % 2 == 0) ? (number / 2) : (number * 3 + 1);
            answer++; // 작업 횟수 증가
        }

        return answer; // 1이 된 경우 작업 횟수 반환
    }
}
