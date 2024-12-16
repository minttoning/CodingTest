import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] charArray = s.toCharArray();
        
        // 배열을 내림차순으로 정렬 (람다식 사용)
        Arrays.sort(charArray);
        
        // 정렬된 배열을 뒤집어 내림차순으로 변경
        StringBuilder answer = new StringBuilder(new String(charArray));
        return answer.reverse().toString();
    }
}