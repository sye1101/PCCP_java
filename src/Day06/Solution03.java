package Day06;
class Solution03 {
    int[] dr = {-1, 0, 1, 0};
    int[] dc = {0, 1, 0, -1};

    public void DFS(int r, int c, int[][] board){
        board[r][c] = 0;
        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];
            if(nr >= 0 && nr < 5 && nc >= 0 && nc < 5 && board[nr][nc] == 1) DFS(nr, nc, board);
        }
    }
    public int solution(int[][] board){
        int answer = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 ; j++) {
                if(board[i][j] == 1) {
                    answer += 1;
                    DFS(i,j,board);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Solution03 T = new Solution03();
        System.out.println(T.solution(new int[][]{{0, 1, 1, 0, 0}, {0, 1, 1, 0, 0}, {0, 1, 0, 0, 0}, {0, 0, 0, 1, 0}, {0, 0, 1, 1, 0}}));
        System.out.println(T.solution(new int[][]{{1, 1, 1, 0, 1}, {1, 1, 1, 0, 1}, {0, 0, 1, 0, 0}, {1, 1, 0, 1, 0}, {1, 0, 1, 0, 0}}));
        System.out.println(T.solution(new int[][]{{0, 0, 1, 0, 0}, {0, 1, 1, 0, 0}, {0, 1, 0, 0, 0}, {1, 0, 0, 1, 0}, {0, 0, 1, 1, 0}}));
        System.out.println(T.solution(new int[][]{{0, 0, 0, 0, 1}, {0, 0, 1, 0, 0}, {0, 1, 0, 1, 0}, {0, 0, 0, 1, 0}, {0, 0, 1, 0, 0}}));
    }
}
