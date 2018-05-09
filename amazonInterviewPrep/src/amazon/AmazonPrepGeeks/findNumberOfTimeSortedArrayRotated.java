package AmazonPrepGeeks;

public class findNumberOfTimeSortedArrayRotated {

    static int rotationCount(int[] inp){
        int length = inp.length;
        System.out.println("length:" +length);
        for(int i = 0; i < inp.length-1; i++){
            if(inp[i]> inp[i+1]){
                return (length - (i+1));
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] inp = new int[]{5,1,2,3,4};
        int[] inp2 = new int[]{10,11,12,13,14,15,9};
        System.out.println(rotationCount(inp));
        System.out.println(rotationCount(inp2));
    }
}
