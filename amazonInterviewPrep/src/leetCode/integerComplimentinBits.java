package leetCode;

public class integerComplimentinBits {
    public static void main(String[] args) {
        int i=5;
        complement(Integer.toBinaryString(i));
    }

    private static void complement(String s) {
        char[] c = s.toCharArray();
        for(int i =0; i < s.length(); i++){
            if(c[i] == '0'){
                c[i] = '1';
            }else{
                c[i] = '0';
            }
        }
        String st="";
        for(char ch: c){
            st+=ch;
        }
        System.out.println(Integer.parseInt(st,2));
    }
}
