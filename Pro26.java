import java.io.*;
import java.util.*;

/**
 * Pro26
 */
public class Pro26 {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++)
            ar[i]=input.nextInt();
        System.out.println(LIS(ar));
    }
    public static int LIS(int[] ar){
        if(ar.length==0||ar.length==1)
            return ar.length;
        int[] _lis=new int[ar.length];
        Arrays.fill(_lis, 1);
        for (int i = 1; i < ar.length; i++) {
            for (int j = 0; j < i; j++) {
                if (ar[i]>ar[j] && _lis[i]<_lis[j]+1) {
                    _lis[i]=_lis[j]+1;
                }
            }
        }
        int ans=0;
        for(int ele:_lis)
            ans=Math.max(ans,ele);
        return ans;
    }
}