package Day03;
import java.util.*;
class Solution02 {
    public int solution(int[][] box, int limit){
        int answer = 0;
        Arrays.sort(box,(a,b) -> b[1] - a[1]);
        for (int[] x:box) {
            int cnt = Math.min(x[0],limit);
            answer += cnt * x[1];
            limit -= cnt;

            if (limit == 0) break;
        }

        return answer;
    }

    public static void main(String[] args){
        Solution02 T = new Solution02();
        System.out.println(T.solution(new int[][]{{2, 20}, {2, 10}, {3, 15}, {2, 30}}, 5));
        System.out.println(T.solution(new int[][]{{1, 50}, {2, 20}, {3, 30}, {2, 31}, {5, 25}}, 10));
        System.out.println(T.solution(new int[][]{{3, 40}, {5, 20}, {5, 70}, {1, 80}, {5, 30}, {3, 35}}, 15));
        System.out.println(T.solution(new int[][]{{2, 70}, {5, 100}, {3, 90}, {1, 95}}, 8));
        System.out.println(T.solution(new int[][]{{80, 20}, {50, 10}, {70, 15}, {70, 30}, {80, 70}, {90, 88}, {70, 75}}, 500));
    }
}
