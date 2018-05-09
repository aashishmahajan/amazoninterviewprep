package leetCode;

public class validNumber {
    public static void main(String[] args) {
        String s1 ="0";
        String s2 ="0.1";
        String s3 ="abc";
        String s4 ="1 a";
        /*String s5 ="2e10";*/

        String s5 ="1 ";
        if(s5 ==s5.replaceAll(" ","")){
            System.out.println("u +"+true);
        }
        System.out.println(isNumberic(s1));
        System.out.println(isNumberic(s2));
        System.out.println(isNumberic(s3));
        System.out.println(isNumberic(s4));
        System.out.println(isNumberic(s5));
    }

    private static boolean isNumberic(String s1) {
         try{
                double d = Double.parseDouble(s1);

        }catch (NumberFormatException e) {
             return false;
         }
         return true;
    }
}
