package GeekForGeekMostAsked;

import java.util.Arrays;

public class provePythaGorasforarray {
    private void haveTriplet(int[]inp , int n){
        int[] sqare = new int[n];
        for(int i = 0; i < n; i++){
            sqare[i] = inp[i]* inp[i];
            System.out.println(sqare[i]);
        }


        Arrays.sort(sqare);

        for(int i = n-1 ; i >= 2;i--){
            int j =0;
            int r =i-1;
            while(j<r){
                if(sqare[j]+sqare[r]== sqare[i]){
                    System.out.println("exist "+j+" "+r+" "+i);

                }
                if(sqare[j]+sqare[r] < sqare[i]){
                    j++;
                }else{
                    r--;
                }
            }

        }
    }
    public static void main(String[] args) {
        int[] inp = {1,2,3,4,5};
        provePythaGorasforarray p = new provePythaGorasforarray();
        p.haveTriplet(inp, inp.length);
    }
}
