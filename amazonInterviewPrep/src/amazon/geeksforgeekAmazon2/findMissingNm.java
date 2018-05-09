package geeksforgeekAmazon2;

public class findMissingNm {
    public static void main(String[] args) {
        int[] inp = {1,2,4,5,6,7,8};
        System.out.println(findMissingNum(inp));
        System.out.println(finMiss(inp, inp.length));
    }

    private static int finMiss(int[] inp, int length) {
        int start = inp[0];
        int actSum= 1;
        for(int i =1; i < length;i++){
            start = start ^ inp[i];
        }

        for(int i=2; i <= length+1; i++){
            actSum = actSum ^ i;
        }
        return start ^actSum;
    }

    private static int findMissingNum(int[] inp) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i =0; i < inp.length; i++){
            sum += inp[i];
            if(inp[i]>max){
                max = inp[i];
            }
        }

        int actualSum = max*(max+1)/2;
        return actualSum-sum;
    }
}
