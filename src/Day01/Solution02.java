package Day01;
import java.util.*;
class Solution02 {

    public static int[][] solution(String moves) {
        int r = 0;
        int c = 0;
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};
        HashMap<Character, Integer> dir = new HashMap<>();
        dir.put('U', 0);
        dir.put('R', 1);
        dir.put('D', 2);
        dir.put('L', 3);

        for (char command : moves.toCharArray()) {
            int direction = dir.get(command);
            r += dr[direction];
            c += dc[direction];
        }

        return new int[][]{{r, c}};
    }

    public static void main(String[] args) {
        String[] testCases = {"RRRDDDLU", "DDDRRRDDLL", "RRRRRRDDDDDDUULLL", "RRRRDDDRRDDLLUU"};

        for (String moves : testCases) {
            int[][] result = solution(moves);
            System.out.println("[" + result[0][0] + ", " + result[0][1] + "]");
        }
    }
}

