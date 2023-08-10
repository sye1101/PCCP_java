import java.util.*;
class Solution05 {
    public int[] solution(int[] nums, int target){
        int[] answer = new int[2];
        Arrays.sort(nums);

        // 1번째 방법
//        int n = nums.length;
//        for(int i = 0; i<n; i++){
//            for(int j = i+1; j<n; j++){
//                if(nums[i]+nums[j]==target){
//                    answer[0] = nums[i];
//                    answer[1] = nums[j];
//                    break;
//                }
//            }
//        }

        // 2번쨰 방법
        int left = 0;
        int right = nums.length-1;
        while (left < right) {
            int sumN = nums[left] + nums[right];
            if (sumN == target) {
                answer[0] = nums[left];
                answer[1] = nums[right];
                break;
            }
            if (sumN < target) {
                left += 1;
            } else right -= 1;
        }

        return answer;
    }

    public static void main(String[] args){
        Solution05 T = new Solution05();
        System.out.println(Arrays.toString(T.solution(new int[]{3, 7, 2, 12, 9, 15, 8}, 12)));
        System.out.println(Arrays.toString(T.solution(new int[]{21, 12, 30, 15, 6, 2, 9, 19, 14}, 24)));
        System.out.println(Arrays.toString(T.solution(new int[]{12, 18, 5, 8, 21, 27, 22, 25, 16, 2}, 28)));
        System.out.println(Arrays.toString(T.solution(new int[]{11, 17, 6, 8, 21, 9, 19, 12, 25, 16, 2}, 26)));
        System.out.println(Arrays.toString(T.solution(new int[]{7, 5, 12, -9, -12, 22, -30, -35, -21}, -14)));
        System.out.println(Arrays.toString(T.solution(new int[]{7, 5, 12, 20}, 15)));
    }
}