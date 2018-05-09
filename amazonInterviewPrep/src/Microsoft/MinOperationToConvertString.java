package Microsoft;

public class MinOperationToConvertString {
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "azced";

        System.out.println(findShortOperation(s1.toCharArray(), s2.toCharArray(), s1.length(), s2.length()));
    }

    private static int findShortOperation(char[] str1, char[] str2, int length, int length1) {
        int temp[][] = new int[length+1][length1+1];

        for(int i = 0; i <= length1 ; i++) {
            temp[0][i] = i;
        }
        for(int i = 0; i <= length; i++) {
            temp[i][0] = i;
        }

        for(int i=1;i <=length; i++){
            for(int j=1; j <= length1; j++){
                if(str1[i-1] == str2[j-1]){
                    temp[i][j] = temp[i-1][j-1];
                }else{
                    temp[i][j] = 1 + Math.min(Math.min(temp[i-1][j-1], temp[i-1][j]), temp[i][j-1]);
                }
            }
        }
        searchFunction(temp, str1, str2);

        return temp[length][length1];
    }

    private static void searchFunction(int[][] temp, char[] str1, char[] str2) {
        int i = str1.length;
        int j = str2.length;
        System.out.println(i + " " + j);
        while(true){
            if( i == 0 || j == 0) {
                break;
            }
            else if(str1[i-1] == str2[j-1]){
                i = i-1;
                j = j-1;
            }else if (temp[i][j] == temp[i-1][j-1] + 1){
                System.out.println(str2[j-1] +" edit to "+str1[i-1]);
                i =i-1;
                j =j-1;
            }else if (temp[i][j] == temp[i-1][j] + 1 ){
                System.out.println(str2[j-1] +" delete to "+str1[i-1]);
                i =i-1;
            }else if (temp[i][j] == temp[i][j-1]){
                System.out.println(str2[j-1] +" insert to "+str1[i-1]);
                j =j-1;
            }else{
                System.out.println("Illegal");
            }

        }
    }
}
