package yahoo;

public class step2FindRepeatedInt {
    public static void main(String[] args) {
        int[] inp = {1,2,1,4,1,1,1,3,1,5};
        find(inp);
    }

    private static void find(int[] inp) {
        int i=0;
        int j= inp.length-1;
        while(i < j) {
            if(inp[i] !=inp[j]){
                i++;
                j--;
            }else{
                System.out.println(inp[i]);
                break;
            }
        }
    }
}
