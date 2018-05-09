package AmazonPrepGeeks;


public class SumTwoOrThreeElementDivisbleBy3 {
    static int findPairs(int[] arr) {

            int N = arr.length;
            // Initialize groups to 0
            int C[] = {0, 0, 0};

            // Increment group with specified remainder
            for(int i = 0; i < N; i ++){
                ++C[arr[i]%3];
            }
            return C[1]*C[2] + C[0]*(C[0]-1)/2+
                    C[0]*(C[0]-1)*(C[0]-2)/6+
                    C[1]*(C[1]-1)*(C[1]-2)/6+
                    C[2]*(C[2]-1)*(C[2]-2)/6+
                    C[0]*C[1]*C[2];
        }

    public static void main(String[] args) {
        int[] inp = {1 ,5 ,7 ,2 ,9 ,14};
        System.out.println(findPairs(inp));
    }
}
