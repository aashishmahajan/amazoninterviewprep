package AmazonPrepGeeks;

import sun.jvmstat.perfdata.monitor.PerfStringVariableMonitor;

import java.util.Arrays;

/*
* Traverse the given number from rightmost digit, keep traversing till you find a digit which is smaller than
*   the previously traversed digit. For example, if the input number is “534976/ ”, we stop at 4 because 4
*   is smaller than next digit 9. If we do not find such a digit, then output is “Not Possible”.
*
* Now search the right side of above found digit ‘d’ for the smallest digit greater than ‘d’. For “534976″,
*
* the right side of 4 contains “976”. The smallest digit greater than 4 is 6.
*
* Swap the above found two digits, we get 536974 in above example.
*
* Now sort all digits from position next to ‘d’ to the end of number. The number that we get after
*   sorting is the output. For above example, we sort digits in bold 536974. We get “536479” which
*   is the next greater number for input 534976.
*/
public class NextGreaterNumberWithDigitsGeekSol {
    static void findNext(char[] c, int l){
        int i;

        for(i = l - 1; i > 0; i--){
            if(c[i] > c[i-1]){
                break;
            }
        }

        if(i == 0) {
            System.out.println("Not Possible");
            return;
        }else   {
            int x = c[i-1], min = i;
            for(int j = i+1; j < l; j++){
                if(c[j] > x && c[j]< c[min]){
                    // System.out.println(c[j] +":"+ x +","+c[j]+":"+c[min]);
                    min = j;
                }
            }

            swap(c, i -1, min);

            Arrays.sort(c,i,l);

            for(int k =0; k <l; k++){
                System.out.print(c[k]);
            }
        }
    }

    private static void swap(char[] c, int i, int min) {
        char tmp= c[i];
         c[i]= c[min];
         c[min] = tmp;
    }

    public static void main(String[] args) {
        int i = 534976;
        int i2 = 539476;
        char[] cin = (""+i).toCharArray();
        char[] cin2 = (""+i2).toCharArray();
        /*findNext(cin, cin.length);*/
        findNext(cin2, cin2.length);
    }
}
