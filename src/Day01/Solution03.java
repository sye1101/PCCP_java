package Day01;

import java.util.*;

class Solution03 {

    public static int[] solution(int n, String moves) {
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};
        HashMap<Character, Integer> dir = new HashMap<>();
        dir.put('U', 0);
        dir.put('R', 1);
        dir.put('D', 2);
        dir.put('L', 3);

        int r = 0, c = 0;

        for (char command : moves.toCharArray()) {
            int nr = r + dr[dir.get(command)];
            int nc = c + dc[dir.get(command)];

            if (nr < 0 || nr >= n || nc < 0 || nc >= n) {
                continue;
            }

            r = nr;
            c = nc;
        }

        return new int[]{r, c};
    }

    public static void main(String[] args) {
        int[] result1 = solution(5, "RRRDDDUUUUUUL");
        int[] result2 = solution(7, "DDDRRRDDLL");
        int[] result3 = solution(5, "RRRRRDDDDDU");
        int[] result4 = solution(6, "RRRRDDDRRDDLLUU");

        System.out.println("[" + result1[0] + ", " + result1[1] + "]");
        System.out.println("[" + result2[0] + ", " + result2[1] + "]");
        System.out.println("[" + result3[0] + ", " + result3[1] + "]");
        System.out.println("[" + result4[0] + ", " + result4[1] + "]");
    }
}