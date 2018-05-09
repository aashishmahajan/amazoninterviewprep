package geeksforgeekAmazon2;

import java.util.HashSet;
import java.util.Set;

public class mediumInterleavingString {
    static Set<String> s = new HashSet<>();
    public static void main(String[] args) {
        String inp1 = "ab";
        String inp2 = "cd";
        /*interleavingString(inp1, inp2);
        for(String ss : s){
            System.out.println(ss);
        }
        System.out.println("\n\n\n now again");*/
        printInterl(inp1, inp2);
    }

    private static void interleavingString(String inp1, String inp2) {
        if(inp1.length() ==0){
            printInterleave(inp2+"", 0, inp2.length());
        }if(inp2.length() ==0){
            printInterleave(inp1+"",0, inp1.length());
        }
        else{
            printInterleave(inp1+inp2,0, (inp1.length()+inp2.length()));
        }
    }

    private static void printInterleave(String inp1,int start , int length) {
        if(start ==length){
            s.add(inp1);
        }else{
            for(int i =start; i < length; i++){
                inp1 = swap(inp1, start, i);
                printInterleave(inp1, start+1, length);
                inp1 = swap(inp1, start, i);
            }
        }
    }
    private static String swap (String inp , int start, int length){
        char tmp ;
        char[] tmpA = inp.toCharArray();
        tmp = tmpA[start];
        tmpA[start] =tmpA[length];
        tmpA[length] = tmp;
        return String.valueOf(tmpA);
    }

    public static void printInterl(String inp1, String inp2){
        printNow(inp1,inp2,"");
    }

    private static  void printNow(String inp1, String inp2, String s) {
        if((inp1==null || inp1.length()==0) &&(inp2==null || inp2.length()==0)){
            return;
        }if((inp1==null || inp1.length()==0)){
            System.out.println("" + s + inp2+ "");
            return;
        }if((inp2==null || inp2.length()==0)){
            System.out.println("" + s + inp1 + "");
            return;
        }
        printNow(inp1.substring(1), inp2, s +inp1.charAt(0));
        printNow(inp1, inp2.substring(1), s +inp2.charAt(0));
    }
}
