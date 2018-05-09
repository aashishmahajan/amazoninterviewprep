package GeekForGeekMostAsked;

public class NextGreaterElement {
    static int[] nxtGreater;
    public static void main(String[] args) {
        int[] inp = {4,5,2,24};
        int[] inp2 = {12,7,6,12};

        nextGreaterElement(inp, inp.length);
        nextGreaterElement(inp2, inp2.length);
    }

    private static void nextGreaterElement(int[] inp, int length) {
        int intital =0;
        nxtGreater = new int[length];
        for(int i =0; i < length; i++){
            nxtGreater[i] = -1;
        }
        while(intital < length) {
            for (int j =intital+1; j< length; j++ ){
                if (nxtGreater[intital] < inp[j] && inp[intital]< inp[j]){
                    nxtGreater[intital] = inp[j];
                    j =length;
                    break;
                }
            }intital++;
        }
        for( int i =0; i < length; i++){
            System.out.print(" "+nxtGreater[i]);
        }
        System.out.println();
    }
}
