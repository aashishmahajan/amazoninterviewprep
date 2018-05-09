package prep1.stacksandQue;

import java.util.Stack;

public class FIndIfStringBalanceBracket {
    private static boolean isBalanced(String s){
        if(s == null){
            return false;
        } else if (s.trim() == "" || s.length() ==0){
            return false;
        }else if (s.indexOf("}") ==0){
            return false;
        }else{
            Stack<Character> bracketStack = new Stack<>();
            char[] sArray = s.toCharArray();
            for(int i =0; i < sArray.length ; i ++){
                if(sArray[i] == '{'){
                    bracketStack.push('{');
                }else{
                    if(!bracketStack.isEmpty()){
                        bracketStack.pop();
                    }else{
                        return false;
                    }
                }
            }
            if(bracketStack.isEmpty()){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String testbal ="{{}}";
        String nonBal = "{}}";
        String bracketString = "{{{{}{{}}}}}";
        String uenven = "{{{{{{";
        String leftBalanced ="}}}}}}";
        String empty="";
        System.out.println(isBalanced(testbal));
        System.out.println(isBalanced(nonBal));
        System.out.println(isBalanced(bracketString));
        System.out.println(isBalanced(uenven));
        System.out.println(isBalanced(leftBalanced));
        System.out.println(isBalanced(empty));
    }
}
