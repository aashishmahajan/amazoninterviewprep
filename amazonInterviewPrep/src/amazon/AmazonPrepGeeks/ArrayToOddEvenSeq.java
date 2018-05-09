package AmazonPrepGeeks;

import java.util.ArrayList;
import java.util.List;

public class ArrayToOddEvenSeq {
    static void mergeEvenOdd(int[] inp, int length){
        List<Integer> oddList= new ArrayList<>();
        List<Integer> evenList= new ArrayList<>();
        int[] resultArray = new int[length];

        for(int i =0; i < length ;i ++){
            if(inp[i] %2 ==0){
                evenList.add(inp[i]);
            }else{
                oddList.add(inp[i]);
            }
        }

        int k=0;
        for(k =0; k <length; k++ ){
            if(k%2==0 && evenList.size()!= 0){
                resultArray[k] = evenList.get(0);
                evenList.remove(0);
            } else if(k%2 ==0 && evenList.size()!= 0){
                resultArray[k] = oddList.get(0);
                oddList.remove(0);
            }else{
                if(oddList.size()!=0){
                    resultArray[k] = oddList.get(0);
                    oddList.remove(0);
                }   else{
                    resultArray[k] = evenList.get(0);
                    evenList.remove(0);
                }
            }
        }

        for( int i =0; i < length;i++){
            System.out.println(resultArray[i]);
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
         int[] inp={ 5,1,2,3,4,6};
         int[] inp2={ 0,0,0,0,0,0};
        int[] inp3={ 1,1,1,1,1,1};
        int[] inp4={ 1,2,3,4,5,7};
         mergeEvenOdd(inp, inp.length);
        mergeEvenOdd(inp2, inp.length);
        mergeEvenOdd(inp3, inp.length);
        mergeEvenOdd(inp4, inp.length);
    }
}
