package yahoo;

public class sortBySwap {

    public static void main(String[] args) {
        int[] inp = {1,2,3,4,5,6,7};
        int[] indesc = {7,6,5,4,3,2,1};
        int[] mesh = {7,4,1,3,2,5,6};

        sortNow(inp);
        System.out.println();
        sortNow(indesc);
        System.out.println();
        sortNow(mesh);
    }

    private static int[] sortNow(int[] inp) {
        if(inp.length==0){
            return null;
        }
        if(inp.length==1){
            return inp;
        }
        int cur =0, next =1;
        boolean flag= false;
        while(next != inp.length && !flag){
            if(Math.abs(inp[cur]-inp[next]) == 1 ){
                if(inp[cur] > inp[next]) {
                    int mtp = inp[next];
                    inp[next] = inp[cur];
                    inp[cur] = mtp;
                }
                if(Math.abs(inp[next]-inp[cur]) >1) {
                    flag= true;
                    break;
                }
                cur = next;
                next++;
            } else if(Math.abs(inp[next]-inp[cur]) >1) {
                flag= true;
                break;
            }

        }

        if(flag){
            System.out.println("cannotSort");
            return inp;
        }
        System.out.println("already Sorted");
        return inp;
    }
}
