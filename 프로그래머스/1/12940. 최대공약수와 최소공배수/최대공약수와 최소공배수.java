class Solution {
    public int[] solution(int n, int m) {
        // 최대공약수 계산
        int gcd = getGCD(n, m);
        // 최소공배수 계산
        int lcm = (n * m) / gcd;

        // 결과 반환
        return new int[]{gcd, lcm};
    }

    // 유클리드 호제법으로 최대공약수 계산
    private int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
