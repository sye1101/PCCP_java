package Day04;
// 리트코드 739번 Daily Temperatures (https://leetcode.com/problems/daily-temperatures/description/)

import java.util.*;
class Solution08 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<temperatures.length; i++){
            // 더 따뜻한 날이 온 경우
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int idx = stack.pop();
                answer[idx] = i - idx;  // idx 사이의 거리(더 따뜻한 날이 오기까지 몇 일이 걸리는지)
            }
            stack.push(i);  // stack이 비워져있거나 더 따뜻한 날을 아직 못 찾은 경우
        }
        return answer;
    }

    public static void main(String[] args) {
        Day04.Solution08 T = new Day04.Solution08();
        System.out.println(Arrays.toString(T.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73})));
        System.out.println(Arrays.toString(T.dailyTemperatures(new int[]{30,40,50,60})));
        System.out.println(Arrays.toString(T.dailyTemperatures(new int[]{30,60,90})));
    }
}
