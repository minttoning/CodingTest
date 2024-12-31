import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        // 결과를 저장할 List 생성
        List<Integer> result = new ArrayList<>();
        
        // 이전 값을 저장할 변수 초기화
        int previous = -1; // 문제 조건에 맞지 않는 값으로 초기화
        
        // 배열의 각 요소를 순회
        for (int num : arr) {
            if (num != previous) {
                result.add(num); // 연속되지 않는 값만 추가
                previous = num; // 이전 값 갱신
            }
        }
        
        // List를 배열로 변환하여 반환
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
