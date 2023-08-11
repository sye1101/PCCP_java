package Day03;
import java.util.*;
class Solution03 {
    public int solution(int[] nums, int target){
        int answer = -1;    // target이 없을 경우 -1로 리턴
        int left = 0;
        int right = nums.length;
        while (left <= right) {
            int mid = (left+right)/2;
            if(nums[mid] == target) return mid;
            else if (nums[mid]>target) {    // target이 mid 기준으로 왼쪽에 위치함
                right = mid - 1;
            } else {    // target이 mid 기준으로 오른쪽에 위치함
                left = mid + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Solution03 T = new Solution03();
        System.out.println(T.solution(new int[]{2, 5, 7, 8, 10, 15, 20, 24, 25, 30}, 8));
        System.out.println(T.solution(new int[]{-3, 0, 2, 5, 8, 9, 12, 15}, 0));
        System.out.println(T.solution(new int[]{-5, -2, -1, 3, 8, 9, 12, 17, 23}, 2));
        System.out.println(T.solution(new int[]{3, 6, 9, 12, 17, 29, 33}, 3));
        System.out.println(T.solution(new int[]{1, 2, 3, 4, 5, 7, 9, 11, 12, 15, 16, 17, 18}, 18));
    }
}
