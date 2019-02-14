import java.io.*;
import java.util.*;

public class Pro21{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt(),sum=0;
        int[] ar=new int[n];
        for (int i = 0; i < n; i++) {
            ar[i]=input.nextInt();
            sum+=ar[i];
        }
        int lsum=0,rsum=0;
        for(int i=0;i<n;i++){
            lsum+=ar[i];
            rsum=sum-lsum;
            try{
                if(lsum/(i+1)==rsum/(n-i-1)){
                    System.out.println("YES");
                    break;
                }
            }catch(Exception e){System.out.println("NO");}
        }
        input.close();
    }
}