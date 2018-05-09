package Leetcode;

public class maxContinuousSumArray {

    public static void main(String[] args) {
        int[] inp = {-2,-3,4,-1,-2,1,5,-3};
        getSum(inp, inp.length);
    }

    private static void getSum(int[] inp, int length) {
        int i=0;
        int loopStart=0;
        int f=0;
        int maxSum =0;
        int tmpSum=0;
        while(loopStart<length){
            for(int j = loopStart; j <length; j++){
                tmpSum += inp[j];
                if(tmpSum > maxSum){
                    i =loopStart;
                    f =j;
                    maxSum = tmpSum;
                }
                if(j==length-1){
                    loopStart++;
                    tmpSum=0;
                }
            }
        }
        System.out.println("i :"+(i+1)+" ,f:"+(f+1)+" ,sum :"+maxSum);
    }
}
