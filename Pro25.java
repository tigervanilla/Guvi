import java.io.*;
import java.util.*;

/**
 * Pro25
 */
public class Pro25 {

    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer tokenizer=new StringTokenizer(br.readLine());
        int[] ar=new int[n];
        for (int i = 0; i < n; i++) {
            ar[i]=Integer.parseInt(tokenizer.nextToken());
        }
        int ans=1,c=1;
        for(int i=0;i<n-1;i++){
            if(ar[i]<ar[i+1]){
                c++;
            }else{
                c=1;
            }
            ans=Math.max(ans, c);
        }
        System.out.println(ans);
    }
}