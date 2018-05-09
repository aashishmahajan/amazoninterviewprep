package AmazonPrepGeeks;

import java.util.HashSet;
import java.util.Set;

public class NextGreaterNumberWithDigits {

    static private void permutation(String s, int l, int r, Set set){
        if(l==r){
            set.add(s);
        }
        else{
            for(int i =1; i<= r; i++){
                swap(s, l,i, set);
                permutation(s, l+1,r, set);
                swap(s, l,i, set);
            }
        }
    }

    static void swap(String a, int i, int j, Set set)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        set.add(String.valueOf(charArray));
        return;
    }


    public static void main(String[] args) {
        int n = 143;
        int n2 = 431;
        Set<String> set =new HashSet<>();
        String s = (""+n).toString();
        permutation(s, 0, s.length()-1,set);
        System.out.println(set);
    }
}
