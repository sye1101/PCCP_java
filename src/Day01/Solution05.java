package Day01;

class Solution05 {

    public static int[] solution(int[][] board, int k) {
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};
        int n = board.length;
        int r = 0, c = 0;
        int d = 1;
        int cnt = 0;

        while (cnt < k) {
            cnt++;
            int nr = r + dr[d];
            int nc = c + dc[d];

            if (nr < 0 || nr >= n || nc < 0 || nc >= n || board[nr][nc] == 1) {
                d = (d + 1) % 4;
                continue;
            }

            r = nr;
            c = nc;
        }

        return new int[]{r, c};
    }

    public static void main(String[] args) {
        int[][] board1 = {
                {0, 0, 0, 0, 0},
                {0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1},
                {0, 0, 0, 0, 0}
        };

        int[][] board2 = {
                {0, 0, 0, 1, 0, 1},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1},
                {1, 1, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };

        int[][] board3 = {
                {0, 0, 1, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 0, 0, 0, 1},
                {0, 0, 0, 0, 0}
        };

        int[] result1 = solution(board1, 10);
        int[] result2 = solution(board2, 20);
        int[] result3 = solution(board3, 25);

        System.out.println("[" + result1[0] + ", " + result1[1] + "]");
        System.out.println("[" + result2[0] + ", " + result2[1] + "]");
        System.out.println("[" + result3[0] + ", " + result3[1] + "]");
    }
}

