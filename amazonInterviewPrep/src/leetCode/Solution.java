package leetCode;

import java.util.LinkedList;
import java.util.List;

class Solution {
    static public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>  list= new LinkedList<>();
        int i = left;
        while(i <= right) {
            char[] c= (""+i).toCharArray();
            int j=0;
            boolean flag = true;
            while(j< c.length)    {
                int k = Integer.parseInt(""+c[j]);
                j++;
                if(k==0 || i%k != 0){
                    flag = false;
                }
            }
            if(flag){
                list.add(i);
            }
            i++;

        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list= selfDividingNumbers( 1,22);
        for(int i: list){
            System.out.println(i);
        }
    }
}
