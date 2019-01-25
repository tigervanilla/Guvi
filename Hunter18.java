import java.io.*;
import java.util.*;

/**
 * Hunter18
 */
public class Hunter18 {

    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[][] mat=new int[n][n];
        for(int i=0;i<n;i++){
            String[] s=br.readLine().trim().split("\\s+");
            for(int j=0;j<s.length;j++){
                mat[i][j]=Integer.parseInt(s[j]);
            }
        }
        int island=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(mat[i][j]==0) continue;
                if(i==0 || (i!=0 && mat[i-1][j]==0)){
                    if(i==n-1 || (i!=n-1 && mat[i+1][j]==0)){
                        if(j==0 || (mat[i][j-1]==0)){
                            if(j==n-1 || (mat[i][j+1]==0)){
                                island++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(island);
    }
}