package Day07;
import java.util.*;
class Solution07 {
    public int solution(int[][] nums){
        int answer=0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        Arrays.sort(nums, (a,b) -> b[1] - a[1]);
        int maxD = nums[0][1];
        int j = 0;
        for (int i = maxD; i >= 1; i--) {
            for (; j < nums.length; j++) {
                if(nums[j][1] < i) break;
                pQ.offer(nums[j][0]);
            }
            if(!pQ.isEmpty()) answer += pQ.poll();
        }
        return answer;
    }


    public static void main(String[] args){
        Solution07 T = new Solution07();
        System.out.println(T.solution(new int[][]{{50, 2}, {20, 1}, {40, 2}, {60, 3}, {30, 3}, {30, 1}}));
        System.out.println(T.solution(new int[][]{{50, 2}, {40, 2}, {20, 1}, {10, 1}}));
        System.out.println(T.solution(new int[][]{{70, 5}, {60, 1}, {80, 2}, {70, 1}}));
    }
}
