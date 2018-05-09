package geeksforgeekAmazon2;

/*
 * find possible combination of rotation
 * get sum of places at one tens and so one
 *
 *  */

public class MaximumSum {
    static String[] rotation;
    public static void main(String[] args) {
        int[] inp={8, 3, 1, 2};

        System.out.println(findRotation(inp, inp.length));
    }

    private static int findRotation(int[] arr, int n) {
        int curSum = 0;
        for (int i = 0; i < n; i++) {
            curSum += arr[i];
        }

        int curPosSum = 0;
        for (int i = 0; i < n; i++) {
            curPosSum +=  i*arr[i];
        }

        int res = curSum;
        for( int i =1; i < n ; i++){
            int curNew = curPosSum -(curSum- arr[i-1]) + arr[i-1]*(n-1);
            curPosSum = curNew;
            res = Math.max(res, curNew);
        }
        return res;
    }
}
