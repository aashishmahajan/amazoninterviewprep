package leetCode;

public class jewelAndStrong {
    /*public int numJewelsInStones(String J, String S) {
        char[] c =J.toCharArray();

        int count =0;
        int i=0;
        for(int j =0; j <S.length(); j++){
            if(c[i] == S.charAt(j)){
                count++;
            }

            if(j== S.length()-1){
                j =-1;

                if(i == J.length()-1){
                    break;
                }i++;
            }

        }return count;
    }*/

    public int numJewelsInStones(String J, String S) {
        int[] f = new int[128];
        for (final char c : J.toCharArray())
            f[c] = 1;
        int ans = 0;
        for (final char c : S.toCharArray())
            ans += f[c];
        return ans;
    }

    public static void main(String[] args) {
        String j ="ebd";
        String s = "bbb";
        jewelAndStrong l = new jewelAndStrong();
        System.out.println(l.numJewelsInStones(j,s));

    }
}
