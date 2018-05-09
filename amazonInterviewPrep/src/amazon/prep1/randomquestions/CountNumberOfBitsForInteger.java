package prep1.randomquestions;

public class CountNumberOfBitsForInteger {

    private static int generateBit(int input){

        // initialize the result
        int bitCount = 0;

        for (int i = 1; i <= input; i++)
            bitCount += countSetBitsUtil(i);

        return bitCount;
    }

    // A utility function to count set bits
    // in a number x
    static int countSetBitsUtil( int x)
    {
        if (x <= 0)
            return 0;
        return (x % 2 == 0 ? 0 : 1) +
                countSetBitsUtil(x / 2);
    }

    public static void main(String[] args) {
        int input1 = 7;
        /*int input2 = 11;
        int input3 = 14;*/
        System.out.println(generateBit(7));

    }
}
