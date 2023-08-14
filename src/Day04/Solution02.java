package Day04;
import java.util.*;
class Solution02 {
    public String solution(String s){
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char x:s.toCharArray()) {
            if(!stack.isEmpty() && stack.peek() == x) {
                    stack.pop();
                } else {
                    stack.push(x);
                }
        }
        StringBuilder sb = new StringBuilder();
        for (char x:stack) {
            sb.append(x);
        }
        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args){
        Solution02 T = new Solution02();
        System.out.println(T.solution("acbbcaa"));
        System.out.println(T.solution("bacccaba"));
        System.out.println(T.solution("aabaababbaa"));
        System.out.println(T.solution("bcaacccbaabccabbaa"));
        System.out.println(T.solution("cacaabbc"));
    }
}
