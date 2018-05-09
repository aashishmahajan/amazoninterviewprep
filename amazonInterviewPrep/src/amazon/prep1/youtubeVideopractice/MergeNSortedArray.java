package prep1.youtubeVideopractice;
/*
 * we have array array for sorted array, now merge them
 * 1. option: iterate all the elements and create an array, and use merge sort,
 * kn*log(nk)
 *
 * 2. use a custom priority queue, that keeps a track of bringing a new element from
 * array once the element from that particular array isremoved
 *
 * */

import java.util.PriorityQueue;

public class MergeNSortedArray {
    static class QueueNode implements Comparable<QueueNode>{
        int array, index, value;

        QueueNode(int array, int index, int value) {
            this.array = array;
            this.index = index;
            this.value = value;
        }

        @Override
        public int compareTo(QueueNode q){
            if (this.value > q.value)  return 1;
            if (this.value < q.value) return -1;
            return 0;
        }
    }

    public int[] mergeKArray(int[][] inp){
        if(inp.length ==0){
            return new int []{};
        }

        PriorityQueue<QueueNode> pq = new PriorityQueue<>();
        int size =0;
        for(int i =0; i < inp.length; i++){
            size += inp[i].length;
            if(inp[i].length > 0){
                pq.add(new QueueNode(i, 0, inp[i][0]));
            }
        }
        int[] result = new int[size];
        // to avoid writing a while loop
        for(int i =0; !pq.isEmpty(); i++){
            QueueNode q = pq.poll();
            result[i] = q.value;
            int ind = q.index+1;
            if(ind < inp[q.index].length){
                pq.add(new QueueNode(q.array, ind, inp[q.array][ind ]));
            }
        }




        return null;
    }

    public static void main(String[] args) {
        /*int[] inpt = new int[]{1,2,3}, {7,8,9}, {4,5,6}};*/
    }
}
