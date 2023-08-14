package Day04;
import java.util.*;
class Solution01 {
    public String solution(String s){
        Stack<Character> stack = new Stack<>();
        for(char x : s.toCharArray()){
            if(x == '#'){
                if(!stack.empty()) stack.pop();
            }
            else stack.push(x);
        }
        StringBuilder sb = new StringBuilder();
        for(char x : stack) sb.append(x);
        return sb.toString();
    }

    public static void main(String[] args){
        Solution01 T = new Solution01();
        System.out.println(T.solution("abc##ec#ab"));
        System.out.println(T.solution("kefd#ef##s##"));
        System.out.println(T.solution("teac#cher##er"));
        System.out.println(T.solution("englitk##shabcde##ff##ef##ashe####"));
        System.out.println(T.solution("itistime####gold"));
    }
}
