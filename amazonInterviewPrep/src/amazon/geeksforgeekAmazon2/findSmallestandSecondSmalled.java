package geeksforgeekAmazon2;
/*
* arrays.sort ( and retunr first 2 element
*
* or the approach shown below,
* */
public class findSmallestandSecondSmalled {

    public static void main(String[] args) {
        int[] inp = {12,1,30,100,100,6};
        findtwoMin(inp);
    }

    private static void findtwoMin(int[] inp) {
        int min1 = inp[0];
        int min2 = min1;
        for(int i =0; i < inp.length; i++){
            if(min1 > inp[i]){
                min2 = min1;
                min1 = inp[i];
                continue;
            }
            if(min2 > inp[i]){
                min2= inp[i];
            }
        }
        System.out.println(min1 +": "+min2);
    }

}
