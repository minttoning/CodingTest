class Solution {
    public int solution(int[] numbers) {
        int totalSum = 45; // 0부터 9까지의 합
        int sumOfNumbers = 0;

        for (int number : numbers) {
            sumOfNumbers += number;
        }

        return totalSum - sumOfNumbers;
    }
}
