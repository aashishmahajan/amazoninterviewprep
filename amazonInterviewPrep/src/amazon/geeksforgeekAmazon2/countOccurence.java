package geeksforgeekAmazon2;
/*
 * 1. use a for loop, iterate and increment through
 *
 * 2. binary search approach
 *
 *  */
public class countOccurence {
    public static void main(String[] args) {
        int[] inp = {1,1,1,2,2,2,2,3,3};
        int len = inp.length;
        int count = findCount(inp, len, 2);
        System.out.println(count);
    }

    private static int findCount(int[] inp, int len, int x) {
        if(len ==0){
            return -1;
        }


        int first = findFirst(inp, 0, len-1, x, len);
        if(first == -1){
            return -1;
        }

        int last = findLast(inp, first, len-1, x, len);
        return last-first+1;

    }

    private static int findFirst(int[] inp, int start, int end, int x, int len) {
        if(end>=start) {
            int mid =(start+end)/2;
            if ((mid == 0 || x > inp[mid - 1]) && x == inp[mid]) {
                return mid;
            } else if (x > inp[mid]) {
                return findFirst(inp, (mid + 1), end, x, len);
            } else {
                return findFirst(inp, 0, (mid - 1), x, len);
            }
        }
        return -1;
    }


    private static int findLast(int[] inp, int first, int end, int x, int len) {
        if(end>=first){
            int mid = (first+end)/2;
            if((mid == len-1 || x < inp[mid+1]) && x ==inp[mid]){
                return mid;
            }else if (x > mid){
                return findLast(inp, mid+1, end, x, len);
            } else{
                return findLast(inp, mid-1, end, x, len);
            }
        }
        return -1;
    }

}
