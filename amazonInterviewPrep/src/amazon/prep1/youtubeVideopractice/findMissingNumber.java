package prep1.youtubeVideopractice;

/*
  * while it is given that there is a non negative sequence above 1-n is given,
  * we are 2 find a missing number,
  *
  * in case of 1 missing number, n *n+1/2  == would give sum of all the terms,
  * so calculate the sum of the array given, Xor it, and u ill get the missing
  * value
  *
  * sort array and traverse adjacent items
  * for 2 values, what we can do is, iterate, and find, by incrementing,
  * or we can do XOR by split functionality
  * reason, as it is non matching sequence, 2 numbers cannot be same, so one
  * has to be small XOR for any number smaller then the number
  * and xor for any number greater,
  *
  * */

public class findMissingNumber {

    static public int[] findMissingNumb(int[] inp){
        if(inp == null || inp.length ==0){
            return null;
        }
        int len = inp.length+2;
        int actualExistingSum  = (len) * (len+1)/2;
        int inpSum =0;

        for(int i = 0; i < inp.length; i++){
            inpSum += inp[i];
        }
        int diff = actualExistingSum -inpSum;
        int midCo = (int)(diff/2);
        int acutalXorSumFoLessrMid =0;
        int actualXorSUmFOrMorMid =0;
        for(int i =0; i <= midCo ; i++){
            acutalXorSumFoLessrMid ^= i;
        }
        for(int i =midCo+1; i <= len ; i++){
            actualXorSUmFOrMorMid ^= i;
        }

        int xorInpLessMidd =0;
        int xorInpMoreThanMid =0;
        for(int i =0; i <inp.length ;i++){
            if(inp[i]<=midCo){
                xorInpLessMidd ^= inp[i];
            }else{
                xorInpMoreThanMid ^= inp[i];
            }
        }
        int[] arr = new int[]{acutalXorSumFoLessrMid^xorInpLessMidd , actualXorSUmFOrMorMid^xorInpMoreThanMid};
        return arr;
    }

    public static void main(String[] args) {
        int[] inp ={1,2,4,5,6,7,9};
        System.out.println(findMissingNumb(inp));
    }
}
