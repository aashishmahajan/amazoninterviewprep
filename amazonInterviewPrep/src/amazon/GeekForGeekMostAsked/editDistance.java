package GeekForGeekMostAsked;

public class editDistance {
    public static void main(String[] args) {

        String str1 = "aashi";
        String str2 = "aashish";

        findNumberOfedits(str1,str2, str1.length(), str2.length());
    }

    private static int findNumberOfedits(String str1, String str2, int min, int max) {
        /* operate on short length
         * */
        if(min ==0) return max;
        if(max ==0) return min;

        if(str1.charAt(min-1) == str2.charAt(max-1))
            return findNumberOfedits(str1, str2, min-1, max-1);

        return 1+ (findNumberOfedits(str1,str2, min, max-1)+
                findNumberOfedits(str1,str2, min-1, max)+
                findNumberOfedits(str1,str2, min-1, max-1));
    }
}
