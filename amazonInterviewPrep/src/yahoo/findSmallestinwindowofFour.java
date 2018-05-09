package yahoo;

public class findSmallestinwindowofFour {
    static int[] ret ;
    public static void main(String[] args) {
        int[] i = {2,1,3,4,6,3,8,9,10,12,56};
        ret = new int[i.length];
        findSmallArry(i);
    }
    static int[] findSmallArry(int[] inp){
        if(inp.length<5&& inp.length>0){
            int min =Integer.MAX_VALUE;
            for(int i =0; i <inp.length ;i++){
                if(inp[i]<min){
                    min = inp[i];
                }
            }
            ret[0] = min;
            return ret;
        }else{
            int j=0;
            int min =Integer.MAX_VALUE;
            for(int i=j; i<= j+3 &&i <inp.length; i++){
                if(inp[i] < min){
                    min = inp[i];
                }
                if(i == j+3){
                    ret[j] = min;
                    min = Integer.MAX_VALUE;
                    j++;
                    i =j-1;
                }
            }
            return ret;
        }
    }
}
