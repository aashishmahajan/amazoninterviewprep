package leetCode;

import java.util.Arrays;

public class morseCode {
    public static void main(String[] args) {
        int[][] p = new int[1][2];
        p[0][0] = 0;
        p[0][1] = 0;
        int[][] q = new int[1][2];
        q[0][0] = 0;
        q[0][1] = 0;

        System.out.println(move(p, q,"UD"));
        System.out.println(move(p,q, "UDL"));
        System.out.println(move(p, q,"UDLR"));

    }

    private static boolean move(int[][] p, int[][] q,String ud) {
        boolean flag=true;
        for(char c: ud.toCharArray()) {
            switch (c) {
                case 'U':
                    q[0][1] += 1;
                    continue;
                case 'D':
                    q[0][1] -= 1;
                    continue;
                case 'R':
                    q[0][0] += 1;
                    continue;
                case 'L':
                    q[0][0] -= 1;
                    continue;
                default:
                    System.out.println("wrong move");

            }

        }
        for(int i=0; i<q[0].length;i++){
            if(q[0][i] != p[0][i]){
                flag =false;
                break;
            }
        }

        return flag;

    }
}
