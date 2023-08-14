package Day04;
import java.util.*;
class Solution03 {
    public int solution(int n, int k){
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            Q.offer(i);
        }
        while (!Q.isEmpty()){
            for (int i = 1; i < k; i++) {
                Q.offer(Q.poll());      // k-1번째까지 꺼내서 맨뒤로 다시 넣음
            }
            Q.poll();   // k번째꺼 꺼냄
            if (Q.size() == 1) {
                answer = Q.poll();
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Solution03 T = new Solution03();
        System.out.println(T.solution(8, 3));
        System.out.println(T.solution(20, 3));
        System.out.println(T.solution(100, 5));
    }
}
