package yahoo;

public class biggerToRight {
    static int[] biggerToRightArray(int[] inp){
        if(inp.length==0){
            return inp;
        }
        if(inp.length==1){
            return inp;
        }
        int[] newArray = new int[inp.length];
        int current = 0;
        int next =1;
        while(next <= inp.length-1){
            if(inp[current] < inp[next]){
                newArray[current] = newArray[current] + 1;
            }
            if(next ==inp.length-1 && current != inp.length-1){
                current++;
                next = current+1;
            }else {
                next++;
            }
        }
        return newArray;
    }
    public static void main(String[] args) {
        int[] inp = {2,7,5,3,0,8,1};
        int[] out = biggerToRightArray(inp);
        print(out);
    }

    private static void print(int[] out) {
        for(int i =0; i<out.length; i++){
            System.out.print(out[i] + " ");
        }
    }
}
