package AmazonPrepGeeks;

import java.util.Arrays;

/*
* 2 mmethod: n2 : by taking a for loop and keep a track of min sum and index pointer to that
*
* 2nd method: sort the array, and take two pointer in for loop, starting from 0 and length minue-1
* */
public class twoNumberClosingtoSumZero {

    static void findSum(int[] inp){
        if(inp.length<2){
            System.out.println(inp);
            return ;
        }
        Arrays.sort(inp);
        if(inp[inp.length-1] <0){
            System.out.println(inp[inp.length-2] +"  : "+inp[inp.length-1]);
        }
        else{
            Arrays.sort(inp);
            int n = inp.length;
            int minsum = Integer.MIN_VALUE;
            int minIdxL = Integer.MIN_VALUE;
            int minR =Integer.MIN_VALUE;
            int nIdx = 0;
            int pIdx = n-1;
            while(nIdx < pIdx){
                int sum = inp[nIdx]+ inp[pIdx];
                if(minsum == Integer.MIN_VALUE){
                    minsum = sum;
                    minIdxL =nIdx;
                    minR = pIdx;
                }else{
                    if(Math.abs(sum)<Math.abs(minsum)){
                        minsum =sum;
                        minIdxL = nIdx;
                        minR = pIdx;
                    }
                }
                if(sum ==0){
                    System.out.println(inp[nIdx] +": "+inp[pIdx]);
                }
                if(sum < 0){
                    nIdx++;
                }else{
                    pIdx--;
                }

            }
            System.out.println(minsum);
            System.out.println(inp[minIdxL]+" : "+inp[minR]);
        }
    }

    public static void main(String[] args) {
        int[] inp = {-8 ,-66 ,-60};
        int[] inp2 = {-70 ,-46 ,-41,28 ,16 ,20};

/*        findSum(inp);*/
        findSum(inp2);
    }

}
