package prep1.chapter1;

public class replaceSpace {
    private static String replace(String inp) {
        if(inp ==null){
            return null;
        }if(inp.length()==0){
            return inp;
        }else {
            String s="";
            int index = inp.indexOf(" ");
            if (index == 0) {
                s = "%20" + inp.substring(1, inp.length());
                return replace(s);
            }
            if (index != -1) {
                s = inp.substring(0, index ) + "%20" + inp.substring(index + 1, inp.length());
                return replace(s);
            }
            return inp;
        }
    }
    public static void main(String[] args) {
        String inp = " i am here testing this";
        System.out.println(replace(inp));
    }
}
