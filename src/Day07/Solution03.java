package Day07;
import java.util.*;
class Solution03 {
    public int solution(int[][] board){
        int[] row = new int[board.length];
        int[] col = new int[board.length];
        int answer=0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                row[i] = Math.max(board[i][j], row[i]);
                col[i] = Math.max(board[j][i], col[i]);
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                int min = Math.min(row[i], col[j]);
                answer += min - board[i][j];
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Solution03 T = new Solution03();
        System.out.println(T.solution(new int[][]{{2, 5, 7, 3}, {6, 8, 9, 7}, {3, 2, 4, 5}, {7, 2, 5, 8}}));
        System.out.println(T.solution(new int[][]{{3, 7, 6, 2}, {5, 3, 8, 7}, {3, 2, 5, 7}, {7, 7, 5, 3}}));
        System.out.println(T.solution(new int[][]{{2, 5, 7, 3, 5}, {6, 8, 9, 7, 3}, {3, 2, 4, 5, 7}, {7, 2, 5, 8, 6}, {1, 2, 3, 4 ,5}}));
    }
}
