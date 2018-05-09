package prep1.randomquestions;

public class PalindromicString {

    private static  void palindromeicString( String  test){
        char[] stringArray = test.toCharArray();
        System.out.println(Character.toString(stringArray[0]) + stringArray[1] + stringArray[2]);
        String[] validArry= new String[]{};
        for(int i=0; i < stringArray.length-1;i++){
            validArry[i] = "5";
        }

        /*System.out.println(validArry);*/
        /*for(int i =0 ; i < test.length() - 1; i++){
            char[] stringArray = test.toCharArray();
            valid

        }*/
    }

    public static void main(String[] args) {
        String test = "abc";
        char[] stringArray =test.toCharArray();
        System.out.println(stringArray);
        palindromeicString(test);

    }
}
