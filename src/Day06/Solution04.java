package Day06;
import java.util.*;
class Solution04 {
    public int[] solution(int[][] board){
        int[] answer = {};
        return answer;
    }

    public static void main(String[] args){
        Solution04 T = new Solution04();
        System.out.println(Arrays.toString(T.solution(new int[][]{{0, 1, 1, 0, 0}, {0, 1, 1, 0, 0}, {0, 1, 0, 0, 0}, {0, 0, 0, 1, 0}, {0, 0, 1, 1, 0}})));
        System.out.println(Arrays.toString(T.solution(new int[][]{{1, 1, 1, 0, 1}, {1, 1, 1, 0, 1}, {0, 0, 1, 0, 0}, {1, 1, 0, 1, 0}, {1, 0, 1, 0, 0}})));
        System.out.println(Arrays.toString(T.solution(new int[][]{{0, 0, 1, 0, 0}, {0, 1, 1, 0, 0}, {0, 1, 0, 0, 0}, {1, 0, 0, 1, 0}, {0, 0, 1, 1, 0}})));
        System.out.println(Arrays.toString(T.solution(new int[][]{{0, 0, 0, 0, 1}, {0, 0, 1, 0, 0}, {0, 1, 0, 1, 0}, {0, 0, 0, 1, 0}, {0, 0, 1, 0, 0}})));
    }
}

