class Solution {
    public boolean solution(int x) {
        // x의 자릿수 합을 계산합니다.
        int sum = 0;
        int temp = x;

        while (temp > 0) {
            sum += temp % 10; // 자릿수를 더합니다.
            temp /= 10;       // 다음 자릿수로 이동합니다.
        }

        // x가 자릿수 합으로 나누어 떨어지는지 확인합니다.
        return x % sum == 0;
    }
}
