package prep1.chapter1;

public class removeduplicates {

    private static String removeDup(String inp) {
        char[] c = inp.toCharArray();
        if (inp == null) {
            return null;
        }else if(inp.length()== 0){
            return "";
        }else if (inp.trim() == ""){
            return null;
        }else{
            int charPos = 1;
            for (int i = 1; i < c.length; i++) {
                int j;
                for (j= 0; j < charPos; j++) {
                    if (c[i] == c[j]) {
                        break;
                    }
                }
                if(charPos == j){
                    c[charPos] += c[i];
                    charPos++;
                }
            }
            System.out.println(c.toString());
            return c.toString();
        }
    }
    public static void main(String[] args) {
        String inp = "asdasd";
        String inp2="zxcvbnmasdfghjklqwertyuiop";
        removeDup(inp);
        removeDup(inp2);
    }
}
