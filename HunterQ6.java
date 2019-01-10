import java.io.*;
import java.util.*;
public class HunterQ6{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] ar=new int[100001];
        for(int i=0;i<n;i++)
            ar[input.nextInt()]++;
        boolean flag=false;
        for(int i=0;i<n;i++)
            if(ar[i]>1){
                System.out.print(i+" ");
                flag=true;
            }
        if(!flag)
            System.out.println("unique");
        input.close();
    }
}