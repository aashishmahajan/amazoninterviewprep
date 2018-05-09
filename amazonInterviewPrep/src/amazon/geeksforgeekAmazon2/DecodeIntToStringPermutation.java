package geeksforgeekAmazon2;

/*
 * so the logic is :
 * any number 1 - 6: can have 2 possible combination : as in single or combine two character
 * 7-9 cannot be done,
 *
 * 26 character , hence the sequence maintainece
 *
 * */

public class DecodeIntToStringPermutation {


    public static void main(String[] args) {
        int inp = 120;
        char[] c = (""+inp).toCharArray();
        System.out.println(countPerm(c, c.length));
    }

    private static int countPerm(char[] digits, int n)
        {
            // base cases
            if (n == 0 || n == 1)
                return 1;

            // Initialize count
            int count = 0;

            // If the last digit is not 0, then
            // last digit must add to
            // the number of words
            if (digits[n - 1] > '0')
                count = countPerm(digits, n - 1);

            // If the last two digits form a number
            // smaller than or equal to 26,
            // then consider last two digits and recur
            if (digits[n - 2] == '1' ||
                    (digits[n - 2] == '2' && digits[n - 1] < '7'))
                count += countPerm(digits, n - 2);

            return count;
    }
}
