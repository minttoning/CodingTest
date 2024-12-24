class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int index = 0; // 단어 내 인덱스를 추적하기 위한 변수
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == ' ') {
                answer.append(" ");
                index = 0; // 공백 이후 새 단어로 간주하여 인덱스 초기화
            } else {
                if (index % 2 == 0) {
                    answer.append(Character.toUpperCase(c)); // 짝수번째 대문자
                } else {
                    answer.append(Character.toLowerCase(c)); // 홀수번째 소문자
                }
                index++;
            }
        }
        
        return answer.toString();
    }
}
