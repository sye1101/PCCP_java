package Day05;
import java.util.*;
class Solution03 {
    public int solution(int[][] board){
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};
        Queue<int[]> Q = new LinkedList<>();
        Q.offer(new int[]{0,0});
        board[0][0] = 1;

        int L = 0;
        while (!Q.isEmpty()){
            int n = Q.size();
            for (int i = 0; i < n; i++) {
                int[] v = Q.poll();
                if(Arrays.equals(v, new int[]{6,6})) return L;
                for(int j = 0; j < 4; j++){
                    int nx = v[0] + dr[j];
                    int ny = v[1] + dc[j];
                    if(nx >= 0 && nx < 7 && ny >= 0 && ny < 7 && board[nx][ny] == 0) {
                        Q.offer(new int[]{nx,ny});
                        board[nx][ny] = 1;
                    }
                }
            }
            L++;
        }
        return -1;
    }

    public static void main(String[] args){
        Solution03 T = new Solution03();
        int[][] arr={{0, 0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 1, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {1, 1, 0, 1, 0, 1, 1},
                {1, 1, 0, 1, 0, 0, 0},
                {1, 0, 0, 0, 1, 0, 0},
                {1, 0, 1, 0, 0, 0, 0}};
        System.out.println(T.solution(arr));
        int[][] arr1={{0, 0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 1, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {1, 1, 0, 1, 1, 1, 1},
                {1, 1, 0, 1, 0, 0, 0},
                {1, 0, 0, 0, 1, 0, 0},
                {1, 0, 1, 0, 1, 0, 0}};
        System.out.println(T.solution(arr1));
        int[][] arr2={{0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {1, 1, 0, 1, 0, 1, 1},
                {1, 1, 0, 0, 0, 1, 0},
                {1, 0, 0, 0, 1, 0, 0},
                {1, 0, 1, 0, 0, 0, 0}};
        System.out.println(T.solution(arr2));
    }
}