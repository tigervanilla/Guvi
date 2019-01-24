import java.io.*;
import java.util.*;

/**
 * Hunter12
 */
public class Hunter12 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int k=input.nextInt();
        PriorityQueue<Integer> maxHeap=new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<n;i++) maxHeap.add(input.nextInt());
        for(;k>1;k--) maxHeap.poll();
        System.out.println(maxHeap.poll());
        input.close();
    }
}