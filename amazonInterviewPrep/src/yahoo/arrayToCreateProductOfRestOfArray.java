package yahoo;

public class arrayToCreateProductOfRestOfArray {
    public static void main(String[] args) {
        int[] inp = {2,3,1,4,3,2};
        arrayToCreateProductOfRestOfAr(inp);
    }

    private static void arrayToCreateProductOfRestOfAr(int[] inp) {
        int[] pro = new int[inp.length];
        int prod=inp[1];
        for(int i =2; i <inp.length; i++){
            prod = prod * inp[i];
        }
        pro[0] = prod;

        for(int i =1; i <inp.length;i++){
            int curProd = pro[i-1];
            curProd = (curProd /inp[i])*inp[i-1];
            pro[i] = curProd;
        }
        print(pro);

    }
    static void print(int[] inp) {
        for(int i =0; i < inp.length; i ++){
            System.out.print(inp[i] +" ");
        }
    }
}
