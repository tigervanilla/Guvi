import java.io.*;
import java.util.*;

/**
 * Pro12
 */
public class Pro12 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt(), k=input.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++)
            ar[i]=input.nextInt();
        while(k-->0){
            int sum=0;
            for(int u=input.nextInt()-1,v=input.nextInt()-1;u<=v;u++)
                sum+=ar[u];
            System.out.println(sum);
        }
        input.close();
    }
}