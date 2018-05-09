package yahoo;
/*
    *
    * Given two words, determine if the first word, or any anagram of it, appears in consecutive characters of the second word. For instance, tea appears as an anagram in the last three letters of slate, but let does not appear as an anagram in actor even though all the letters of let appear in slate.
    Return the anagram of the first word that has appeared in the second word.
    Sample Input 1
    tea
    slate

    Sample Output1
    ate
    Sample Input 2
    let
    slate
*/
public class checkIf2StringContainAnagram {
    public static void main(String[] args) {
        String s1 = "let";
        String s2 = "slate";

        System.out.println(checkIfExist(s1,s2));
    }

    private static boolean checkIfExist(String chars, String char2) {
        if(chars.length() == char2.length()){
            return (char2+char2).contains(chars);
        }else{
            for(int i =0; i <char2.length(); i++){
                int l = chars.length();
                if(chars.indexOf(""+char2.toCharArray()[i])!= -1){
                    if(i+l<chars.length()){
                        String tmp = char2.substring(i, i+l);
                        if((tmp+tmp).contains(chars)){
                            return true;
                        }
                    }
                }
            }
        }
        return false;

    }
}
