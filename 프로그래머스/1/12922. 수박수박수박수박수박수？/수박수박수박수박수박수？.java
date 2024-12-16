class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder(); // StringBuilder 를 사용하여 효율적인 문자열 생성
        
        for(int i =0; i < n; i++){
            if(i%2==0){
                answer.append("수"); // 짝수 인덱스에는 "수"
            }else{
                answer.append("박"); // 홀수 인덱스에는 "박"
            }
        }
        return answer.toString(); // StringBuilder를 문자열로 변환하여 반환
    }
}