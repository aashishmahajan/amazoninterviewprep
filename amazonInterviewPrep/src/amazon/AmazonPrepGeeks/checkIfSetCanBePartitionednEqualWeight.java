package AmazonPrepGeeks;

import java.util.Arrays;

public class checkIfSetCanBePartitionednEqualWeight {
    public static void main(String[] args) {
        int[] inp = {1,5,5,1};
        int[] inp2 = {4,2,1,7};
        int[] inp3 = {1,3,7};
        check(inp,inp.length);
    }

    private static void check(int[] inp, int length) {
        int sum=0;
        for(int i =0; i < length; i ++){
            sum+=inp[i];
        }
        if(sum%2 ==0){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }
}
