import java.io.*;
import java.util.*;

public class Pro3{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String word1=br.readLine();
        String word2=br.readLine();
        int M=word1.length();
        int N=word2.length();
        int edit[][] = new int[M+1][N+1];
        for (int i=0; i<=M; i++){
            for (int j=0; j<=N; j++){
                if (j==0)
                    edit[i][j] = i;                  										     
                else if (i==0)
                    edit[i][j] = j; 
                else if (word1.charAt(i-1) == word2.charAt(j-1))
                    edit[i][j] = edit[i-1][j-1];
                else
                    edit[i][j] = 1 + min(edit[i-1][j-1],edit[i-1][j],edit[i][j-1]);
            }
        }
        System.out.println(edit[M][N]);
    }
    static int min(int x,int y,int z)
    {
        if (x <= y && x <= z) 
        	return x;
        if (y <= x && y <= z) 
        	return y;
        else 
        	return z;
    }
}