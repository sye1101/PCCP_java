package Day07;
import java.util.*;
class Solution01 {
    public int solution(int[] nums){
        int answer = 10000000;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for (int key:map.keySet()) {
            int value = map.get(key);
            if(value == key) answer = Math.min(answer, key);
        }

        return answer == 10000000 ? -1 : answer;
    }

    public static void main(String[] args){
        Solution01 T = new Solution01();
        System.out.println(T.solution(new int[]{1, 2, 3, 1, 3, 3, 2, 4}));
        System.out.println(T.solution(new int[]{1, 2, 3, 3, 3, 2, 4, 5, 5, 5}));
        System.out.println(T.solution(new int[]{1, 1, 2, 5, 5, 5, 5, 5, 3, 3, 3, 3, 5}));
        System.out.println(T.solution(new int[]{7, 6, 7, 7, 8, 8, 8, 8, 7, 5, 7, 7, 7, 8, 8}));
        System.out.println(T.solution(new int[]{11, 12, 5, 5, 3, 11, 7, 12, 15, 12, 12, 11, 12, 12, 7, 8, 12, 11, 12, 7, 12, 5, 15, 20, 15, 12, 15, 12, 15, 14, 12}));
    }
}

