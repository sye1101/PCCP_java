package Day07;
import java.util.*;
class Solution04 {
    public int solution(String s){
        HashMap<Character, Integer> sH = new HashMap<>();
        HashSet<Integer> ch = new HashSet<>();
        for (char x:s.toCharArray()) {
            sH.put(x,sH.getOrDefault(x, 0) + 1);
        }
        int answer = 0;
        for(char x:sH.keySet()){
            while (ch.contains(sH.get(x))){
                answer++;
                sH.put(x,sH.get(x)-1);
            }
            if(sH.get(x) == 0) continue;
            ch.add(sH.get(x));
        }
        return answer;
    }

    public static void main(String[] args){
        Solution04 T = new Solution04();
        System.out.println(T.solution("aaabbbcc"));
        System.out.println(T.solution("aaabbc"));
        System.out.println(T.solution("aebbbbc"));
        System.out.println(T.solution("aaabbbcccde"));
        System.out.println(T.solution("aaabbbcccdddeeeeeff"));
    }
}
