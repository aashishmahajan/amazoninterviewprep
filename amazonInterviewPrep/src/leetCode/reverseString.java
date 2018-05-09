package leetCode;



public class reverseString {
    public static void main(String[] args) {
        String s = "hello";
        char[] c= new char[s.length()];
        for(int i = s.length(); i>0; i--){
            c[s.length()-i] = s.charAt(i-1);
        }
        for(char ch: c){
            System.out.print(ch);
        }
    }
}
