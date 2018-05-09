package yahoo;

public class DupsUnderConstaint {
    public static void main(String[] args) {
        int[] inp ={1,1,3,1,1,4,2,1,5,1};
        findDupss(inp);

    }

    private static void findDupss(int[] inp) {
        int i = 0;
        int j = inp.length-1;
        while(i<j){
            if(inp[i]==inp[j]){
                System.out.println(inp[i]);
                break;
            }
            i++;
            j--;
        }
    }
}
