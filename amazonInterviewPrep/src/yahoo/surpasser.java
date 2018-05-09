package yahoo;

public class surpasser {
    public static void main(String[] args) {
        int [] inp = {3,4,5,1,2,6,7};
        print(findSurpasserArray(inp, inp.length));
    }

    private static int[] findSurpasserArray(int[] inp, int length) {
        int[] i = new int[length];
        int indx = 0;
        int nextSucc =indx+1;
        int sucCount =0;
        while(nextSucc< inp.length){
            if(inp[indx]< inp[nextSucc]){
                sucCount++;
            }
            if(nextSucc == inp.length-1){
                i[indx] = sucCount;
                indx ++;
                nextSucc = indx+1;
                sucCount = 0;
                continue;
            }
            nextSucc++;
        }
        return i;
    }

    static void print(int[] inp){
        for(int i: inp){
            System.out.print(i+" ");
        }
    }

}
