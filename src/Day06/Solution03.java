package Day06;
import java.util.*;
class Solution03 {
    public int solution(int[][] board){
        int answer = 0;

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
