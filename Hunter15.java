import java.io.*;
import java.util.*;

public class Hunter15{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        StringBuilder star=new StringBuilder();
        StringBuilder superStar=new StringBuilder();
        int n=input.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++) ar[i]=input.nextInt();
        for(int i=n-1;i>=0;i--){
            boolean isStar=true,isSuperStar=true;
            for(int j=n-1;j>i;j--){
                if(ar[i]<=ar[j]){
                    isStar=false;
                    break;
                }
            }
            if(isStar){
                star.append(" "+ar[i]);
                for(int j=i-1;j>=0;j--){
                    if(ar[i]<=ar[j]){
                        isSuperStar=false;
                        break;
                    }
                }
                if(isSuperStar) superStar.append(ar[i]);
            }
        }
        System.out.println(star.reverse()+"\n"+superStar);
        input.close();
    }
}