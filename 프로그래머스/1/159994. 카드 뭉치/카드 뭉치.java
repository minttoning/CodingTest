class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int index1 = 0;  // cards1에서 사용할 카드의 인덱스
        int index2 = 0;  // cards2에서 사용할 카드의 인덱스
        
        for (String word : goal) {
            if (index1 < cards1.length && cards1[index1].equals(word)) {
                index1++;  // cards1에서 사용한 카드
            } else if (index2 < cards2.length && cards2[index2].equals(word)) {
                index2++;  // cards2에서 사용한 카드
            } else {
                return "No";  // 목표 단어가 어느 카드에도 없으면 "No" 반환
            }
        }
        
        return "Yes";  // 목표 배열을 만들 수 있으면 "Yes" 반환
    }
}
