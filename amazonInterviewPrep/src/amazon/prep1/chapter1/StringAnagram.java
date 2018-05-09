package prep1.chapter1;

import java.util.Arrays;

public class StringAnagram {
    private static boolean isAnagram(String s1, String s2){
        if(s1.length()==0 || s2.length()==0){
            return false;
        }else if(s1.trim()=="" || s2.trim()==""){
            return true;
        }else if(s1.length() != s2.length()){
            return false;
        }
        else{
            char[] str1 = s1.toCharArray();
            Arrays.sort(str1);
            char[] str2 = s2.toCharArray();
            Arrays.sort(str2);
            boolean flag = true;
            for(int i = 0 ; i < s1.length() ; i++){
                if(str1[i] == str2[i]){
                    continue;
                }else{
                    flag = false;
                    return false;
                }
            }if(flag){
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args) {
        String s1 ="abcd";
        String s2 ="bcda";
        String s3 ="qwer";
        String s4 ="erwq";
        System.out.println(isAnagram(s1,s2));
        System.out.println(isAnagram(s2,s3));
        System.out.println(isAnagram(s1,s3));
        System.out.println(isAnagram(s4,s3));
    }
}
