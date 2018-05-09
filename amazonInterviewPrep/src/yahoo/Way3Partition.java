package yahoo;

public class Way3Partition {
    public static void main(String[] args) {
        int[] inp ={1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
        doPartition(inp, 14, 20);
    }

    private static void doPartition(int[] inp, int low, int high) {
        int[] paritionArray = new int[inp.length];
        int start=0, middle=0, end = inp.length-1;
        for (int i = 0; i < inp.length; i++) {
            if(inp[i]<low){
                middle++;
            }
        }

        for(int i =0; i < inp.length;i ++) {
            if(inp[i] < low){
                paritionArray[start] = inp[i];
                start++;
            } else if (inp[i]> high){
                paritionArray[end] = inp[i];
                end--;
            } else{
                paritionArray[middle] = inp[i];
                middle++;
            }
        }
        for(int i =0; i < paritionArray.length; i++){
            System.out.print( paritionArray[i]+" ");
        }
    }


}
