package leetCode;

public class positioncarray {
    static int[] n ;
    public static void main(String[] args) {
        String s= "loveleetcode";
        char inp = 'e';
        n = new int[s.length()];
        findMinDistanceArray(0, s, n, inp);
        processForMin(n);

   }

    private static void processForMin(int[] n) {
        for(int i=0; i < n.length-1; i++){
            if(Math.abs(n[i]-n[i+1])>1){
               if( n[i] > n[i+1]){
                   n[i] = n[i]+1 ;
               }else{
                   n[i+1] = n[i] +1;
               }
            }
            System.out.println(n[i]);
        }
    }

    private static void findMinDistanceArray(int ind, String s, int[] n,char inp)
    {
        int inx = findOccurence(ind, s, inp);
        int tmp =inx;
        if( inx != -1){
            for(int i =ind; i <= tmp+ind;i++){
                n[i] = tmp+ind-i;
            }
        }
        if(ind<s.length() || inx !=-1){
            findMinDistanceArray(ind+inx+1, s, n, inp);
        }
    }

    private static int findOccurence(int i, String s, char inp) {
        String tmp = s.substring(i,s.length());
        return tmp.indexOf(inp);
    }


}
