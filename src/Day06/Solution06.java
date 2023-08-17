package Day06;
import java.util.*;
class Solution06 {
    public int solution(int n, int[][] edge){
        int answer = 0;
        return answer;
    }

    public static void main(String[] args){
        Solution06 T = new Solution06();
        System.out.println(T.solution(11, new int[][]{{1, 2}, {1, 4}, {2, 3}, {4, 5}, {5, 6}, {7, 8}, {7, 10}, {8, 9}, {10, 11}}));
        System.out.println(T.solution(12, new int[][]{{1, 2}, {1, 7}, {1, 8}, {1, 6}, {8, 11}, {11, 12}}));
        System.out.println(T.solution(14, new int[][]{{1, 6}, {1, 5}, {6, 7}, {7, 8}, {9, 8}, {3, 4}, {4, 14}}));
        System.out.println(T.solution(15, new int[][]{{1, 4}, {1, 5}, {9, 5}, {9, 6}, {7, 9}, {7, 14}}));
    }
}
