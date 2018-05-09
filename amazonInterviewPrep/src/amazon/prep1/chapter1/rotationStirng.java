package prep1.chapter1;

public class rotationStirng {
    private static boolean isRotation(String s1, String s2){
        s1 = s1+s1;

        if(s1.indexOf(s2)==-1){
            return false;
        }else{
            return true;
        }
    }
    public static void main(String[] args) {
        String s1="waterbottle";
        String s2="erbottlewat";
        System.out.println(isRotation(s1,s2));
    }

}
