package prep1.chapter1;

public class cStle {
    private static String reverserCStyleString(String inp){
        String output = "";
        if (inp.length() < 5) {
            output += "null";
        }
        char[] c = inp.toCharArray();
        for(int i =c.length -1; i >= 0 ;i--){
            output += c[i];
        }
        System.out.println(output);
        return output;
    }
    public static void main(String[] args) {
        String inp = "abcd";
        String inp2 = "asfgh";
        reverserCStyleString(inp);
        reverserCStyleString(inp2);
    }
}
