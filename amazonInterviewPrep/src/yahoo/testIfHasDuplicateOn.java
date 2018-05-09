package yahoo;

public class testIfHasDuplicateOn {
    public static void main(String[] args) {
        int[] i = {1,2,3,4,5,6,7,1};
        int[] j = {1,2,3,4,5,6,7};
        findIfDuplicate(i);
        findIfDuplicate(j);
    }

    private static void findIfDuplicate(int[] inp) {
        boolean flag = false;
        int i = 0;
        for(int j = i + 1; j<inp.length; j++){
            if(inp[i] == inp[j]){
                flag = true;
                break;
            }
            if ( j == inp.length-1) {
                i++;
            }
        }
        if(flag){
            System.out.println("has duplicate");
        }else{
            System.out.println("No duplicate");
        }
    }
}
