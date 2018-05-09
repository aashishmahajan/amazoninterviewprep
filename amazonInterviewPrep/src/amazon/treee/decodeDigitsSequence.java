package treee;

public class decodeDigitsSequence {

    static int decodeSequence(char[] digit, int length){

        if(length == 0 || length ==1) {
            return 1;
        }else{
            int count =0;
            if(digit[length-1] > '0'){
                count =decodeSequence(digit,length-1 );
            }

            if(digit[length-2] =='1' || digit[length-2]=='2' && digit[length-1] < '7'){
                count += decodeSequence(digit,length-2);
            }
            return count;
        }
    }
    public static void main(String[] args) {
        char digits[] = {'1', '2'};

        System.out.println(decodeSequence(digits, digits.length));
    }
}
