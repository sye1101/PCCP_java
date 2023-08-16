package Day05;
import java.util.*;
class Solution02 {
    public int solution(int home){
        Queue<Integer> Q = new LinkedList<>();
        int[] check = new int[10000];
        Q.offer(0);
        int L = 0;
        while (!Q.isEmpty()){
            int n = Q.size();
            for (int i = 0; i < n; i++) {
                int v = Q.poll();
                if(v == home) return L;
                for (int nv:new int[]{v-1,v+1,v+5}){
                    if(nv >= 0 && nv < 10000 && check[nv] == 0) {
                        Q.offer(nv);
                        check[nv] = 1;
                    }
                }
            }
            L++;
        }
        return -1;
    }

    public static void main(String[] args){
        Solution02 T = new Solution02();
        System.out.println(T.solution(10));
        System.out.println(T.solution(14));
        System.out.println(T.solution(25));
        System.out.println(T.solution(24));
        System.out.println(T.solution(345));
    }
}
