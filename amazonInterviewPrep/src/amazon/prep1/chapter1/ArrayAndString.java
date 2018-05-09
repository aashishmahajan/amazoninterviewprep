package prep1.chapter1;

public class ArrayAndString {

    private static boolean checkIfNoRepeatingCharacter(String input) {
        char[] inputCharArray = input.toCharArray() ;
        for(int i =0; i < inputCharArray.length ; i++ ){
            for(int j=1; j<inputCharArray.length; j++ ){
                if(i != j && inputCharArray[i] == inputCharArray[j]){
                    System.out.println(true );
                    return true;
                }
            }
        }
        System.out.println(false);
        return false;
    }

    public static void main(String[] args) {
        String inp = "abccvbnmfghjklertyuio";
        String inp2 = "qwertyuiopasdfghjklzxcvbnm";
        checkIfNoRepeatingCharacter(inp);
        checkIfNoRepeatingCharacter(inp2);
    }
}
