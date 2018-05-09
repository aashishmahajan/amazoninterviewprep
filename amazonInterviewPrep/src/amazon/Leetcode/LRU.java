package Leetcode;

import java.util.*;

public class LRU {
    public static void main(String[] args) {
        int[] inp={1, 2, 3, 4, 1, 2, 5, 1, 2, 3, 4, 5, 7};
        implementLRU(inp, 3);
       /* queLRU(inp, 3);*/
    }

    private static void implementLRU(int[] inp, int size) {
        Map<Integer,Integer> used = new LinkedHashMap<>(3);
        int i=0;
        while(i < inp.length){
            if(used.containsKey(inp[i])){
                int tmp = used.get(inp[i])+1;
                used.remove(inp[i]);
                used.put(inp[i],tmp);
                System.out.println(inp[i]+" already in cache ");
            }else{
                if(used.size()==size){
                    System.out.println("removed :"+inp[i-size]);
                    used.remove(inp[i-size]);
                    used.put(inp[i],1);
                }else{
                    System.out.println(inp[i]+" added in cache");
                    used.put(inp[i],1);
                }
            }
            i++;
        }
    }

    static void queLRU(int[] inp, int lrUPg){
        Queue<Integer> q= new PriorityQueue<>();
        int i=0;
        while(i < inp.length){
            if(q.contains(inp[i])){
                System.out.println("cache already contains :"+inp[i]);
            }else{
                if(q.size() == lrUPg){
                    q.poll();
                    q.add(inp[i]);
                }else{
                    System.out.println("cache added :"+inp[i]);
                    q.add(inp[i]);
                }
            }
            i++;
        }
    }


}
