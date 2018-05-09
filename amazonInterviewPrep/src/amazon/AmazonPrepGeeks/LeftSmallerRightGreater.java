package AmazonPrepGeeks;

import java.util.Arrays;

/* sort and pic value in middle and compare left and right;
 * is mid is repeating, move the index to right
 *
 * issue: in case of array been {11,9,12}
 * */
public class LeftSmallerRightGreater {
    static void findNumber(int[] inp ){
        Arrays.sort(inp.clone());
        int indmid =Math.abs(inp.length/2);
        int valMid = inp[indmid];

        for(int i =0; i < inp.length;i++){
            if(i <= indmid && valMid >= inp[i]){
                continue;
            }else{
                if(i> indmid && valMid == inp[i] ){
                    indmid =i;
                }
            }
        }
        System.out.println(inp[indmid]);
    }

    static void solution(int[]inp, int n){
        int[] sEle = new int[n];
        int[] gEle = new int[n];

        sEle[0] = inp[0];
        gEle[n-1] = inp[n-1];
        for(int i =0; i <n;i++){
            if(gEle[i]< inp[i]){
                gEle[i] = inp[i];
            }else{
                gEle[i] = gEle[i-1];
            }
        }

        for(int i =0; i <n;i++){
            if( inp[i]< sEle[i]){
                sEle[i] = inp[i];
            }else{
                sEle[i] = sEle[i+1];
            }
        }
        for(int i =0; i < n; i ++){
            if((i==0 && inp[i]< sEle[i+1]) ||
                    (i == n-1 && inp[i]> gEle[i-1]) ||
                        (inp[i] <sEle[i+1] && inp[i]>gEle[i-1])){
                System.out.println(inp[i]);
                return;
            }
        }
        System.out.println(-1);

    }
    public static void main(String[] args) {
        int[] inp ={4 ,3 ,2 ,7 ,8 ,9};
        int[] inp2 ={4 ,3 ,5 ,7 };
        int[] inp3 ={11,9,12};
        findNumber(inp);
        findNumber(inp2);
        findNumber(inp3);

        solution(inp, inp.length);
        solution(inp2,inp2.length);
        solution(inp3,inp3.length);
    }
}
