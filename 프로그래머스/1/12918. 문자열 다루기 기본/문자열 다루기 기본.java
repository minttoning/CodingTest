class Solution {
    public boolean solution(String s) {
        // 문자열의 길이가 4 또는 6인지 확인
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        // 문자열이 숫자로만 구성되어 있는지 확인
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
