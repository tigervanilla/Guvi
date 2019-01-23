import java.io.*;
import java.util.*;
public class HunterQ8{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++)
            ar[i]=input.nextInt();
        for(int k=0;k<n;k++)
            for(int j=0;j<k;j++)
                for(int i=0;i<j;i++)
                    if(ar[i]+ar[j]==ar[k])
                        System.out.println(ar[i]+" "+ar[j]+" "+ar[k]);
        input.close();
    }
}