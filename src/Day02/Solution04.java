package Day02;
import java.util.*;
class Solution04 {
    public int solution(String s){
        int answer = s.length();
        int odd = 0;
        HashMap<Character, Integer> sH = new HashMap<>();
        for (char x:s.toCharArray()) {
            sH.put(x,sH.getOrDefault(x,0)+1);
        }
        for (char key:sH.keySet()) {
            if(sH.get(key)%2 == 1) {
                odd++;
            }
        }
        return odd > 0 ? answer - odd + 1 : answer;
    }

    public static void main(String[] args){
        Solution04 T = new Solution04();
        System.out.println(T.solution("abcbbbccaaeee"));
        System.out.println(T.solution("aabbccddee"));
        System.out.println(T.solution("fgfgabtetaaaetytceefcecekefefkccckbsgaafffg"));
        System.out.println(T.solution("aabcefagcefbcabbcc"));
        System.out.println(T.solution("abcbbbccaa"));
    }
}
