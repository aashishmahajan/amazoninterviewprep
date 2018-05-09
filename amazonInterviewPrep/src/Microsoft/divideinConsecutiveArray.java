package Microsoft;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class divideinConsecutiveArray {
    public static void main(String[] args) {
        int[] i ={1,2,2,3,5,4,4,3,5,6};
        divideInConsecutiveX(i,5);
    }

    private static void divideInConsecutiveX(int[] i, int x) {
        if (i.length%x != 0){
            System.out.println("Not Possible");;
            return;
        }
        List<Integer> copy= new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int min2 =min;
        for(int j =0; j <i.length; j++){
            copy.add(i[j]);
            if(i[j]<min){
                min2 = 2;
                min = i[j];
            }
        }
        int tmp =min;
        int loop=copy.size()/x;
        List<Integer> list = new LinkedList<>();
        for(int k=tmp; k< tmp+x; k++){
            if(copy.contains(k)){
                list.add(k);

            }else{
                System.out.println("Not Possible");
                break;
            }
        }
        int c =1;
        for(int k: list){
            System.out.print(k+" ");
            if(c%x==0){
                System.out.println("\n");
            }
            c++;


        }
    }
}
