import java.util.*;

class Solution {
    public long solution(long n) {
        // 입력받은 숫자 n을 문자열로 변환
        String numberString = Long.toString(n);
        // 문자열을 문자 배열로 변환하여 각 자릿수를 분리
        char[] digits = numberString.toCharArray();
        // 문자 배열을 오름차순으로 정렬합니다.(작은 숫자부터 큰 숫자로)
        Arrays.sort(digits);
        // 정렬된 배열을 뒤집어서 내림차순(큰 숫자부터 작은 숫자)으로 만듭니다.   
        StringBuilder sortedString = new StringBuilder(new String(digits)).reverse();
        // 내림차순으로 정렬된 문자열을 숫자로 변환하여 반환합니다.
        return Long.parseLong(sortedString.toString());
    }
}