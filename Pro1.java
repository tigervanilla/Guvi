import java.io.*;
import java.util.*;

public class Pro1{
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int m=Integer.MAX_VALUE;
        String[] s=new String[n];
        for (int i = 0; i < n; i++) {
            s[i]=br.readLine();
            m=Math.min(m, s[i].length());
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<m;i++){
            char ch=s[0].charAt(i);
            boolean f=true;
            for(int j=1;j<n;j++){
                if(s[j].charAt(i)!=ch)
                    f=false;
            }
            if(f)
                sb.append(ch);
            else
                break;
        }
        System.out.println(sb);
    }
}