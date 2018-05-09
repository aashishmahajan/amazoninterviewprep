package prep1.crackingcodingList;

public class targetSum {
    static int ways(int[] inp, int target){
        if(inp ==null  || inp.length==0|| target <0){
            return 0;
        }else{
            int[] res =new int[1];
            calculateWay(inp, 0,0,0,target,res);
                    return res[0];
        }
    }

    static void calculateWay(int[] inp, int sum, int idx, int k, int target, int[] res){
        if(k == inp.length){
            if(sum ==target){
                res[0] += 1;
            }
        }
        for(int i=idx; i < inp.length ;i++){
            calculateWay(inp, sum + inp[i], i+1, k+1, target,res);
            calculateWay(inp, sum - inp[i], i+1, k+1, target,res);
        }
    }

    public static void main(String[] args) {
        int[] inp = new int[]{1,1,1,1,1};
        System.out.println(ways(inp,3));
    }
}
