package AmazonPrepGeeks;
/*
 *  generalized way : calculate each house order such that maximize the sum, skip the odd positions
 *  */
public class StealerTheif {
    static int findMaxLoot(int[] inp, int length){
        if(length == 0){
            return inp[0];
        }
        if(length ==1){
            return inp[0]>inp[1] ?inp[0]:inp[1];
        }
        int[] dp = new int[length];
        dp[0] = inp[0];
        dp[1] = Math.max(inp[0], inp[1]);

        for(int i =2; i < length; i++){
            dp[i] = Math.max(inp[i]+ dp[i-2], dp[i-1]);
        }
        //System.out.println(dp[length-1]);
        return dp[length-1];
    }
    public static void main(String[] args) {
        int[] inp = {5 ,5 , 10 ,100 ,10 ,5};
        int[] inp2 = {6, 7, 1, 3, 8, 2, 4};

        findMaxLoot(inp, inp.length);
        findMaxLoot(inp2, inp2.length);
    }
}
