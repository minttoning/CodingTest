class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            // 약수의 개수가 짝수인지 홀수인지 판단
            if (isDivisorCountEven(i)) {
                answer += i; // 짝수일 경우 더하기
            } else {
                answer -= i; // 홀수일 경우 빼기
            }
        }

        return answer;
    }

    // 약수의 개수가 짝수인지 홀수인지 판단하는 함수
    private boolean isDivisorCountEven(int num) {
        int count = 0;

        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (i * i == num) {
                    count++; // 제곱수인 경우 약수 하나만 추가
                } else {
                    count += 2; // 짝이 되는 두 약수를 추가
                }
            }
        }

        return count % 2 == 0; // 약수의 개수가 짝수면 true, 홀수면 false
    }
}
