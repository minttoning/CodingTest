class Solution {
    public String solution(String phone_number) {
        // 전화번호의 길이를 계산
        int length = phone_number.length();
        
        // 뒷 4자리를 제외한 나머지 부분을 *로 채우기
        String masked = "*".repeat(length - 4);
        
        // 뒷 4자리를 가져오기
        String lastFour = phone_number.substring(length - 4);
        
        // 두 부분을 합쳐서 결과 반환
        return masked + lastFour;
    }
}
