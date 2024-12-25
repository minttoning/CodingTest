class Solution {
    public long solution(int price, int money, int count) {
        // 총 필요한 금액 계산
        long totalCost = 0;
        for (int i = 1; i <= count; i++) {
            totalCost += (long) price * i; // 각 회차별 요금 계산
        }
        
        // 부족한 금액 계산 (부족하지 않으면 0 반환)
        long shortage = totalCost - money;
        return shortage > 0 ? shortage : 0;
    }
}
