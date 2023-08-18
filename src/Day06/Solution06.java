package Day06;
import java.util.*;
class Solution06 {
//    int[][] graph;
//    int[] ch;
//    int cnt;
//    public void DFS(int v, int[][] graph, int[] ch, int n){
//        ch[v] = 1;
//        cnt += 1;
//        for (int i = 1; i <= n; i++) {
//            // graph[v][i] == 1이면 v 정점과 i 정점이 연결되어 있음.
//            if(graph[v][i] == 1 && ch[i] == 0){
//                DFS(i, graph, ch, n);
//            }
//        }
//    }
//
//    public int solution(int n, int[][] edge){
//        graph = new int[n+1][n+1];
//        ch = new int[n+1];
//        for (int[] x:edge) {
//            graph[x[0]][x[1]] = 1;
//            graph[x[1]][x[0]] = 1;
//        }
//        cnt = 0;
//        DFS(1, graph, ch, n);
//        return n - cnt;
//    }
    ArrayList<ArrayList<Integer>> graph;
    int[] ch;
    int cnt;
    public void DFS(int v){
        ch[v] = 1;
        cnt += 1;
        for (int nv:graph.get(v)) {
            if(ch[nv] == 0) DFS(nv);
        }
    }
    public int solution(int n, int[][] edge) {
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i <= n; i++){
            graph.add(new ArrayList<>());
        }
        ch = new int[n+1];
        for (int[] x:edge) {
            graph.get(x[0]).add(x[1]);
            graph.get(x[1]).add(x[0]);
        }
        cnt = 0;
        DFS(1);
        return n - cnt;
    }

    public static void main(String[] args){
        Solution06 T = new Solution06();
        System.out.println(T.solution(11, new int[][]{{1, 2}, {1, 4}, {2, 3}, {4, 5}, {5, 6}, {7, 8}, {7, 10}, {8, 9}, {10, 11}}));
        System.out.println(T.solution(12, new int[][]{{1, 2}, {1, 7}, {1, 8}, {1, 6}, {8, 11}, {11, 12}}));
        System.out.println(T.solution(14, new int[][]{{1, 6}, {1, 5}, {6, 7}, {7, 8}, {9, 8}, {3, 4}, {4, 14}}));
        System.out.println(T.solution(15, new int[][]{{1, 4}, {1, 5}, {9, 5}, {9, 6}, {7, 9}, {7, 14}}));
    }
}
