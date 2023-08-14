package Day04;
import java.util.*;
class Solution04 {
    public ArrayList<Integer> solution(int[] nums){
        ArrayList<Integer> answer = new ArrayList<>();
        PriorityQueue<Integer> pQ = new PriorityQueue<>();
        for (int i:nums) {
            if (i != 0) {
                pQ.offer(i);
            } else {
                if (pQ.isEmpty()) answer.add(-1);
                 answer.add(pQ.poll());
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Solution04 T = new Solution04();
        int[] arr = new int[]{5, 3, 6, 0, 5, 0, 2, 4, 0};
        System.out.println(T.solution(arr));
    }
}
