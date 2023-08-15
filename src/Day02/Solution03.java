package Day02;
import java.util.*;
class Solution03 {
    public int[] solution(String s){
        int[] answer = new int[5];
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x:s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        int max = 0;
        String tmp = "abcde";
        for (char key:tmp.toCharArray()) {
            if(map.getOrDefault(key,0) > max) {
                max = map.getOrDefault(key, 0);
            }
        }
        for(int i = 0; i < tmp.length(); i++){
            answer[i] = max - map.getOrDefault(tmp.charAt(i),0);
        }


        return answer;
    }

    public static void main(String[] args){
        Solution03 T = new Solution03();
        System.out.println(Arrays.toString(T.solution("aaabc")));
        System.out.println(Arrays.toString(T.solution("aabb")));
        System.out.println(Arrays.toString(T.solution("abcde")));
        System.out.println(Arrays.toString(T.solution("abcdeabc")));
        System.out.println(Arrays.toString(T.solution("abbccddee")));
    }
}

