import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        // 나누어 떨어지는 값을 저장할 리스트 생성
        List<Integer> resultList = new ArrayList<>();

        // 배열의 각 요소를 확인하여 divisor로 나누어 떨어지는 값만 리스트에 추가
        for (int num : arr) {
            if (num % divisor == 0) {
                resultList.add(num);
            }
        }

        // 리스트가 비어 있다면 -1 추가
        if (resultList.isEmpty()) {
            return new int[] {-1};
        }

        // 리스트를 배열로 변환하기 전에 정렬
        Collections.sort(resultList);

        // 결과를 int 배열로 변환하여 반환
        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }
}
