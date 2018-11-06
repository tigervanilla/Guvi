import java.util.*;

class MyComparator implements Comparator<Integer>{
    public int compare(Integer a,Integer b){
        return b.intValue()-a.intValue();
    }
}

public class PQExample{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(n,new MyComparator());
        int k=input.nextInt();
        for(int i=0;i<n;i++)
            pq.add(input.nextInt());
        for(int i=0;i<k;i++){
            pq.add(input.nextInt());
            System.out.print(pq.peek()+" ");
        }
        input.close();
    }
}