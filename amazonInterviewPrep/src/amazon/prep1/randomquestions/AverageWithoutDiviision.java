package prep1.randomquestions;

public class AverageWithoutDiviision {
    private static int calculateFloorAverageWithoutDivision(int a, int b){
        int diff=0;
        int max=0;
        int low=0;
        if(a != b){
            if(a>b){
                diff = a-b;
                max=a;
                low=b;
            }else{
                diff = b-a;
                max=b;
                low=a;
            }
            while( diff > 1 ){
                low++;
                max--;
                diff = diff-2;
            }return low;
        }else{
            return a;
        }
    }
    public static void main(String[] args) {
        System.out.println(calculateFloorAverageWithoutDivision(10,15));
        System.out.println(calculateFloorAverageWithoutDivision(11,15));
    }
}
