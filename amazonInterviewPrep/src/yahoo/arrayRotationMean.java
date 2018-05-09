package yahoo;

public class arrayRotationMean {
    static int max=0;
    static void rotateAra(int[] inp){
        for(int i=0; i <inp.length;i ++){
            int[] ne = leftRotate(inp, inp.length);
            meanCal(ne);
        }
    }

    static int[] leftRotate(int[] inp, int n) {
        int tmp = inp[0];
        int i;
        for(i =0; i < n-1 ; i++){
            inp[i] = inp[i+1];
        }
        inp[i] = tmp;
        return inp;
    }

    static void meanCal (int[]inp){
        int pmean =0;
        for(int i =0;i < inp.length;i ++){
            pmean += ( (i+1) * inp[i]);
        }
        if(max < pmean){
            max =pmean;
        }
    }
    public static void main(String[] args) {
        int[] inp = {10,20,30};
        rotateAra(inp);
        System.out.println(max);
    }
}
