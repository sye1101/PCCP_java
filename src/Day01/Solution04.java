package Day01;
import java.util.*;
class Solution04 {

    public static int[] solution(String moves) {
        int r = 0;
        int c = 0;

        // 현재 방향 (dx, dy의 인덱스를 저장해 둔다.)
        int direction = 1;

        HashMap<Character, Integer> dic = new HashMap<>();
        dic.put('G', 0);
        dic.put('R', 1);
        dic.put('L', 3);

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        for (char i : moves.toCharArray()) {
            if (i == 'G') {
                r += dx[direction];
                c += dy[direction];
            } else {
                direction = (direction + dic.get(i)) % 4;
            }
        }

        return new int[]{r, c};
    }

    public static void main(String[] args) {
        int[] result1 = solution("GGGRGGG");
        int[] result2 = solution("GGRGGG");
        int[] result3 = solution("GGGGGGGRGGGRGGRGGGLGGG");
        int[] result4 = solution("GGLLLGLGGG");

        System.out.println("[" + result1[0] + ", " + result1[1] + "]");
        System.out.println("[" + result2[0] + ", " + result2[1] + "]");
        System.out.println("[" + result3[0] + ", " + result3[1] + "]");
        System.out.println("[" + result4[0] + ", " + result4[1] + "]");
    }
}

