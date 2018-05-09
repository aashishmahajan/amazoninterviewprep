package yahoo;

public class largestPalindromeProduct {
    public static void main(String[] args) {
        int nDigit1 = 1;
        int nDigit2 = 2;
        findLargestPalindromeProduct(nDigit1);
        findLargestPalindromeProduct(nDigit2);

    }

    private static void findLargestPalindromeProduct(int nDigit) {
        int max =Integer.MIN_VALUE;
        int ind =1;
        int next = ind+1;
        int runLoop =(int) Math.pow(10,nDigit);
        while(next<runLoop){
            int prd = ind * next;

            if(isPalindrome((""+prd).toCharArray())){
                if(max < prd){
                    max = prd;
                }
            }
            if(next+1 ==runLoop){
                ind++;
                next = ind+1;
                continue;
            }next++;
        }
        System.out.println("for digit "+nDigit+": " +max);
    }

    public static boolean isPalindrome(char[] n){
        if(n.length ==1) return true;
        int i=0;
        int j= n.length-1;
        while(i<j){
            if(n[i] != n[j]){
                return false;
            }
            i++;j--;
        }
        return true;
    }
}
