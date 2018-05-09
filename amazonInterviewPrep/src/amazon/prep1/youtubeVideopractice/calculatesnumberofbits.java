package prep1.youtubeVideopractice;

public class calculatesnumberofbits {
    int cal (int x){
        int sum= 0;
        while(x > 0){
            sum += x & 1;
            x >>= 1;
        }
        return sum;
    }
    /*runtine  is capped by number of digits in integer
     * O(logN)
     *
     * */
}
