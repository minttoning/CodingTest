class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        int mid = length/2; // 문자열의 가운데 인덱스 계산
        
        // 홀 수인 경우 가운데 한 글자 반환
        if(length % 2 != 0){
            answer = String.valueOf(s.charAt(mid));
            }
        // 짝수인 경우 가운데 두 글자 반환
        else{
            answer = s.substring(mid-1, mid+1);
        }
        
        return answer;
    }
}