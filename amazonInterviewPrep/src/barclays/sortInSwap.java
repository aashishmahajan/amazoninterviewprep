package barclays;

public class sortInSwap {
    public static void main(String[] args) {
        int[] inp ={1,2,3,4,5,6,7};
        int[] inp2 ={2,4,5,7,8,6,5};
        System.out.println(isSortInSwap(inp));
        System.out.println(isSortInSwap(inp2));
    }

    private static boolean isSortInSwap(int[] inp) {
        int swapCount =0;

        for(int i =0; i < inp.length-1; i++){
            if(inp[i] > inp[i+1]){
                int tmp = inp[i+1];
                inp[i+1] = inp[i];
                inp[i] = tmp;
                swapCount+=1;
                if(swapCount>=2){
                    return false;
                }
            }
        }
        return true;
    }
}
