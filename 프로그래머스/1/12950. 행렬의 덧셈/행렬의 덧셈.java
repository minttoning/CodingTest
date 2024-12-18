class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // 행렬의 크기는 arr1과 arr2가 동일하므로 arr1의 크기를 사용
        int rows = arr1.length; // 행의 개수
        int cols = arr1[0].length; // 열의 개수
        
        // 결과를 저장할 배열 생성
        int[][] answer = new int[rows][cols];
        
        // 두 행렬의 값을 더하는 반복문
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        return answer; // 결과 반환
    }
}
