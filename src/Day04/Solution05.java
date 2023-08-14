package Day04;
import java.util.*;
class Solution05 {
    public ArrayList<Integer> solution(int[] nums){
        ArrayList<Integer> answer = new ArrayList<>();
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());

        for (int i:nums) {
            if (i != 0) {
                pQ.offer(i);
            } else {
                if(pQ.isEmpty()) answer.add(-1);
                else answer.add(pQ.poll());
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Solution05 T = new Solution05();
        int[] arr = new int[]{5, 3, 6, 0, 5, 0, 2, 4, 0};
        System.out.println(T.solution(arr));
    }
}
