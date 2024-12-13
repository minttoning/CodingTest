class Solution {
    public String solution(String[] seoul) {
        // "Kim"의 위치를 찾기 위한 변수
        int x = 0;

        // 배열을 순회하며 "Kim"의 인덱스를 찾음
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                x = i;  // "Kim"이 발견되면 인덱스를 x에 저장
                break;  // "Kim"을 찾았으므로 루프 종료
            }
        }

        // "김서방은 x에 있다" 형식으로 반환
        return "김서방은 " + x + "에 있다";
    }
}
