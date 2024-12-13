class Solution {
    public int[] solution(int[] arr) {
        // 가장 작은 수를 찾기
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }

        // 가장 작은 수를 제외한 새로운 배열 생성
        int count = 0;
        for (int num : arr) {
            if (num != min) {
                count++;
            }
        }

        // 배열 길이가 1일 경우에는 [ -1 ] 반환
        if (count == 0) {
            return new int[]{-1};
        }

        // 새 배열을 만들고, 가장 작은 수를 제외한 값들만 채움
        int[] answer = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num != min) {
                answer[index++] = num;
            }
        }

        return answer;
    }
}
