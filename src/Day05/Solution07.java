package Day05;
class Solution07 {
    public void DFS(int v){
        if(v > 7) return;
        else{
            System.out.print(v + " ");
            DFS(v*2);
            DFS(v*2+1);
        }
    }
    public static void main(String[] args){
        Solution07 T = new Solution07();
        T.DFS(1);
    }
}
