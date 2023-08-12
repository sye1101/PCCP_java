package Day01;

class Solution01 {

    public static int solution(int[][] nums) {
        int answer = 0;
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};
        int n = nums.length; // 행의 길이

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nr = r + dr[k];
                    int nc = c + dc[k];

                    if (nr >= 0 && nr < n && nc >= 0 && nc < n && nums[nr][nc] <= nums[r][c]) {
                        flag = false;
                    }
                }
                if (flag) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] grid1 = {
                {10, 20, 50, 30, 20},
                {20, 30, 50, 70, 90},
                {10, 15, 25, 80, 35},
                {25, 35, 40, 55, 80},
                {30, 20, 35, 40, 90}
        };

        int[][] grid2 = {
                {80, 25, 10, 65, 100},
                {20, 10, 32, 70, 33},
                {45, 10, 88, 9, 90},
                {10, 35, 10, 55, 66},
                {10, 84, 65, 88, 99}
        };

        int[][] grid3 = {
                {33, 22, 55, 65, 55},
                {55, 88, 99, 12, 19},
                {18, 33, 25, 57, 77},
                {46, 78, 54, 55, 99},
                {33, 25, 47, 85, 17}
        };

        System.out.println(solution(grid1));
        System.out.println(solution(grid2));
        System.out.println(solution(grid3));
    }
}
