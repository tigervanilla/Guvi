import java.io.*;
import java.util.*;
/**
 * HunterQ9
 */
public class HunterQ9 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] ar=new int[n];
        for (int i = 0; i < n; i++) {
            ar[i]=input.nextInt();
        }
        int p=0,q=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp=ar[i]+ar[j];
                if(Math.abs(temp)<Math.abs(ar[p]+ar[q])){
                    p=i;
                    q=j;
                }
            }
        }
        System.out.println(ar[p]+" "+ar[q]);
        input.close();
    }
}