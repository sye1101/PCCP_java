package Day07;
import java.util.*;
class Solution02 {
    public int solution(int[][] board){
        int time = 0;
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};
        int d1 = 0;
        int d2 = 0;
        int[] dog = new int[2];
        int[] hyunSoo = new int[2];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(board[i][j] == 2) {
                    hyunSoo[0] = i;
                    hyunSoo[1] = j;
                }
                if (board[i][j] == 3) {
                    dog[0] = i;
                    dog[1] = j;
                }
            }
        }

        while (time < 10000) {
            time++;
            int nr_dog = dr[d1] + dog[0];
            int nc_dog = dc[d1] + dog[1];
            int nr_hyunSoo = dr[d2] + hyunSoo[0];
            int nc_hyunSoo = dc[d2] + hyunSoo[1];

            if(nr_dog >= 0 && nr_dog < 10 && nc_dog >= 0 && nc_dog < 10 && board[nr_dog][nc_dog] != 1) {
                board[dog[0]][dog[1]] = 0;
                dog[0] = nr_dog;
                dog[1] = nc_dog;
                board[dog[0]][dog[1]] = 3;
            } else {
                d1 = (d1+1) % 4;
            }
            if(nr_hyunSoo >= 0 && nr_hyunSoo < 10 && nc_hyunSoo >= 0 && nc_hyunSoo < 10 && board[nr_hyunSoo][nc_hyunSoo] != 1) {
                board[hyunSoo[0]][hyunSoo[1]] = 0;
                hyunSoo[0] = nr_hyunSoo;
                hyunSoo[1] = nc_hyunSoo;
                board[hyunSoo[0]][hyunSoo[1]] = 2;
            } else {
                d2 = (d2+1) % 4;
            }
            if(dog[0] == hyunSoo[0] && dog[1] == hyunSoo[1]) break;
        }
        if(time >= 10000) return 0;
        return time;
    }

    public static void main(String[] args){
        Solution02 T = new Solution02();
        int[][] arr1 = {{0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 2, 0, 0},
                {1, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 3, 0, 0, 0, 1},
                {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
                {0, 1, 0, 1, 0, 0, 0, 0, 0, 0}};
        System.out.println(T.solution(arr1));
        int[][] arr2 = {{1, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 1, 0, 1, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 0, 2, 1},
                {0, 0, 0, 1, 0, 1, 0, 0, 0, 1},
                {0, 1, 0, 1, 0, 0, 0, 0, 0, 3}};
        System.out.println(T.solution(arr2));
    }
}
