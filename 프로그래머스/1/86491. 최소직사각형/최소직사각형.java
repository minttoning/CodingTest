class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int[] size : sizes) {
            // 가로와 세로 중 큰 값을 가로로, 작은 값을 세로로 정렬
            int width = Math.max(size[0], size[1]);
            int height = Math.min(size[0], size[1]);

            // 각 명함의 정렬된 값에서 최대값 갱신
            maxWidth = Math.max(maxWidth, width);
            maxHeight = Math.max(maxHeight, height);
        }

        // 지갑의 최소 크기 계산
        return maxWidth * maxHeight;
    }
}
