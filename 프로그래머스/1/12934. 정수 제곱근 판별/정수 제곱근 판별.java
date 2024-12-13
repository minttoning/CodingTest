class Solution {
    public long solution(long n) {
        // n의 제곱근을 계산합니다.
        long sqrt = (long) Math.sqrt(n);

        // n이 어떤 정수 x의 제곱인지 확인합니다.
        if (sqrt * sqrt == n) {
            // 제곱이라면 x+1의 제곱을 반환합니다.
            return (sqrt + 1) * (sqrt + 1);
        } else {
            // 제곱이 아니라면 -1을 반환합니다.
            return -1;
        }
    }
}
