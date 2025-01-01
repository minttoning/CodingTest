class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                // 대문자 처리
                answer.append((char) ('A' + (c - 'A' + n) % 26));
            } else if (Character.isLowerCase(c)) {
                // 소문자 처리
                answer.append((char) ('a' + (c - 'a' + n) % 26));
            } else {
                // 공백 처리
                answer.append(c);
            }
        }
        
        return answer.toString();
    }
}
