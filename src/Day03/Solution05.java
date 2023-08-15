package Day03;
import java.util.*;
class Solution05 {
    public int solution(int m, int[][] nums) {
        int answer = 0;
        Arrays.sort(nums,(a,b) -> a[0] - b[0]);
        int start = 0, end = 0, i = 0;
        while (i < nums.length) {
            // 현재 시작 위치보다 작거나 같은 지점들을 찾아서 end 값을 업데이트
            while (i < nums.length && nums[i][0] <= start) {
                end = Math.max(end, nums[i][1]);
                i++;
            }
            answer++; // 새로운 구간을 선택했으므로 횟수 증가
            if (end == m) return answer; // 목표 지점에 도달했다면 반환
            start = end; // 다음 구간의 시작을 현재 구간의 끝으로 설정
        }

        return answer;
    }
    public static void main(String[] args){
        Solution05 T = new Solution05();
        System.out.println(T.solution(12, new int[][]{{5, 10}, {1, 8}, {0, 2}, {0, 3}, {2, 5}, {2, 6}, {10, 12}, {7, 12}}));
        System.out.println(T.solution(15, new int[][]{{1, 10}, {0, 8}, {0, 7}, {0, 10}, {12, 5}, {0, 12}, {8, 15}, {5, 14}}));
        System.out.println(T.solution(20, new int[][]{{3, 7}, {5, 8}, {15, 20}, {0, 5}, {7, 14}, {3, 10}, {0, 8}, {13, 18}, {5, 9}}));
        System.out.println(T.solution(30, new int[][]{{5, 7}, {3, 9}, {2, 7}, {0, 1}, {0, 2}, {0, 3}, {19, 30}, {8, 15}, {7, 12}, {13, 20}}));
        System.out.println(T.solution(25, new int[][]{{10, 15}, {15, 20}, {5, 15}, {3, 16}, {0, 5}, {0, 3}, {12, 25}}));
    }
}
