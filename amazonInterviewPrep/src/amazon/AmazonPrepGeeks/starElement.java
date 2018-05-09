package AmazonPrepGeeks;

/**
 *  star element such that all element on
 * left and right are smaller than the number
 * */
public class starElement {

    private static String findStarElement(int[] inp){
        int fst = inp[0];
        int index =0;
        for(int i =1; i < inp.length; i ++){
            if( fst <= inp[i]){
                fst = inp[i];
                index = i ;
                continue;
            }
        }
        return fst + " : index at"+ (index+1) ;
    }
    public static void main(String[] args) {
        int[] inp = new int[]{5, 1, 4, 3, 6, 8, 10, 7, 9};

        System.out.println(findStarElement(inp));
        System.out.println(findStarElement(new int[]{11,9,12}));

    }
}
