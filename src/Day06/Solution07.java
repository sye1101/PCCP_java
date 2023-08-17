package Day06;
// 프로그래머스 #체육대회
class Solution07 {
    int answer;
    int sum;
    int max;
    int[] ch;
    int[] pm;
    public void DFS(int L, int[][] ability, int n, int m, int[] ch){
        if(L == m){
            sum = 0;
            for(int i = 0; i<m; i++){
                sum += ability[pm[i]][i];
            }
            answer = Math.max(sum, answer);
        } else {
            for(int i = 0; i < n; i++){
                if(ch[i] == 1) continue;
                else {
                    pm[L] = i;
                    ch[i] = 1;
                    DFS(L+1, ability, n, m, ch);
                    ch[i] = 0;
                }
            }
        }
    }
    public int solution(int[][] ability) {
        int n = ability.length;
        int m = ability[0].length;
        pm = new int[m];
        answer = 0;
        ch = new int[n];
        DFS(0, ability, n, m, ch);

        return answer;
    }
}

//class Solution07 {
//    int answer = 0;
//    public void DFS(int L, int sum, int[][] ability, int[] ch, int n, int m){
//        if(L == m){
//            answer = Math.max(answer, sum);
//        }
//        else{
//            for(int i = 0; i < n; i++){
//                if(ch[i] == 0){
//                    ch[i] = 1;
//                    DFS(L+1, sum + ability[i][L], ability, ch, n, m);
//                    ch[i] = 0;
//                }
//            }
//        }
//    }
//    public int solution(int[][] ability) {
//        int n = ability.length;
//        int m = ability[0].length;
//        int[] ch = new int[n];
//        DFS(0, 0, ability, ch, n, m);
//        return answer;
//    }
//}

