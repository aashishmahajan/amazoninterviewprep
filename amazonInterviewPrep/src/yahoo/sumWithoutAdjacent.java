package yahoo;

public class sumWithoutAdjacent {
    public static void main(String[] args) {
        int [] inp ={1,2,3,4,5,6,7,8};
        findMaxNonAdjacentSum(inp);
    }

    private static void findMaxNonAdjacentSum(int[] inp) {
        int max = Integer.MIN_VALUE;
        int iter = 0;
        int indx = iter+2;
        int tmp= inp[iter];

        while(indx < inp.length) {
            tmp += inp[indx];
            if(max < tmp){
                max = tmp;
            }
            if( indx >= inp.length-2 || indx == inp.length){
                iter++;
                indx = iter+2;
                tmp = inp[iter];
                continue;
            }
            indx = indx+2;
        }
        System.out.println( max);
    }
}
