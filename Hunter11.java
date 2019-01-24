import java.io.*;
import java.util.*;

public class Hunter11{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String input=br.readLine();
        StringTokenizer tokenizer=new StringTokenizer(input, " ");
        while (tokenizer.hasMoreTokens()) {
            sb.append(new StringBuilder(tokenizer.nextToken()).reverse()+" ");
        }
        System.out.println(sb);
    }
}