package Day04;
import java.util.*;
class Solution06 {
    public int solution(int[] nums){
        int answer=0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        for (int i:nums) {
            pQ.offer(i);
        }
        while (!pQ.isEmpty()) {
            int a = pQ.poll();
            int b = pQ.poll();
            if(a != b) {
                pQ.offer(Math.abs(a-b));
            }
            if(pQ.size() == 1) answer = pQ.poll();
        }
        return answer;

    }

    public static void main(String[] args){
        Solution06 T = new Solution06();
        int[] arr = new int[]{5, 2, 4, 3, 1};
        System.out.println(T.solution(arr));
        int[] arr1 = new int[]{7, 6, 3, 2, 4, 5, 1};
        System.out.println(T.solution(arr1));
        int[] arr2 = new int[]{5, 6, 7, 2, 3, 11, 15, 8, 9, 12, 23};
        System.out.println(T.solution(arr2));
    }
}
