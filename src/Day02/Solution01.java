package Day02;
import java.util.*;
class Solution01 {
    public char solution(String s){
        char answer=' ';
        HashMap<Character, Integer> student = new HashMap<>();
        for (char i:s.toCharArray()) {
            student.put(i, student.getOrDefault(i, 0)+1);
        }
        int max = 0;
        for (char key: student.keySet()) {
            if(student.get(key)>max){
                max = student.get(key);
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Solution01 T = new Solution01();
        System.out.println(T.solution("BACBACCACCBDEDE"));
        System.out.println(T.solution("AAAAABBCCDDDD"));
        System.out.println(T.solution("AABBCCDDEEABCB"));
    }
}
