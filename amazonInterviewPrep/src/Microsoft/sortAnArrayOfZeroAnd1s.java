package Microsoft;

public class sortAnArrayOfZeroAnd1s {
    public static void main(String[] args) {
        int[] inp = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        sort(inp, inp.length);
        for(int i =0; i <inp.length;i++){
            System.out.print(inp[i]+" ");
        }
    }

    private static void sort(int[] inp, int length) {
        int low =0;
        int high =length-1;
        int mid =0,tmp=0;

        while(mid<=high){
            switch(inp[mid])
            {
                case 0:
                    tmp =inp[low];
                    inp[low] = inp[mid];
                    inp[mid] = tmp;
                    low++;mid++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    tmp =inp[mid];
                    inp[mid] =inp[high];
                    inp[high] = tmp;
                    high--;
                    break;
            }
        }
    }
}
